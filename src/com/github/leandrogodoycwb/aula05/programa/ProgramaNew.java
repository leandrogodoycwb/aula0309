package com.github.leandrogodoycwb.aula05.programa;

import java.io.IOException;

import com.github.leandrogodoycwb.aula05.classes.FileIO;
import com.github.leandrogodoycwb.aula05.classes.Pessoa;
import com.github.leandrogodoycwb.aula05.classes.PessoaRepositorio;

public class ProgramaNew {

	public static void main(String[] args) {
		 
	PessoaRepositorio repositorio = new PessoaRepositorio();
	
	Pessoa p1 = new Pessoa ("Leandro Godoy","10525000","leandrolenon@gmail.com");
	Pessoa p2 = new Pessoa ("Rafael Godoy", "10000000", "rafaelgodoy@gmail.com");
	Pessoa p3 = new Pessoa ("Samuel Godoy", "11000000", "SamuelGodoy@gmail.com");
	
	repositorio.pessoas.add(p1);
	repositorio.pessoas.add(p2);
	repositorio.pessoas.add(p3);
	
	//System.out.println(repositorio.pessoas);
	
	try {
		//FileIO.writer(repositorio.pessoas, "pessoas.txt");
		PessoaRepositorio repositorio2 = FileIO.reader("pessoas.txt");
		
		Pessoa r = (Pessoa) repositorio2.pessoas.get(3);
		System.out.println(r.getNome());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }

}
