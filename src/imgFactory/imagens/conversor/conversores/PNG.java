package imgFactory.imagens.conversor.conversores;

import imgFactory.imagens.Imagem;
import imgFactory.imagens.conversor.interfaces.InterfaceConverter;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

/**
 * 
 * Detalhamento da Classe PNG
 * Essa classe possui o metodo de conversão para PNG, 
 * pode ser convertido JPG e BMP para PNG.
 * 
 * @author leofelixscandura@gmail.com 
 */
public class PNG implements InterfaceConverter {

	/**
	 * @param srcImg é um tipo Imagem, Imagem é a classe que possui o caminho da imagem que sofrerá a conversão
	 * @param nomeSegundoArquivo é o nome que será dado para o arquivo convertido (Ex: "imagemConvertidaPNG")
	 *
	 */
	public void converter(Imagem srcImg, String nomeSegundoArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		String salvar = srcImg.getDestino() + nomeSegundoArquivo + ".png";
		MarvinImageIO.saveImage(image, salvar);		
	}
}
