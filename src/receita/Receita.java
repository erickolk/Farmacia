package receita;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Receita {
	
	private String nomeMed;
	public String sus;
	private String crm;
	private BufferedReader br;
	
	public Receita(String nomeMed,String sus,String crm) {
				
		try {
		FileWriter rc = new FileWriter(sus+".txt"); 
		this.setNomeMed(nomeMed);
		rc.write("Medicamento: "+ nomeMed+"\n");
		this.setSus(sus);
		rc.write("SUS: "+ sus+"\n");
		this.setCrm(crm);
		rc.write("CRM: "+ crm+"\n");
		
		rc.close();}
		catch(IOException e) {
			System.out.println("OPA");
		}
				
		
	}
	
	public void read() {
		try {
			
			FileReader fr = new FileReader(sus+".txt");
			br = new BufferedReader(fr); 
			String str;
			
			while(( str = br.readLine())!=null){
				System.out.println(str);
				
			}
			}
			
			catch(IOException e) {
				System.out.println("OPA");
			}
	}
	
	
	
	

	public String getNomeMed() {
		return nomeMed;
	}

	public void setNomeMed(String nomeMed) {
		this.nomeMed = nomeMed;
	}

	public String getSus() {
		return sus;
	}

	public void setSus(String sus) {
		this.sus = sus;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

}
