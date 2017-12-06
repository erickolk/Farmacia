/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Paciente;
import database.ConexaoMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author João Batista
 */
public class PacienteDAO {
    public void salvar(Paciente paciente) {
        Connection conexao = ConexaoMysql.getConexao();

        PreparedStatement preparador = null;

        //SQL para inserção no banco de dados
        String sql = "INSERT INTO pacientes "
                + "(nome,sus, rg)"
                + "values (?, ?, ?);";
        try {
            //Prepara os dados substituindo as ? pelos valores
            preparador = conexao.prepareStatement(sql);
            preparador.setString(1, paciente.getNome());
            preparador.setString(2, paciente.getSus());
            preparador.setString(3, paciente.getRg());

            //Executa o SQL preparado
            preparador.executeUpdate();

            //Exibe uma mensagem de sucesso!
            JOptionPane.showMessageDialog(null, "Paciente salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao salvar paciente!");
        } finally {
            //Fecha a conexão
            ConexaoMysql.closeConnection(conexao);
        }
    }
    
}
