package cauculadora.TUI;

import java.util.Scanner;

import cauculadora.tratamento.CaucularValores;

public class Mostrar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int res = 0;
		while (res != 0) {
			System.out.println("Escolha uma operação: ");
			System.out.println("1 - Soma ");
			System.out.println("2 - Subtração ");
			System.out.println("3 - Soma ");
			System.out.println("4 - Soma ");
			System.out.println("0 - Sair ");
			res = s.nextInt();
			if (res != 0)
				System.out.println("o resultado é: " + selecao(res));
		}
	}

	private static int selecao(int res) {
		CaucularValores c = new CaucularValores();
		Scanner s = new Scanner(System.in);
		int resul = 0;
		String ss = "";
		int posi = 0;
		int[] nums = new int [1000000];
		if (res == 1) {
			while (!ss.equals("n")){
				nums[posi] = s.nextInt();
				posi++;
				System.out.println("Deseja adicionar outro numero? (s: sim/n: não)");
				ss = s.next();
			}
			resul = c.somar(nums);
		}
		if (res == 2) {
			while (!ss.equals("n")){
				nums[posi] = s.nextInt();
				posi++;
				System.out.println("Deseja adicionar outro numero? (s: sim/n: não)");
				ss = s.next();
			}
			resul = c.subtrair(nums);
		}
		if (res == 3) {
			while (!ss.equals("n")){
				nums[posi] = s.nextInt();
				posi++;
				System.out.println("Deseja adicionar outro numero? (s: sim/n: não)");
				ss = s.next();
			}
			resul = c.dividir(nums);
		}
		if (res == 4) {
			while (!ss.equals("n")){
				nums[posi] = s.nextInt();
				posi++;
				System.out.println("Deseja adicionar outro numero? (s: sim/n: não)");
				ss = s.next();
			}
			resul = c.multiplicar(nums);
		}
		return resul;
	}

}
