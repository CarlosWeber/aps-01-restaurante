
public class Restaurante {

	Pratos prato1 = new Pratos(7, "Big MAC");
	Pratos prato2 = new Pratos(5, "Sunday");
	Pratos prato3 = new Pratos(9.5, "Chessburguer");
	
	public Restaurante () { 
			
	
	}
	
	public String mostrarCardapio (){
		String cardapio;
		cardapio = prato1.getNome()+": "+ prato1.getPreco() + "\n" + prato1.getDescricao()+"\n";
		cardapio += prato2.getNome()+": "+ prato2.getPreco() + "\n" + prato2.getDescricao()+"\n";
		cardapio += prato3.getNome()+": "+ prato3.getPreco() + "\n" + prato3.getDescricao()+"\n";
		return cardapio;
		
		
	}

}
