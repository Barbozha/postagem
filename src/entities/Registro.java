package entities;

import java.text.SimpleDateFormat;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Registro {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String contexto;
	private Integer likes;
	private List<Comentario> comentario = new ArrayList<>();
	
	
	
	public Registro() {
		
	}

	public Registro(Date momento, String titulo, String contexto, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.contexto = contexto;
		this.likes = likes;
	}
	
	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContexto() {
		return contexto;
	}

	public void setContexto(String contexto) {
		this.contexto = contexto;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}
	
	public void adicionarComentario(Comentario texto) {
		comentario.add(texto);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getTitulo() + "\n");
		sb.append(this.getLikes());
		sb.append(" Likes - ");
		sb.append(sdf.format(this.getMomento()) + "\n");
		sb.append(this.getContexto() + "\n");
		sb.append("Comments:\n");
		for (Comentario c : comentario) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
}
