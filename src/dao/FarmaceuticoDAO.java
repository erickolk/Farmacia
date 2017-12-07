/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Farmaceutico;
import database.ConexaoMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author João Batista
 */
public class FarmaceuticoDAO {
    
    private String table_name = "farmaceuticos";
    
    public Farmaceutico buscar(String campo, String valor) {
        
        String sql = "SELECT * from " + this.table_name + " where " + campo + " = ?";
        PreparedStatement preparador = null;
        ResultSet result = null;
        Connection conexao = ConexaoMysql.getConexao();
        Farmaceutico farmaceutico = null;
        
        try {
            
            preparador = conexao.prepareStatement(sql);
            preparador.setString(1, valor);
            result = preparador.executeQuery();
            
            while(result.next())
            {
                farmaceutico = new Farmaceutico(result.getInt("id"), result.getString("login"), result.getString("senha"), result.getString("nome"), result.getString("rg"));
            }
            
        } catch (Exception e) {
            
            System.out.print(e.getMessage());
            
        } finally {
            return farmaceutico;
        }
     
    }
    
    public void salvar(Farmaceutico farmaceutico) {
        Connection conexao = ConexaoMysql.getConexao();

        PreparedStatement preparador = null;

        //SQL para inserção no banco de dados
        String sql = "INSERT INTO farmaceuticos "
                + "(nome, login, senha, rg)"
                + "values (?, ?, ?, ?);";
        try {
            //Prepara os dados substituindo as ? pelos valores
            preparador = conexao.prepareStatement(sql);
            preparador.setString(1, farmaceutico.getNome());
            preparador.setString(2, farmaceutico.getLogin());
            preparador.setString(3, farmaceutico.getSenha());
            preparador.setString(4, farmaceutico.getRg());

            //Executa o SQL preparado
            preparador.executeUpdate();

            //Exibe uma mensagem de sucesso!
            JOptionPane.showMessageDialog(null, "Farmaceutico salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao salvar farmaceutico!");
        } finally {
            //Fecha a conexão
            ConexaoMysql.closeConnection(conexao);
        }
    }
}
