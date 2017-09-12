
public class Pratos {
	
	double preco;
	String descricao;
	String nome;
	
	Ingrediente ingrediente;
	
	
	
	public Pratos(double preco, String nome) {
		this.preco = preco;
		this.nome = nome;
		
	}
	
	public void adicionarIngrediente(String  carne, String legume, String acomp){
		
	ingrediente	= new Ingrediente(carne);
	ingrediente.setLegume(legume);
	ingrediente.setAcompanhamento(acomp);
		
	}
	
	
	
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco>0)
		this.preco = preco;
		}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	
	
}
