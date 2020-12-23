
public class HRV extends Veiculos {
	
	public String descricao = "HRV";
	public float valor = 98000;
	public int chassi = 989777;
	
	public HRV() {
		
		 pagamento = new DepositoBancario();
		 garantia = new Garantia2anos();
	}	
	
	public void display() {
		System.out.println("Veiculo: " +descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("Chassi: " +chassi);
	}

}