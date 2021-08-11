package testes;

import classe.conversores.*;
import classe.imagens.Conversor;
import classe.imagens.Extensoes;
import classe.imagens.Imagem;


public class MainTesteConversores {
	public static void main(String[] args) {
	
	//Convertendo uma imagem de JPG para PNG e BMP
	Imagem batman = new Imagem();
	batman.setPath("/Users/Leo/Documents/Eclipse/IMGFactory/IMGTeste/batman.jpg");
	batman.setExtensao(Extensoes.JPG);
	Conversor.fazerConversao(batman, "batmanPNG", new PNG());
	Conversor.fazerConversao(batman, "batmanBMP", new BMP());
	
	System.out.println(batman);
	
	}
}
