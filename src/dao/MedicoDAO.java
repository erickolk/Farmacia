
package dao;

import classes.Medico;
import classes.Paciente;
import database.ConexaoMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MedicoDAO {
    
    private String table_name = "medicos";
    
    public Medico buscar(String campo, String valor) {
        
        String sql = "SELECT * from " + this.table_name + " where " + campo + " = ?";
        PreparedStatement preparador = null;
        ResultSet result = null;
        Connection conexao = ConexaoMysql.getConexao();
        Medico medico = null;
        
        try {
            
            preparador = conexao.prepareStatement(sql);
            preparador.setString(1, valor);
            result = preparador.executeQuery();
            
            while(result.next())
            {
                medico = new Medico(result.getInt("id"), result.getString("nome"), result.getString("crm"), result.getString("rg"),result.getString("area"), result.getString("login"), result.getString("senha"));
            }
            
        } catch (Exception e) {
            
            System.out.print(e.getMessage());
            
        } finally {
            return medico;
        }
     
    }
    
    
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
