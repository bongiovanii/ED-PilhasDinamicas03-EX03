package view;

import javax.swing.JOptionPane;

import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController palindromo =  new PalindromoController();
		String palavra = JOptionPane.showInputDialog("Digite uma palavra e veja se ela é um palindromo");
		int tamanho =  palavra.length();
		
		String palavraInvertida = palindromo.invertePalavra(palavra, tamanho);
		System.out.println(palavraInvertida);
		boolean isPalindromo = palindromo.comparaPalavras(palavraInvertida, palavra);
		
		if(isPalindromo == true) {
			JOptionPane.showMessageDialog(null, "A palavra " + palavra + " é um palindromo");
		}else {
			JOptionPane.showMessageDialog(null, "A palavra " + palavra + " não é um palindromo");

		}

	}

}
