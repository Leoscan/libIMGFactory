package classes;

import interfaces.InterfaceConverter;

public class Conversor {

	public static void fazerConversao(Imagem srcImg, InterfaceConverter InterfaceConverter) {
		InterfaceConverter.converter(srcImg);
	}
}
