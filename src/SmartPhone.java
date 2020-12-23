
public class SmartPhone extends Eletrodomesticos {
	
	public String descricao = "SmartPhone";
	public float valor = 1297;
	public int numeroFabricante = 3335555;
	
	
	public SmartPhone() {
		pagamento = new BoletoBancario();
		garantia = new Garantia2anos();
	}
	
	public void display() {
		System.out.println("Produto: " +descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("Numero do Fabricante: " +numeroFabricante);
		
	}

}
