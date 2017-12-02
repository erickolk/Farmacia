package receita;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

        public class CriarReceita extends JFrame{
            
            private JTextField nomeF;
            private JTextField crmM;
            private JTextField nomeFP;
            private JTextField susP;
            private JTextField nomeR;
            private JTextField quanR;
            
           public CriarReceita(){
               super("Criar Receita");
               
               criarMenu();
               criarFormulário();
               
           }
            
           private void criarMenu(){
               
               JMenu menuMedico = new JMenu("Receita");
               
               NovoAction novoAction = new NovoAction();
               
               FecharAction fecharAction = new FecharAction();
               
               AvancarAction avancarAction = new AvancarAction();
               
               JMenuItem menuItemNovo = new JMenuItem("Novo");
               menuItemNovo.addActionListener(novoAction);
               menuMedico.add(menuItemNovo);
               
               SalvarAction salvarAction = new SalvarAction();
               
               
               JMenuItem menuItemSalvar = new JMenuItem("Salvar");
               menuItemSalvar.addActionListener(salvarAction);
               menuMedico.add(menuItemSalvar);
               
               JMenuItem menuItemFechar = new JMenuItem("Fechar");
               
               menuItemFechar.addActionListener(fecharAction);
               
               menuMedico.add(menuItemFechar);
               
               JMenuBar barra = new JMenuBar();
               
               setJMenuBar(barra);
               
               barra.add(menuMedico);
               
           }

    private void criarFormulário() {
        setLayout(new BorderLayout());
        
        JPanel painelTitulo = new JPanel();
        painelTitulo.setLayout(new FlowLayout());
        JLabel tituloJanela = new JLabel();
        painelTitulo.add(tituloJanela);
        
        JPanel painelCadastro = new JPanel();
        painelCadastro.setLayout(new FlowLayout());
        
        JLabel nomeM = new JLabel("Medico :");
        nomeF = new JTextField(40);
        
        JLabel crm = new JLabel("Crm :");
        crmM = new JTextField(40);
        
        JLabel nomeP = new JLabel("Paciente :");
        nomeFP = new JTextField(40);
        
        JLabel sus = new JLabel("SUS :");
        susP = new JTextField(40);
        
        JLabel remedio = new JLabel("Remedio :");
        nomeR = new JTextField(40);
        
        JLabel quantR = new JLabel("Quantidade :");
        quanR = new JTextField(40);
        
        painelCadastro.add(nomeM);
        painelCadastro.add(nomeF);
        painelCadastro.add(crm);
        painelCadastro.add(crmM);
        painelCadastro.add(nomeP);
        painelCadastro.add(nomeFP);
        painelCadastro.add(sus);
        painelCadastro.add(susP);
        painelCadastro.add(remedio);
        painelCadastro.add(nomeR);
        painelCadastro.add(quantR);
        painelCadastro.add(quanR);
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());
        
        JButton botaoSalvar = new JButton("Salvar");
        
        SalvarAction salvarAction = new SalvarAction();
        botaoSalvar.addActionListener(salvarAction);
        
        JButton botaoFechar = new JButton("Fechar");
        FecharAction fecharAction = new FecharAction();
        botaoFechar.addActionListener(fecharAction);
        
        JButton proximaTela = new JButton("Avançar");
        AvancarAction avancarAction = new AvancarAction();
        proximaTela.addActionListener(avancarAction);
        
        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoFechar);
        painelBotoes.add(proximaTela);
        
        add(painelTitulo, BorderLayout.NORTH);
        add(painelCadastro, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    
    }
        
        private class NovoAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nomeF.setText(" ");
            crmM.setText(" ");
            
        }
            
        }
        
        private class FecharAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
            
        }
            
        }
        
        private class AvancarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            
            
          
            dispose();
            
           
        }
            
            
        }
        
        private class SalvarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Cadastro", JOptionPane.PLAIN_MESSAGE);
        }
            
        }
        
        
        }
