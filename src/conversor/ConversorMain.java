package conversor;

import conversorInterface.Home;
import java.util.ArrayList;
import java.util.List;
import metrics.*;


public class ConversorMain {

	public static void main(String[] args) {
		// classe main que deve instancias os objetos e telas a serem chamadas
		//carregar as classes de conversão apenas quando nescessarias, nao carregar tudo de uma vez
		
		Home open = new Home();
		open.setVisible(true);
		
		List<?> listClasses = new ArrayList();
		
                FindClasses teste = new FindClasses();
                
		listClasses = FindClasses.ClassNames();
		
                FindClasses.ClassNames();
                FindClasses.ClassNames();
                FindClasses.ClassNames();
		for(int a=0;a<listClasses.size();a++) {
			//System.out.println("-  "+listClasses.get(a));
		}
		
	}

}