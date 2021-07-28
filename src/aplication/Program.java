package aplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		List<String> lista = new ArrayList<String>();
		
		String caminho = "c:\\Temp\\empregados.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String nomes = br.readLine();
			while(nomes != null) {
				lista.add(nomes);
				nomes = br.readLine();
			}
			
			System.out.println("LISTANDO OS NOMES DO ARQUIVO");
			for(String l:lista) {
				System.out.println(l);
			}
			
			System.out.println();
			System.out.println("LISTANDO NOS NOMES ORDENADOS");
			Collections.sort(lista);
			for(String l:lista) {
				System.out.println(l);
			}
			
			
		}
		
		
	}
	
}
