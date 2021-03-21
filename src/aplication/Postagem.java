package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Comentario;
import entities.Registro;

public class Postagem {

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws ParseException {
		// Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os
		// na tela do terminal
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		Comentario comentario1 = new Comentario("Have a nice trip!");
		Comentario comentario2 = new Comentario("Wow that's awesome!");
		Registro r1 = new Registro(sdf.parse("21/06/2018 13:05:44"), 
					"Traveling to New Zealand", 
					"I'm going to visit this wonderful country!", 
					12);
		r1.adicionarComentario(comentario1);
		r1.adicionarComentario(comentario2);
			
		Comentario comentario3 = new Comentario("Good night");
		Comentario comentario4 = new Comentario("May the Force be with you");
		Registro r2 = new Registro(sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow", 
				5);
		r2.adicionarComentario(comentario3);
		r2.adicionarComentario(comentario4);
		
		System.out.println(r1);
		System.out.println(r2);
	}
}
