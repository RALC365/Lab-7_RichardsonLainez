
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RALC
 */
public class Cajeros {
    private String nombre;
    private int id;
    private JDialog ventana;
    
   ArrayList<Ordenes> ordenes = new ArrayList();

    public Cajeros(String nombre, int id, JDialog ventana) {
        this.nombre = nombre;
        this.id = id;
        this.ventana = ventana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Ordenes> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Ordenes> ordenes) {
        this.ordenes = ordenes;
    }

    public JDialog getVentana() {
        return ventana;
    }

    public void setVentana(JDialog ventana) {
        this.ventana = ventana;
    }
    

    

    @Override
    public String toString() {
        return nombre;
    }
   
   
}
