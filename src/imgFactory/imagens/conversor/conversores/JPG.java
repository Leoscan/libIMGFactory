package imgFactory.imagens.conversor.conversores;

import imgFactory.imagens.Imagem;
import imgFactory.imagens.conversor.interfaces.InterfaceConverter;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

/**
 * 
 * Detalhamento da Classe JPG
 * Essa classe possui o metodo de conversão para JPG, 
 * pode ser convertido PNG e BMP para JPG.
 * 
 * @author leofelixscandura@gmail.com
 */
public class JPG implements InterfaceConverter{
	
	/**
	 * @param srcImg é um tipo Imagem, Imagem é a classe que possui o caminho da imagem que sofrerá a conversão
	 * @param nomeSegundoArquivo é o nome que será dado para o arquivo convertido (Ex: "imagemConvertidaJPG")
	 *
	 */

	public void converter(Imagem srcImg, String nomeSegundoArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		String salvar = srcImg.getDestino() + nomeSegundoArquivo + ".jpg";
		MarvinImageIO.saveImage(image, salvar);		
	}
}
