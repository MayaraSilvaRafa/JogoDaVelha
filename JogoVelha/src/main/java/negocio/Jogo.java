package negocio;

public class Jogo {
	// administração do jogo//

	public void realizarJogada(String simbolo, String posicao, Tabuleiro tabuleiro) {

		for (int i = 0; i < tabuleiro.tab.length; i++) {
			for (int j = 0; j < tabuleiro.tab.length; j++) {
				if (posicao.equals(tabuleiro.tab[i][j])) {
					tabuleiro.tab[i][j] = simbolo;
				}
			}
		}
	}
	
	
	public boolean verificarPosicao(String posicao, Tabuleiro tabuleiro){
		for (int i = 1; i < 9; i++) {
			if (posicao.equals(i)) {
				if(tabuleiro.tab[0][0]=="X" && tabuleiro.tab[0][0]=="O"){
					return true;	
			}	
		}
			
	   return false;	
	}
		
		
	
	
	
	

}
