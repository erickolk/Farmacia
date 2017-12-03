/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author João Batista
 */
public class ConexaoMysql {
    
    private static String DRIVE = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/farmacia";
    private static String USUARIO = "root";
    private static String SENHA =  "";
    
    public static Connection getConexao()
    {
        Connection conexao = null;
        
        try {
            Class.forName(DRIVE);
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conectado com sucesso!");
        } catch (SQLException | ClassNotFoundException ex) {
             Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexao;
    }
    
    public static void closeConnection(Connection conexao)
    {
        if(conexao != null){
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
