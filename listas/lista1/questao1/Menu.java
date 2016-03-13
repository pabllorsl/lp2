package questao1;

public class Menu {

	public static void main(String[] args) {
		
		/*Carro porsche = new Carro("Porsche", 400);
		System.out.println(porsche);
		
		porsche.diarias(3);
		System.out.println(porsche);*/
		
		Carro celta = new Carro("Celta", 50.0);		
		
		Carro[] lojaMaiana = new Carro[10];
		for (int i = 0; i < lojaMaiana.length; i++) {
			lojaMaiana[i] = new Carro("", 0.0);
		}		
		
		Carro corola = new Carro("Corola", 100.0);
		System.out.println(corola.getPreco());
		
		corola.setPreco(150.0);
		System.out.println(corola.getPreco());			
		System.out.println(corola.getPreco());
		
		double totalAlugadoCorola = corola.diarias(90);	
		double totalAlugadoCelta = celta.diarias(90);
		
		lojaMaiana[0] = celta;
		lojaMaiana[1] = corola;
		lojaMaiana[2] = new Carro("Fusca", 15.0);
		
		double totalPorDia = 0.0;
		for (int i = 0; i < lojaMaiana.length; i++) {
						
			Carro carroAtual = lojaMaiana[i];
			if( ! carroAtual.getNome().equals("") ){
				System.out.println(carroAtual);
				totalPorDia = totalPorDia + carroAtual.getPreco();								
			}
		}	
		System.out.println("O total de maiana eh: "+totalPorDia);
		
		
		for (int i = 0; i < lojaMaiana.length; i++) {
			Carro carroAtual = lojaMaiana[i]; 			
			
			double precoAtual = carroAtual.getPreco();
//			carroAtual.setPreco(precoAtual + 100.0);
			
			totalPorDia = totalPorDia + carroAtual.getPreco();
		}
		
		System.out.println("Maiana vai faturar por dia: "+totalPorDia);
		
		
	}
	
}
