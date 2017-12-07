package main;

import classes.Medico;
import classes.Paciente;
import controllers.LoginFarmaceuticoController;
import controllers.LoginMedicoController;
import dao.MedicoDAO;
import dao.PacienteDAO;
import database.ConexaoMysql;
import java.sql.Connection;
import telas.GraficoReceita;

import javax.swing.JFrame;
import telas.JanelaFarmaceuticoCriar;
import telas.JanelaMenuEntrar;
import telas.JanelaPacienteCriar;
import telas.JanelaReceitaCriar;
import telas.MenuInicial;

public class Main {

    public static void main(String[] args) {
        
        JanelaMenuEntrar jme = new JanelaMenuEntrar();
        jme.setVisible(true);
        
        String login = "jose";
        String senha = "1234";
        LoginFarmaceuticoController lmc = new LoginFarmaceuticoController();
        
        if(lmc.autenticar(login, senha) !=  null) {
            System.out.println("Autenticado com sucesso!");
        }
        else {
            System.out.println("Credenciais invalidas!");
        }

    }

}
