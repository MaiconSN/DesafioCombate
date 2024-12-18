package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.printf("Nome: ");
		String name = sc.next();
		System.out.printf("Vida inicial: ");
		int life = sc.nextInt();
		System.out.printf("Ataque: ");
		int attack = sc.nextInt();
		System.out.printf("Armadura: ");
		int armor = sc.nextInt();
		Champion champion1 = new Champion(name, life, attack, armor);
		
		System.out.println("\n");
		
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.printf("Nome: ");
		name = sc.next();
		System.out.printf("Vida inicial: ");
		life = sc.nextInt();
		System.out.printf("Ataque: ");
		attack = sc.nextInt();
		System.out.printf("Armadura: ");
		armor = sc.nextInt();
		Champion champion2 = new Champion(name, life, attack, armor);
		System.out.println("\n");
		
		System.out.printf("Quantos turnos você deseja executar? ");
		int turn = sc.nextInt();
		System.out.println("\n");
		
		for (int i = 0; i < turn; i++) {
			if (champion1.getLife() == 0 && champion2.getLife() == 0) {
				System.out.printf("Resultado do turno %d:%n", i+1);
				champion1.takeDamage(champion2);
				champion2.takeDamage(champion1);
				System.out.println(champion1);
				System.out.println(champion2);
				
				System.out.println("\n");
				
				break;
			}
			else if (champion1.getLife() > 0 && champion2.getLife() > 0) {
				System.out.printf("Resultado do turno %d:%n", i+1);
				champion1.takeDamage(champion2);
				champion2.takeDamage(champion1);
				System.out.println(champion1);
				System.out.println(champion2);
				
				System.out.println("\n");
			}
		}
		System.out.println("FIM DO COMBATE");
		
		
		sc.close();

	}

}
