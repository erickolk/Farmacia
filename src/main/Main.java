package main;

import classes.Medico;
import classes.Paciente;
import dao.MedicoDAO;
import dao.PacienteDAO;
import database.ConexaoMysql;
import java.sql.Connection;
import telas.GraficoReceita;

import javax.swing.JFrame;
import telas.JanelaFarmaceuticoCriar;
import telas.JanelaPacienteCriar;
import telas.JanelaReceitaCriar;
import telas.MenuInicial;

public class Main {

    public static void main(String[] args) {

//        JanelaPacienteCriar janelapaciente = new JanelaPacienteCriar();
//        janelapaciente.setVisible(true);

        
        PacienteDAO pdao = new PacienteDAO();
        Paciente paciente = pdao.buscar("rg", "16272443");
        
        MedicoDAO mdao = new MedicoDAO();
        Medico medico = mdao.buscar("login", "medico");
        
        System.out.println(medico);
        System.out.println(paciente);

    }

}
