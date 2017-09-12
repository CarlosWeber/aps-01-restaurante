
public class Pratos {
	
	double preco;
	String descricao;
	String nome;
	
	public Pratos(double preco, String descricao, String nome) {
		this.preco = preco;
		this.descricao = descricao;
		this.nome = nome;
		
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

	public void setNome(String nome) {
		if (nome!=null)
		this.nome = nome;
	}
	
}
