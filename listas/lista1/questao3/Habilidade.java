package questao3;

public class Habilidade {
	
	String nome;
	int dano;
	int mana;
	
	//Constructor
	public Habilidade(String nome, int dano, int mana) {
		
		this.nome = nome;
		this.dano = dano;
		this.mana = mana;
		
	}
	
	public void usaHabilidade() {
		
		System.out.println("Gastou " + mana + " de energia. " + nome + " causa " + dano + " de dano.");
		
	}
	
}
