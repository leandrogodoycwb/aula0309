package com.github.leandrogodoycwb.aula05.programa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) throws IOException {
			try {
			FileWriter fileWriter = new FileWriter("primeiroarq.txt");
			fileWriter.append("Leandro\nGodoy");
			fileWriter.close();
			System.out.println("Escreveu");
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			//Leitura
			try {
			FileReader fileReader = new FileReader("primeiroarq.txt");
			BufferedReader reader = new BufferedReader(fileReader);
			
			String linha ="";
			while ((linha = reader.readLine()) != null)
			System.out.println(linha);
			
			reader.close();
			fileReader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}

	}
	}
