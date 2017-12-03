package main;

import classes.Medico;
import dao.MedicoDAO;
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
        JanelaPacienteCriar janelapaciente = new JanelaPacienteCriar();
        janelapaciente.setVisible(true);
    }

}
