package cauculadora.tratamento;

public class CaucularValores {
	public static int somar(int... numeros) {
		int resul = 0;
		for (int i = 0; i < numeros.length;i++) {
			if (i + 1 < numeros.length)
				resul = numeros[i] + numeros[i+1];
		}
		return resul;
	}
	public static int subtrair(int... numeros) {
		int resul = 0;
		for (int i = 0; i < numeros.length;i++) {
			if (i + 1 < numeros.length)
				resul = numeros[i] - numeros[i+1];
		}
		return resul;
	}
	public static int multiplicar(int... numeros) {
		int resul = 0;
		for (int i = 0; i < numeros.length;i++) {
			if (i + 1 < numeros.length)
				resul = numeros[i] * numeros[i+1];
		}
		return resul;
	}
	public static int dividir(int... numeros) {
		int resul = 0;
		for (int i = 0; i < numeros.length;i++) {
			if (i + 1 < numeros.length)
				resul = numeros[i] / numeros[i+1];
		}
		return resul;
	}
}
