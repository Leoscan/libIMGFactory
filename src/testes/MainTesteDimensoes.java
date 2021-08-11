package testes;

import classe.imagens.Imagem;
import toolBox.Dimensoes;

public class MainTesteDimensoes {
	public static void main(String[] args) {
		Imagem paisagem = new Imagem();
		paisagem.setPath("/Users/Leo/Documents/Eclipse/IMGFactory/IMGTeste/800x729.jpg");
		
		//redimensionando o arquivo
		Dimensoes.redimensionar(paisagem, "200x100", 200, 100);
		
		//invertendo o arquivo horizontalmente e verticalmente
		Imagem cryptex = new Imagem();
		cryptex.setPath("/Users/Leo/Documents/Eclipse/IMGFactory/IMGTeste/cryptex.jpg");
		
		Dimensoes.inverterHorizontal(cryptex, "invertidoHorizontalmente");
		Dimensoes.inverterVertical(cryptex, "invertidoVerticalmente");

	}
}
