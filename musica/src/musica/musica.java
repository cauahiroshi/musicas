package musica;

public abstract class musica {

	private String genero;
	private String cantor;
	private double duracao;
	
	public String getGenero(){
		return this.genero; 
	}
	
	public void setGenero(String genero) {
		this.genero = genero; 
	}
	
	public String getCantor() {
		return this.cantor;
	}
	
	public void setCantor(String cantor) {
		this.cantor = cantor; 
	}
	
	public double getDuracao() {
		return this.duracao;
	}
	
	public void setDuracao(double duracao) {
		this.duracao = duracao; 
	}
	
	
	
	
}
