package imgFactory.imagens.conversor.conversores;

import imgFactory.imagens.Imagem;
import imgFactory.imagens.conversor.interfaces.InterfaceConverter;

/** 
 * Detalhamento da Classe Conversor
 * Essa classe define um metodo padrão STRATEGY 
 * deixando assim a escolha da conversão sendo 
 * responsabilidade da interface interfaceConverter
 * 
 * @author leofelixscandura@gmail.com 
 */
public class Conversor {

	public static void fazerConversao(Imagem srcImg, String nomeSegundoArquivo, InterfaceConverter InterfaceConverter) {
		InterfaceConverter.converter(srcImg, nomeSegundoArquivo);
	}
}
