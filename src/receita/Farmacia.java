package receita;

import java.io.File;
import java.io.IOException;
import java.awt.Desktop;

public class Farmacia{
	String sus;
        String idf;
        String nomef;
	
	
	
	public void delete(String sus) {		
		File rc = new File(sus+".txt");
		rc.delete();		
	}
	
	public void openFile(String sus) throws IOException {
		Desktop desktop = Desktop.getDesktop();
		File rc = new File(sus+".txt");
		desktop.open(rc);
	}
	
	

}
