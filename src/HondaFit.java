
public class HondaFit extends Veiculos {
	
	public String descricao = "Honda Fit";
	public float valor = 50000;
	public int chassi = 19389394;
	
	public HondaFit() {
		
		 pagamento = new CartaodeCredito();
		 garantia = new Garantia3anos();
	}	
	
	public void display() {
		System.out.println("Veiculo: " +descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("Chassi: " +chassi);
	}

}

