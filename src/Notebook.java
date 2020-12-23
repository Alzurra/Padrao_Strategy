
public class Notebook extends Eletrodomesticos {
	
	public String descricao = "Notebook";
	public float valor = 129;
	public int numeroFabricante = 1234567;
	
	
	public Notebook() {
		pagamento = new CartaodeCredito();
		garantia = new semGarantiaExtendida();
	}
	
	public void display() {
		System.out.println("Produto: " +descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("Numero do Fabricante: " +numeroFabricante);
		
	}

}
