package imgFactory.imagens.toolBox;

import static marvin.MarvinPluginCollection.*;

import imgFactory.imagens.Imagem;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

/**
 *	Classe Cores faz parte da caixa de ferramentas, 
 *  contendo métodos uteis para trabalhar com as dimensões das imagens
 *  
 * @author leofelixscandura@gmail.com
 *
 */
public class Dimensoes {
	
	/** 
	 * Este método redimensiona uma imagem (AlturaxLargura)
	 * 
	 * @param srcImg é um tipo Imagem, Imagem é a classe que possui o caminho da imagem que sofrerá a conversão
	 * @param nomeArquivo é o nome que será dado para o arquivo convertido (Ex: "imagemAlterada")
	 * @param Altura ou Height de uma imagem
	 * @param Largura ou Widht de uma imagem 
	 */
	public static void redimensionar(Imagem srcImg, String nomeArquivo, int Altura, int Largura) {
		
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		scale(image.clone(), image, Altura, Largura); 
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));
	}
	
	/** 
	 * Este método inverte uma imagem de modo horizontal
	 * 
	 * @param srcImg é um tipo Imagem, Imagem é a classe que possui o caminho da imagem que sofrerá a conversão
	 * @param nomeArquivo é o nome que será dado para o arquivo convertido (Ex: "imagemAlterada")
	 */
	public static void inverterHorizontal(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		flipHorizontally(image.clone(), image); 
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));
	}
	
	/** 
	 * Este método inverte uma imagem de modo vertical
	 * 
	 * @param srcImg é um tipo Imagem, Imagem é a classe que possui o caminho da imagem que sofrerá a conversão
	 * @param nomeArquivo é o nome que será dado para o arquivo convertido (Ex: "imagemAlterada")
	 */
	public static void inverterVertical(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		flipVertically(image.clone(), image); 
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));

	}
	
}
