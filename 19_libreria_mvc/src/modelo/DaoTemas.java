/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import javabeans.Tema;

/**
 *
 * @author Profesortarde
 */
 public class DaoTemas {
	 
 
    public List<Tema> obtenerTemas(){
        List<Tema> lista=new ArrayList<> ();
           
        try(Connection cn=Datos.obtenerConexion();) {                       
            //Paso 2: Envio SQL
            String sql="select * from temas";
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);            
            while(rs.next()){
                lista.add(new Tema(rs.getInt("idTema"),rs.getString("tema")));
            }
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }   
        return lista;
    }
}
