/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5e.modelo;

/**
 *
 * @author david
 */
public class Proveedor {
    //atributos
    private int id_compra;
    private String constructora;
    private String banco;

    public Proveedor() {
    }

    public Proveedor(int id_compra, String constructora, String banco) {
        this.id_compra = id_compra;
        this.constructora = constructora;
        this.banco = banco;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id_compra=" + id_compra + ", constructora=" + constructora + ", banco=" + banco + '}';
    }
    
    
    
    
}
