package questao1;

public class Carro {

	private String nome;
	private double preco;
	
	public Carro(String nome, double preco) {
		
		this.nome = nome;
		this.preco = preco;
		
	}

	public double diarias(int dias) {
		
		double diarias = 0.0;
		diarias = dias * getPreco();		
		return diarias;
		
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "O carro "+nome+ " pode ser alugado por " +preco+ " por dia.";
	}
	
}
