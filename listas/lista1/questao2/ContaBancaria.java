package questao2;

public class ContaBancaria {
	
	private String nome;
	private double saldo;
	
	public ContaBancaria(String nome) {	
		this.nome = nome;
		this.saldo = 0.0;
	}
	
	public void depositar(double valorDeposito) {
		saldo = saldo + valorDeposito;
	}

	public void sacar(double valorSaque) {
		if(valorSaque <= saldo) {
			saldo = saldo - valorSaque;
		}else
			System.out.println("Voce nao tem saldo suficiente para realizar o saque.");
	}
	
	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public boolean equals(String outroDono) {
		if(this.getNome().equals(outroDono)){
			return true;			
		}else {
			return false;
		}
	}
	
	public String toString() {
		return nome+ ", o seu saldo eh de " +saldo;
	}

}
