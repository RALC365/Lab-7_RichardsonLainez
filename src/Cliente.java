/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RALC
 */
public class Cliente {
    private String nombre;
    private int edad;
    private Ordenes orden;

    public Cliente() {
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    
    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Cliente(String nombre, int edad, Ordenes orden) {
        this.nombre = nombre;
        this.edad = edad;
        this.orden = orden;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
