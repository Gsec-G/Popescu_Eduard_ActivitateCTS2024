package Main;

import clase.Aplicant;
import clase.readers.AngajatReader;
import clase.readers.ApplicantReader;
import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		ApplicantReader angajatReader = new AngajatReader("C:\\Users\\eduar\\Desktop\\Facultate\\CTS_SEMINAR\\seminar_2\\angajati.txt");
		try {
			listaAngajati = angajatReader.read();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
