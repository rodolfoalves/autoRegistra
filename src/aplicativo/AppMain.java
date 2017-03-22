package aplicativo;

import java.util.ArrayList;
import java.util.Scanner;

import acessorios.AulaPratica;
import acessorios.RegistroAP;
import janelas.JanelaPrincipal;
import personagens.Membro;
import personagens.Pessoa;

public class AppMain {
	
	private static ArrayList<AulaPratica> aulas = new ArrayList();
	private static Membro p = new Membro("jhonsef", "60491225393", "984033419", "643254233", 'j');
	
	public static void main(String[] args) {
		System.out.println(p.toString());
	}
		

}
