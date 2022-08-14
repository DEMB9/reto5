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
public class TerceraConsulta {
    
    public void terceraconsulta(DefaultTableModel modelo){
        
        Proveedor proveedor = new Proveedor();
        
        try{
            //establecer la conexion a la database
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();
            
            //Cadena de consulta
            
            String sql = "SELECT ID_Compra AS ID_compra, Constructora AS Constructora, Banco_Vinculado AS Banco FROM Compra AS c\n" +
                         "INNER JOIN Proyecto p\n" +
                          "ON c.ID_Proyecto  = p.ID_Proyecto\n" +
                          "WHERE Proveedor = 'Homecenter' AND (Ciudad = 'Salento');";
            Statement query = cn.createStatement();
            ResultSet result = query.executeQuery(sql);
            
            
            while (result.next()){
                proveedor.setId_compra(result.getInt(1));
                proveedor.setConstructora(result.getString(2));
                proveedor.setBanco(result.getString(3));
                
                //Adicionar info de la database
                modelo.addRow(new Object[]{proveedor.getId_compra(), proveedor.getConstructora(), proveedor.getBanco()});
                
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
