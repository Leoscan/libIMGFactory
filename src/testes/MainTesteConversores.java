package testes;

import classe.conversores.*;
import classe.imagens.Conversor;
import classe.imagens.Imagem;


public class MainTesteConversores {
	public static void main(String[] args) {
		
	Imagem batman = new Imagem();
	batman.setPath("/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/cryptex.jpg");	
	Conversor.fazerConversao(batman, "nomeDoArquivo", new BMP());
	}
}
