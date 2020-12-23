
public class ProductSimulator {
	public static void main(String[] args) {
		
		HondaFit hondafit = new HondaFit();
		hondafit.setFormaDePagamento(new BoletoBancario());
		hondafit.setGarantiaExtendida(new Garantia1ano());
		
		HRV hrv = new HRV();
		hrv.setFormaDePagamento(new CartaodeCredito());
		hrv.setGarantiaExtendida(new Garantia1ano());
		
		WRV wrv = new WRV();
		wrv.setFormaDePagamento(new DepositoBancario());
		wrv.setGarantiaExtendida(new Garantia1ano());
		
		Notebook notebook = new Notebook();
		notebook.setFormaDePagamento(new CartaodeCredito());
		notebook.setGarantiaExtendida(new semGarantiaExtendida());
		
		Computador computador = new Computador();
		computador.setFormaDePagamento(new BitCoin());
		computador.setGarantiaExtendida(new Garantia1ano());
		
		SmartTv smarttv = new SmartTv();
		smarttv.setFormaDePagamento(new BoletoBancario());
		smarttv.setGarantiaExtendida(new Garantia3anos());
		
		SmartPhone smartphone = new SmartPhone();
		smartphone.setFormaDePagamento(new BitCoin());
		smartphone.setGarantiaExtendida(new semGarantiaExtendida());
		
		
		
		
		hondafit.display();
		hondafit.getFormaDePagamento();
		hondafit.getGarantiaExtendida();
		System.out.println("#############################");
		hrv.display();
		hrv.getFormaDePagamento();
		hrv.getGarantiaExtendida();
		System.out.println("#############################");
		wrv.display();
		wrv.getFormaDePagamento();
		wrv.getGarantiaExtendida();
		System.out.println("#############################");
		notebook.display();
		notebook.getFormaDePagamento();
		notebook.getGarantiaExtendida();
		System.out.println("#############################");
		computador.display();
		computador.getFormaDePagamento();
		computador.getGarantiaExtendida();
		System.out.println("#############################");
		smartphone.display();
		smartphone.getFormaDePagamento();
		smartphone.getGarantiaExtendida();
		System.out.println("#############################");
		smarttv.display();
		smarttv.getFormaDePagamento();
		smarttv.getGarantiaExtendida();
		System.out.println("#############################");
		
	}

}

