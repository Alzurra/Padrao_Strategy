public abstract class Produto {
	FormaDePagamento pagamento;
	GarantiaExtendida garantia;
	
	public String descricao;
	public float valor;
 
	public Produto() {
		
	}
	
 
	public void setFormaDePagamento (FormaDePagamento fp) {
		pagamento = fp;
	}
 
	public void setGarantiaExtendida(GarantiaExtendida ge) {
		garantia = ge;
	}
 
	public void getFormaDePagamento() {
		pagamento.formadepagamento();
	}
	
	public void getGarantiaExtendida() {
		garantia.tempoGarantia();
	}
	
}
