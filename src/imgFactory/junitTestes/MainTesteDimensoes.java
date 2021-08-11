package imgFactory.junitTestes;

import org.junit.Test;

import imgFactory.imagens.Imagem;
import imgFactory.imagens.toolBox.Dimensoes;

public class MainTesteDimensoes {
	
	@Test
	public void testaRedimensionar() {
		String helper = System.getProperty("user.dir");
		
		Imagem paisagem = new Imagem();
		paisagem.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/800x729.jpg");
		
		//redimensionando o arquivo
		Dimensoes.redimensionar(paisagem, "200x100", 200, 100);

	}
	
	@Test
	public void testaInversaoHorizontal() {
		String helper = System.getProperty("user.dir");
		//invertendo o arquivo horizontalmente e verticalmente
				Imagem cryptex = new Imagem();
				cryptex.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/Cryptex.jpg");
				
				Dimensoes.inverterVertical(cryptex, "invertidoVerticalmente");
	}
	
	@Test
	public void testaInversaoVertical() {
		String helper = System.getProperty("user.dir");
		//invertendo o arquivo horizontalmente e verticalmente
				Imagem cryptex = new Imagem();
				cryptex.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/Cryptex.jpg");
	
				Dimensoes.inverterVertical(cryptex, "invertidoVerticalmente");	
	}
}
