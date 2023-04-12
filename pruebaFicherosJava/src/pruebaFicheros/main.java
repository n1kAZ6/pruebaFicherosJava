package pruebaFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Procedimiento Lectura fichero
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {

			// Apertura del fichero y creacion de BufferedReader para poder	
			// hacer una lectura comoda (disponer del metodo readLine()).
	
			archivo = new File ("C:\\zDatosPrueba\\ficheroLeer.txt");	
			fr = new FileReader (archivo);	
			br = new BufferedReader(fr);
	
			// Lectura del fichero
	
			String linea = "";
			
			while(linea!=null) {	
				linea=br.readLine();
				System.out.println(linea);
			}
		} catch(Exception e){
			e.printStackTrace();
		}finally{

			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
	
			try {
				if( null != fr )		
					fr.close();
			} catch (Exception e2) {	
				e2.printStackTrace();	
			}
		}

		//Procedimiento Escritura fichero

		FileWriter fichero = null;
		PrintWriter pw = null;

		try
		{

			fichero = new FileWriter("C:\\zDatosPrueba\\ficheroLeer.txt",true);	
			pw = new PrintWriter(fichero);
	
			for (int i = 0; i < 10; i++) 
				pw.print("\nLinea " + i);			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
	
			// Nuevamente aprovechamos el finally para	
			// asegurarnos que se cierra el fichero.
	
			if (null != fichero)	
				fichero.close();
	
			} catch (Exception e2) {	
				e2.printStackTrace();	
			}
		}		
	}
}
