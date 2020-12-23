
public class SmartTv extends Eletrodomesticos {
	
	public String descricao = "SmartTV";
	public float valor = 9627;
	public int numeroFabricante = 14141419;
	
	
	public SmartTv() {
		pagamento = new BoletoBancario();
		garantia = new Garantia2anos();
	}
	
	public void display() {
		System.out.println("Produto: " +descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("Numero do Fabricante: " +numeroFabricante);
		
	}

}