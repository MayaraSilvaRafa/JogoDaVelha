package negocio;

public class Jogador {
	// jogadas do jogador //

	String simbolo;

	public Jogador(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public void jogadas(String simbolo,String posicao,Tabuleiro tabuleiro){
		
		for (int i = 0; i < tabuleiro.tab.length; i++) {
			for (int j = 0; j < tabuleiro.tab.length; j++) {
				if(posicao.equals(tabuleiro.tab[i][j])){
					tabuleiro.tab[i][j] = simbolo;					
				}
				
			}
		}
		
		
		
		
		
	}


}
