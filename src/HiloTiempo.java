
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RALC
 */
public class HiloTiempo extends Thread {

    JDialog ventana;
    int segundos;
//    ArrayList<Productos> productos = new ArrayList();
//    ArrayList<Cajeros> cajeros = new ArrayList();
    ArrayList clientes = new ArrayList();
    boolean avanzar;
    DefaultTableModel dtm;
    Cliente cliente;
    Productos productos;
    Cajeros cajero;

    public HiloTiempo(JDialog ventana, int segundos, boolean avanzar, DefaultTableModel dtm, Cliente cliente, Productos productos, Cajeros cajero) {
        this.ventana = ventana;
        this.segundos = segundos;
        this.avanzar = avanzar;
        this.dtm = dtm;
        this.cliente = cliente;
        this.productos = productos;
        this.cajero = cajero;
    }
    
    
   
    
    

    @Override
    public void run() {
//        int i = 0;
        
        int seg = 0;
        while (true) {
            if (avanzar) {
                seg++;
                System.out.println(seg);
                try {
                    Thread.sleep(999);
                } catch (InterruptedException ex) {

                }
//                if (i == 0) {
//                    String[] columnNames = {"Producto", "Cliente", "Apto",};
//                    Object[][] datos = null;
//                    dtm= new DefaultTableModel(datos,columnNames);
//                    i=1;
//                }
            }
            if (seg == segundos) {
                avanzar = false;
                seg = 0;
                Object[] newRow={this.productos, this.cliente, segundos};
                dtm.addRow(newRow);
            }
        }

    }

    public void setAvanzar(boolean x) {
        this.avanzar = x;

    }

    public void setVentana(JDialog ventana) {
        this.ventana = ventana;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }


    public void setClientes(ArrayList clientes) {
        this.clientes = clientes;
    }

}
