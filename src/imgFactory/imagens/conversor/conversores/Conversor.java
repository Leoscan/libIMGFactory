package imgFactory.imagens.conversor.conversores;

import imgFactory.imagens.Imagem;
import imgFactory.imagens.conversor.interfaces.InterfaceConverter;

public class Conversor {

	public static void fazerConversao(Imagem srcImg, String nomeSegundoArquivo,InterfaceConverter InterfaceConverter) {
		InterfaceConverter.converter(srcImg, nomeSegundoArquivo);
	}
}
