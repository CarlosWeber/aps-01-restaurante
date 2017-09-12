
public class Pedidos {

	private double valorTotal;
	
	public double getValorTotal() {
		return valorTotal;
	}

	Pratos pratos [];
	
	public Pedidos (){
		pratos=new Pratos [2];
		valorTotal=pratos[0].getPreco()+pratos[1].getPreco()+pratos[2].getPreco();
	}
}

