import javax.swing.*;


 class Anagrama {

	public static void main(String[] args) {
		String palavra = Digite_a_palavra();
		char vetor[];

		palavra = junta_palavras(palavra);
		vetor = new char[palavra.length()];

		Quebra_Palavra(palavra, vetor);

		Calcula_Anagrama(vetor, 0);

		System.exit(0);

	}

	public static String Digite_a_palavra() {
		String palavra =" ";
		while (palavra.length() <= 2) {
			palavra = JOptionPane.showInputDialog(null,
			"Digite uma palavra com mais de 3 caracteres: ", JOptionPane.INFORMATION_MESSAGE);
		}

		return palavra;
	}

	public static void Mostra(char [] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "");
			
		}

		System.out.println("");

	}

	public static String junta_palavras(String palavra){
		String nova_palavra = ""; String interna = (palavra).trim();
		char c;

		for (int i = 0; i < interna.length(); i++) {
			c = interna.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				nova_palavra = nova_palavra + c;
			}
		}

		return nova_palavra;
	}

	public static void Calcula_Anagrama(char vetor[], int k ) {
		int i;
		if(k == vetor.length - 1)
			Mostra(vetor);
		else {
			Calcula_Anagrama(vetor, k + 1);
			i = k + 1;
			while (i < vetor.length) {
				Troca_Posicao(vetor, k, i);
				Calcula_Anagrama(vetor, k + 1);
				Troca_Posicao(vetor, k, i);
				i = i + 1;

			}
		}
	}

	public static void Troca_Posicao(char[] vetor, int k, int i) {
		char aux;
		aux = vetor[i];
		vetor[i] = vetor[k];
		vetor[k] = aux;
	}

	public static void Quebra_Palavra(String palavra, char vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = palavra.charAt(i);
		}

	}
	

}