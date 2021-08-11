package testes;

import classe.imagens.Imagem;
import toolBox.ByteCode;

public class MainTesteBytecode {
	public static void main(String[] args) {
		Imagem cryptex = new Imagem();
		cryptex.setPath("/Users/Leo/Documents/Eclipse/IMGFactory/IMGTeste/cryptex.jpg");
		
		String Base64 = ByteCode.geraBase64(cryptex);
		System.out.println(Base64);
		
		ByteCode.converteBase64(Base64, "/Users/Leo/Documents/Eclipse/IMGFactory/IMGTeste/Convertido.jpg");
	}
}
