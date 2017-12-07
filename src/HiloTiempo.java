
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDialog;

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
    ArrayList<Productos> productos = new ArrayList();
    ArrayList<Cajeros> cajeros = new ArrayList();
    ArrayList clientes = new ArrayList();
    boolean avanzar;
    int itemProductos;
    int itemCajeros;
    int itemCliente;

    public HiloTiempo(int segundos,JDialog ventana, ArrayList<Productos> productos, ArrayList<Cajeros> cajeros, ArrayList clientes) {
        this.avanzar = true;
        this.segundos = segundos;
        this.ventana = ventana;
        this.productos = productos;
        this.cajeros = cajeros;
        this.clientes = clientes;
    }
    
    public HiloTiempo(int segundos, int itemProductos, int itemCajeros,JDialog ventana, ArrayList<Productos> productos, ArrayList<Cajeros> cajeros, ArrayList clientes) {
        this.avanzar = true;
        this.segundos = segundos;
        this.ventana = ventana;
        this.productos = productos;
        this.cajeros = cajeros;
        this.clientes = clientes;
        this.itemCajeros = itemCajeros;
        this.itemProductos = this.itemCajeros;
    }

    @Override
    public void run() {
        int seg = 0;
        while (true) {
            if (avanzar) {
            seg++;
            System.out.println(seg);
            try {
                Thread.sleep(999);
            } catch (InterruptedException ex) {

            }
            if (seg == segundos) {
                avanzar= false;
                seg = 0;
                
                
                
                
            }
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

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public void setCajeros(ArrayList<Cajeros> cajeros) {
        this.cajeros = cajeros;
    }

    public void setClientes(ArrayList clientes) {
        this.clientes = clientes;
    }
    
    

}
