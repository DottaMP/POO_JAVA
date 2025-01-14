import java.util.Random;
import java.util.Scanner;

public class JogoDaVelhaScanner {

	static String[][] tabuleiro = 
	{
		{".", ".", "."},
		{".", ".", "."},
		{".", ".", "."}
	};

	public static void main(String[] args) {
		int resposta=0;
		while (resposta!=9) {
			imprime();		
			resposta = entradaDados();
			imprime();		
			jogadaComputador();
		}
		System.out.println("Fim!");
	}
	
	public static int entradaDados() {
	    int linha, coluna;
	    Scanner ler = new Scanner(System.in);  // Cria um objeto Scanner

	    do {
		    do {
		    	System.out.print("Digite nr. linha (0 a 2): ");
		    	linha = ler.nextInt();
		    } while ((linha < 0 || linha > 2) && (linha !=9));
		    if (linha==9)
		    	return 9;
		    
		    do {
		    	System.out.print("Digite nr. coluna (0 a 2): ");
		    	coluna = ler.nextInt();
		    }  while ((coluna < 0 || coluna > 2) && (linha >=9));
		    if (coluna==9)
		    	return 9;	
		    if (!tabuleiro[linha][coluna].equals(".")) 
		    	System.out.println("Jogada Inv�lida!");
	    } while(!tabuleiro[linha][coluna].equals("."));
	    
	    tabuleiro[linha][coluna]= "X";
	    return linha;
	}
	
	public static void imprime() {
		for (int linha=0; linha < tabuleiro.length; linha++) {
			for(int coluna=0; coluna < tabuleiro[0].length;  coluna++) {
				System.out.print(tabuleiro[linha][coluna]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void jogadaComputador() {
		Random rnd = new Random();
		int linha, coluna;
		do {
			linha = rnd.nextInt(3);
			coluna = rnd.nextInt(3);
		} while(!tabuleiro[linha][coluna].equals("."));
		tabuleiro[linha][coluna]= "O";
		System.out.println("Jogada Computador: "+linha+" - "+coluna);
	}

}