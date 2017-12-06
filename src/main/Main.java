package main;

import classes.Medico;
import dao.MedicoDAO;
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
//        JanelaMedicoCriar janelamedico = new JanelaMedicoCriar();
//        janelamedico.setVisible(true);

//        JanelaFarmaceuticoCriar janelafarmaceutico = new JanelaFarmaceuticoCriar();
//        janelafarmaceutico.setVisible(true);
        MenuInicial janelareceita = new MenuInicial();
        janelareceita.setVisible(true);
    }

}
