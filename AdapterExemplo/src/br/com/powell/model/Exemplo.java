package br.com.powell.model;

public class Exemplo {
	
	private int imagem;
	private String nome;
	
	public Exemplo(int imagem, String nome){
		setImagem(imagem);
		setNome(nome);
	}
	
	public int getImagem() {
		return imagem;
	}
	public void setImagem(int imagem) {
		this.imagem = imagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
