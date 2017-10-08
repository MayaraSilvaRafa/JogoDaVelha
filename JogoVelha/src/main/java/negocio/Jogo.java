package negocio;

public class Jogo {
	// administração do jogo//

	public void realizarJogada(Jogador jogador, String posicao, Tabuleiro tabuleiro) {

		for (int i = 0; i < tabuleiro.tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.tabuleiro.length; j++) {
				if (posicao.equals(tabuleiro.tabuleiro[i][j])) {
					tabuleiro.tabuleiro[i][j] = jogador.getSimbolo();
				}
			}
		}
	}


	public boolean verificarPosicao(String posicao, Tabuleiro tabuleiro){
		for (int i = 1; i < 9; i++) {
			if (posicao.equals(i)) {
				if(tabuleiro.tabuleiro[0][0]=="X" && tabuleiro.tabuleiro[0][0]=="O"){
					return true;	
				}	
			}	
		}
		return false;
	}

	public boolean verificarVencedor(Jogador jogador, Tabuleiro tabuleiro){
		// horizontais//
		if (tabuleiro.tabuleiro[0][0] == tabuleiro.tabuleiro[0][1] && tabuleiro.tabuleiro[0][1] == tabuleiro.tabuleiro[0][2]) {
			System.out.println(jogador.getSimbolo() + "Parabéns, voce venceu! o/ ");
			return true;
		}else if (tabuleiro.tabuleiro[1][0] == tabuleiro.tabuleiro[1][1] && tabuleiro.tabuleiro[1][1] == tabuleiro.tabuleiro[1][2]) {
			System.out.println(jogador.getSimbolo() + "Parabéns, voce venceu! o/ ");
			return true;
		}else if (tabuleiro.tabuleiro[2][0] == tabuleiro.tabuleiro[2][1] && tabuleiro.tabuleiro[2][1] == tabuleiro.tabuleiro[2][2]) {
			System.out.println(jogador.getSimbolo() + "Parabéns, voce venceu! o/ ");
			return true;
			//verticais//
		}else if (tabuleiro.tabuleiro[0][0] == tabuleiro.tabuleiro[1][0] && tabuleiro.tabuleiro[1][0] == tabuleiro.tabuleiro[2][0]) {
			System.out.println(jogador.getSimbolo() + "Parabéns, voce venceu! o/ ");
			return true;

		}else if (tabuleiro.tabuleiro[0][1] == tabuleiro.tabuleiro[1][1] && tabuleiro.tabuleiro[1][1] == tabuleiro.tabuleiro[2][1]) {
			System.out.println(jogador.getSimbolo() + "Parabéns, voce venceu! o/ ");
			return true;

		}else if (tabuleiro.tabuleiro[0][2] == tabuleiro.tabuleiro[1][2] && tabuleiro.tabuleiro[1][2] == tabuleiro.tabuleiro[2][2]) {
			System.out.println(jogador.getSimbolo() + "Parabéns, voce venceu! o/ ");
			return true;
			// diagonais//
		}else if (tabuleiro.tabuleiro[0][0] == tabuleiro.tabuleiro[1][1] && tabuleiro.tabuleiro[1][1] == tabuleiro.tabuleiro[2][2]) {
			System.out.println(jogador.getSimbolo() + "Parabéns, voce venceu! o/ ");
			return true;
		}else if (tabuleiro.tabuleiro[0][2] == tabuleiro.tabuleiro[1][1] && tabuleiro.tabuleiro[1][1] == tabuleiro.tabuleiro[2][0]) {
			System.out.println(jogador.getSimbolo() + "Parabéns, voce venceu! o/ ");
			return true;
		}
		return false;
	}
}







