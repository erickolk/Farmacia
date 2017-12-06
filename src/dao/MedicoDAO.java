/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Medico;
import database.ConexaoMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author João Batista
 */
public class MedicoDAO {

    public void salvar(Medico medico) {
        Connection conexao = ConexaoMysql.getConexao();

        PreparedStatement preparador = null;

        //SQL para inserção no banco de dados
        String sql = "INSERT INTO medicos "
                + "(nome, crm, login, senha, rg, area)"
                + "values (?, ?, ?, ?, ?, ?);";
        try {
            //Prepara os dados substituindo as ? pelos valores
            preparador = conexao.prepareStatement(sql);
            preparador.setString(1, medico.getNome());
            preparador.setString(2, medico.getCrm());
            preparador.setString(3, medico.getLogin());
            preparador.setString(4, medico.getSenha());
            preparador.setString(5, medico.getRg());
            preparador.setString(6, medico.getArea());

            //Executa o SQL preparado
            preparador.executeUpdate();

            //Exibe uma mensagem de sucesso!
            JOptionPane.showMessageDialog(null, "Médico salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar médico!");
        } finally {
            //Fecha a conexão
            ConexaoMysql.closeConnection(conexao);
        }
    }
}
