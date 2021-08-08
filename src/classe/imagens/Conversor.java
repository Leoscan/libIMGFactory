package classe.imagens;

import interfaces.InterfaceConverter;

public class Conversor {

	public static void fazerConversao(Imagem srcImg, String nomeSegundoArquivo,InterfaceConverter InterfaceConverter) {
		InterfaceConverter.converter(srcImg, nomeSegundoArquivo);
	}
}
