package imgFactory.junitTestes;

import org.junit.Test;

import imgFactory.imagens.Extensoes;
import imgFactory.imagens.Imagem;
import imgFactory.imagens.conversor.conversores.*;


public class MainTesteConversores {
	
	@Test
	public void testeConversorPNG() {
	String helper = System.getProperty("user.dir");
	
	Imagem batman = new Imagem();
	batman.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/batman.jpg");
	batman.setExtensao(Extensoes.JPG);
		Conversor.fazerConversao(batman, "batmanPNG", new PNG());
	}
	
	@Test
	public void testeConversorBMP() {
	String helper = System.getProperty("user.dir");
	
	Imagem batman = new Imagem();
	batman.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/batman.jpg");
	batman.setExtensao(Extensoes.JPG);
		Conversor.fazerConversao(batman, "batmanBMP", new BMP());
	}
	
	@Test
	public void testeConversorJPG() {
	String helper = System.getProperty("user.dir");
	
	Imagem batman = new Imagem();
	batman.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/cryptex.bmp");
	batman.setExtensao(Extensoes.JPG);
		Conversor.fazerConversao(batman, "cryptexJPGConvertido", new JPG());
	}
}
