package questao3;

public class CampoBatalha {

	public static void main(String[] args) {
		
		Habilidade bolaDeFogo = new Habilidade("Bola de Fogo", 60, 5);
		Habilidade raioDeGelo = new Habilidade("Raio de Gelo", 20, 3);
		
		bolaDeFogo.usaHabilidade();
		raioDeGelo.usaHabilidade();

	}

}
