
package com.mycompany.reto5e.modelo;


public class Lider {
    //Atributos clase Lider
    private int id_lider;
    private String nombre;
    private String apellido;
    private String ciudad_residencia;
    
    //Metodos constructor - Sobrecarga de Metodos

    public Lider() {
        
    }

    public Lider(int id_lider, String nombre, String apellido, String ciudad_residencia) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad_residencia = ciudad_residencia;
    }

    public int getId_lider() {
        return id_lider;
    }

    public void setId_lider(int id_lider) {
        this.id_lider = id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad_residencia() {
        return ciudad_residencia;
    }

    public void setCiudad_residencia(String ciudad_residencia) {
        this.ciudad_residencia = ciudad_residencia;
    }

    @Override
    public String toString() {
        return "Lider{" + "id_lider=" + id_lider + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad_residencia=" + ciudad_residencia + '}';
    }
    
    
    
    
    
    
}
