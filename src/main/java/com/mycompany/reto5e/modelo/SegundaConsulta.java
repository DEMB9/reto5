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
public class SegundaConsulta {
    
    public void segundaconsulta(DefaultTableModel modelo){
        
        Proyectos proyecto = new Proyectos();
        
        try{
            //establecer la conexion a la database
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();
            
            //Cadena de consulta
            
            String sql = "SELECT ID_Proyecto AS ID, Constructora AS Constructora, Numero_Habitaciones AS Numero_Habitaciones, Ciudad AS Ciudad  \n" +
                            "FROM Proyecto AS p\n" +
                            "WHERE Clasificacion = 'Casa Campestre' AND (Ciudad = 'Santa Marta' OR Ciudad = 'Barranquilla' OR Ciudad = 'Cartagena');";
            Statement query = cn.createStatement();
            ResultSet result = query.executeQuery(sql);
            
            
            while (result.next()){
           
                proyecto.setId_proyecto(result.getInt(1));
                proyecto.setConstructora(result.getString(2));
                proyecto.setNumero_habitaciones(result.getInt(3));
                proyecto.setCiudad(result.getString(4));
               
                //Adicionar info de la database
                modelo.addRow(new Object[]{proyecto.getId_proyecto(), proyecto.getConstructora(), proyecto.getNumero_habitaciones(), proyecto.getCiudad()});
                
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
