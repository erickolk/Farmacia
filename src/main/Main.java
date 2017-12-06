package main;

import classes.Medico;
import classes.Paciente;
import dao.MedicoDAO;
import dao.PacienteDAO;
import database.ConexaoMysql;
import java.sql.Connection;
import telas.GraficoReceita;
import telas.GraficoMenu;
import javax.swing.JFrame;
import telas.JanelaFarmaceuticoCriar;
import telas.JanelaPacienteCriar;

public class Main {

    public static void main(String[] args) {
//        JanelaMedicoCriar janelamedico = new JanelaMedicoCriar();
//        janelamedico.setVisible(true);

//        JanelaFarmaceuticoCriar janelafarmaceutico = new JanelaFarmaceuticoCriar();
//        janelafarmaceutico.setVisible(true);
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
