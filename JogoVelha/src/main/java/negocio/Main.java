package negocio;

import java.util.Scanner;

import Negocio.Jogador;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Tabuleiro tab = new Tabuleiro();
		System.out.println("*** Jogo da Velha ***");

		tab.construirTabuleiro();
		tab.imprimirTabuleiro();

		System.out.println("---------------------");
		System.out.println("Escreva seu nome, você será X");
		String nome1 = teclado.next();
		Jogador jogador1 = new Jogador(nome1 + "X");
		System.out.println("Escreva seu nome, você será O");
		String nome2 = teclado.next();
		Jogador jogador2 = new Jogador(nome2 + "O");

		Jogo jogo = new Jogo();

		for (int i = 0; i < 9; i++) {
			System.out.println("Qual posição você deseja jogar");
			String posicao = teclado.next();

			if(i%2==0){
				if(jogo.verificarPosicao(posicao, tab) == true){
					System.out.println("Escolha uma nova posição");
					String novaPosicao = teclado.next();
					jogo.realizarJogada(jogador1 , novaPosicao, tab);
				}else if(jogo.verificarPosicao(posicao, tab) == false){
					jogo.realizarJogada(jogador1, posicao, tab);
				}
				if(jogo.verificarVencedor(jogador1, tab)){
					break;
				}
				tab.imprimirTabuleiro();    


			}

			for (int j = 0; i < 9; i++) {
				System.out.println("Qual posição você deseja jogar");
				String posicao2 = teclado.next();

				if(i%2==0){
					if(jogo.verificarPosicao(posicao2, tab) == true){
						System.out.println("Escolha uma nova posição");
						String novaPosicao = teclado.next();
						jogo.realizarJogada(jogador2 , novaPosicao, tab);
					}else if(jogo.verificarPosicao(posicao2, tab) == false){
						jogo.realizarJogada(jogador2, posicao2, tab);
					}
					if(jogo.verificarVencedor(jogador2, tab)){
						break;
					}
					tab.imprimirTabuleiro();    


				}
			}
		}
	}
}
