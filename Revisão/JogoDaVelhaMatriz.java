
public class JogoDaVelhaMatriz {

	public static void main(String[] args) {
		String[][] tabuleiro = 
		{
			{"X", "O", "X"},
			{".", "O", "."},
			{"O", "X", "."}
		};

		for (int linha=0; linha < tabuleiro.length; linha++) {
			for(int coluna=0; coluna < tabuleiro[0].length;  coluna++) {
				System.out.print(tabuleiro[linha][coluna]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Imprime e posiciona na pr�xima linha");
		System.out.print("Imprime e permanece na mesma linha");
		System.out.print("...estou na mesma linha");
		System.out.println("...ainda estou na mesma linha... mas o pr�ximo n�o");
		System.out.print("...estou na linha debaixo...");
		System.out.printf("\n%s%.1f", "Sou uma string. ", 67.921);

	}

}
