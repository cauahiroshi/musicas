package testes;

import musica.Musica;
import musica.Rock;
import musica.Mpb;
import musica.Pop;


public class TestaMusica {
	public static void main(String[] args) {
		
		Musica rock1 = new Rock ("I Wanna Rock", "Twisted Sister"); 
		Musica rock2 = new Rock ("Rock You Like A Hurricane", "Scorpions"); 
		rock1.setDuracao(2.59);
		rock2.setDuracao(4.12);
		
		System.out.println("Nome: " + rock1.getNome());
		System.out.println("Banda: " + rock1.getBanda());
		System.out.println();
		
		Musica mpb1 = new Mpb ("Bete Balanço", "Barão Vermelho");
		Musica mpb2 = new Mpb ("Tempo Perdido", "Legião Urbana"); 
		mpb1.setDuracao(3.33);
		mpb2.setDuracao(5.02); 
		
		System.out.println("Nome: " + mpb1.getNome());
		System.out.println("Banda: " + mpb1.getBanda());
		System.out.println();
		
		Musica pop1 = new Pop ("Hung Up", "Madona"); 
		Musica pop2 = new Pop ("Instant Crush", "Daft Punk");
		pop1.setDuracao(5.33);
		pop2.setDuracao(5.38);
		
		System.out.println("Nome: " + pop1.getNome());
		System.out.println("Banda: " + pop1.getBanda());
	
	}
}
