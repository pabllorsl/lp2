package questao2;

public class Menu {

	public static void main(String[] args) {
		
		ContaBancaria contaPabllo = new ContaBancaria("Pabllo");
		
		System.out.println(contaPabllo.getSaldo()); // 0.0
		
		contaPabllo.depositar(200.0);
		System.out.println(contaPabllo.getSaldo()); // 200.0
		
		contaPabllo.sacar(150.0);
		System.out.println(contaPabllo.getSaldo()); // 50.0
		
		contaPabllo.sacar(100.0);
		System.out.println(contaPabllo.getSaldo()); // 50.0
		
		ContaBancaria contaPabllo2 = new ContaBancaria("Pabllo");
		System.out.println(contaPabllo2);
		
		if(contaPabllo.equals(contaPabllo2)){
			System.out.println("Mesmo dono");
		}else{
			System.out.println("Donos diferentes");
		}
	}
}
