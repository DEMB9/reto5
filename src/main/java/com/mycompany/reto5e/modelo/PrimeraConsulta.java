/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5e.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class PrimeraConsulta {
    
    public void primeraconsulta(DefaultTableModel modelo){
        
        Lider lider = new Lider();
        
        try{
            //establecer la conexion a la database
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();
            
            //Cadena de consulta
            
            String sql = "SELECT ID_Lider AS ID, Nombre AS Nombre, Primer_Apellido AS Apellido, Ciudad_Residencia AS City\n" +
                         "FROM Lider AS l\n" +
                         "ORDER BY City;";
            Statement query = cn.createStatement();
            ResultSet result = query.executeQuery(sql);
            
            
            while (result.next()){
                lider.setId_lider(result.getInt(1));
                lider.setNombre(result.getString(2));
                lider.setApellido(result.getString(3));
                lider.setCiudad_residencia(result.getString(4));
                //Adicionar info de la database
                modelo.addRow(new Object[]{lider.getId_lider(), lider.getNombre(), lider.getApellido(), lider.getCiudad_residencia()});
                
            }
            
            //cerrar
            result.close();
            query.close();
            
        }catch (SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrimeraConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
