package testes;

import classes.Conversor;
import classes.Imagem;
import conversores.*;


public class MainTesteConversores {
	public static void main(String[] args) {
		
	Imagem batman = new Imagem();
	batman.setPath("/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/ImagemConvertidaBMP.bmp");
	batman.setSalvarEm("/Users/Leo/Documents/Eclipse/lib-imgFactory/IMGTeste/");
	
	Conversor.fazerConversao(batman, new PNG());
	}
}
