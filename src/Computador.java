
public class Computador extends Eletrodomesticos {
	
	public String descricao = "Computador";
	public float valor = 7778;
	public int numeroFabricante = 5575757;
	
	
	public Computador() {
		pagamento = new CartaodeCredito();
		garantia = new Garantia1ano();
	}
	
	public void display() {
		System.out.println("Produto: " +descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("Numero do Fabricante: " +numeroFabricante);
		
	}

}