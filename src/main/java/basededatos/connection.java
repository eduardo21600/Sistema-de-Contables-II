/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Pablo
 */
public class connection 
{
    Connection cn;
    ResultSet rs;
    
    public Statement conexion()
    {        
        Statement st=null;
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String dburl="agenciadeviajes.accdb";
            cn = DriverManager.getConnection("jdbc:ucanaccess://"+dburl);
            try 
            {
                st=cn.createStatement();
                return st;
            } catch (Exception e) 
            {
                System.out.println("The following error ocurred: "+e);
            }
        }
        catch(Exception e)
        {
            System.out.println("The followin error has ocurred: "+e);
        }
        return st;
    }
}
