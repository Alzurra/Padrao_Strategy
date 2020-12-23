
public class WRV extends Veiculos {
	
	public String descricao = "WRV";
	public float valor = 77770;
	public int chassi = 5537382;
	
	public WRV() {
		
		 pagamento = new CartaodeCredito();
		 garantia = new Garantia1ano();
	}	
	
	public void display() {
		System.out.println("Veiculo: " +descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("Chassi: " +chassi);
	}

}
