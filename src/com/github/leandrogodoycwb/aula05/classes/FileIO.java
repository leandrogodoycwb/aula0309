package com.github.leandrogodoycwb.aula05.classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileIO {
	public static void writer (List<Pessoa> pessoas, String nomeArquivo) throws IOException {
		FileWriter fileWriter = new FileWriter(nomeArquivo);
		
		try(BufferedWriter writer = new BufferedWriter(fileWriter)) {
		   List<String> dados = pessoas.stream()
				   						.map(pessoa -> pessoa.toString())
				   						.collect(Collectors.toList());
		
		for (String linha : dados) {
			writer.write(linha);
		}
      }
		
	}
	
        public static PessoaRepositorio reader(String nomeArquivo) throws IOException {
        PessoaRepositorio pessoas = new PessoaRepositorio();
        FileReader fileReader = new FileReader(nomeArquivo);
        
        try(BufferedReader reader = new BufferedReader(fileReader)){
        	String dado = "";
        	while((dado = reader.readLine()) != null) {
        		String[] linha = dado.split(",");
        		Pessoa p = new Pessoa(linha[0], linha[1], linha[2]);
        		pessoas.pessoas.add(p);
        		
        	}
        }
        
        
        return pessoas;
          
        }
              
}
		

	

		
		
		
		
		
		
		
		
		