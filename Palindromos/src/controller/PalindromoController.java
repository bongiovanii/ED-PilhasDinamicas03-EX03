package controller;

import br.edu.fateczl.pilha.PilhaString;

public class PalindromoController {

	public PalindromoController() {
		// TODO Auto-generated constructor stub
	}

	public String invertePalavra(String palavra, int tamanho) {
		PilhaString p = new PilhaString();

		// criando array com letras

		String[] letras = palavra.split("");
		for (int i = 0; i < tamanho; i++) {
			p.push(letras[i]);
		}

		// invertendo a palavra

		String[] inverter = new String[tamanho];
		for (int j = 0; j < tamanho; j++) {
			try {
				inverter[j] = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		StringBuilder sb = new StringBuilder();
	    for (String letra : inverter) { 
	        sb.append(letra); // Adiciona letra invertida ao StringBuilder
	    }

	    return sb.toString(); // Retorna a palavra invertida
	}

	public boolean comparaPalavras(String palavraInvertida, String palavra) {
		if (palavraInvertida == palavra) {
			return true;
		} else {
			return false;
		}

	}

}
