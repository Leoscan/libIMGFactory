package imgFactory.junitTestes;

import org.junit.jupiter.api.Test;

import imgFactory.imagens.Imagem;
import imgFactory.imagens.toolBox.ByteCode;

public class MainTesteBytecode {
	
	@Test
	public void testeCriacaoeConversaoByteCode() {
		String helper = System.getProperty("user.dir");
		
		//converte a imagem para base64
		Imagem cryptex = new Imagem();
		cryptex.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/Cryptex.jpg");
		
		String Base64 = ByteCode.geraBase64(cryptex);
		System.out.println(Base64);
		
		//converte a base 64 para uma imagem
		ByteCode.converteBase64(Base64, (helper + "/src/imgFactory/junitTestes/IMGTeste/Convertido.jpg"));
	}
}
