
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
    
   ArrayList<Ordenes> ordenes = new ArrayList();

    public Cajeros(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        
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
    

    

    @Override
    public String toString() {
        return nombre;
    }
   
   
}
