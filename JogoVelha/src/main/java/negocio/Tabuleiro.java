package negocio;

public class Tabuleiro {

	String tab [][] = new String [3][3];


	public void construirTabuleiro(){
		tab[0][0] = "1";
		tab[0][1] = "2";
		tab[0][2] = "3";

		tab[1][0] = "4";
		tab[1][1] = "5";
		tab[1][2] = "6";

		tab[2][0] = "7";
		tab[2][1] = "8";
		tab[2][2] = "9";
	}

	public void imprimirTabuleiro(){
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				System.out.print(tab[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
		}
	}


}
