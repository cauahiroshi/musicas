package musica;

public abstract class Musica {

	private String nome; 
	private String banda; 
	private double duracao;
	
	public Musica(String nome, String banda){
		this.nome = nome; 
		this.banda = banda; 
	}
	
	public String getNome(){
		return this.nome; 
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public String getBanda(){
		return this.banda; 
	}
	
	public void setBanda(String banda) {
		this.banda = banda; 
	}
	
	public double getDuracao() {
		return this.duracao;
	}
	
	public void setDuracao(double duracao) {
		this.duracao = duracao; 
	}
	
	
	
	
}
