package receita;

import java.util.Vector;

public class Medico{
	private String nome;
	private String crm;
	private String sus;
	
	public Vector<String>medico = new Vector<String>();
	
	
	public Medico(String crm) {
		this.setCrm(crm);
	}

    Medico() {
        
    }
	
	
	public Receita emitirReceita(String nomeMed,String sus,String crm) {		
		return new Receita(nomeMed,sus,crm);
		
	}
        public String getNome(){
            return nome;
            
        }


	public String getCrm() {
		return crm;
	}


	public void setCrm(String crm) {
		this.crm = crm;
		

}


	public String getSus() {
		return sus;
	}


	public void setSus(String sus) {
		this.sus = sus;
	}
	}
