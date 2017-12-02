package receita;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
				
		Medico m = new Medico("112");
		
		Receita r = m.emitirReceita("dskdaç", "425",m.getCrm());
		Receita r1 = m.emitirReceita("dskdaç", "222",m.getCrm());
		Farmacia f = new Farmacia();
		f.delete("222");
		



			    GraficoReceita graficoReceita = new GraficoReceita();
                CriarReceita criarReceita = new CriarReceita();
                GraficoMenu graficoMenu = new GraficoMenu();


			    graficoMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                graficoMenu.setSize(530, 300);
                graficoMenu.setVisible(true);
		
		
		
		
	}

}
