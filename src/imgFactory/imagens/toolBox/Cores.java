package imgFactory.imagens.toolBox;

import java.awt.Color;

import imgFactory.imagens.Imagem;

import static marvin.MarvinPluginCollection.*;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;


/**
 *	Classe Cores faz parte da caixa de ferramentas, 
 *  contendo métodos uteis para trabalhar com as cores das imagens
 *  
 * @author leofelixscandura@gmail.com
 *
 */
public class Cores {
	
	/** 
	 * Este método Remove o Fundo Branco das fotos
	 * 
	 * @param srcImg é um tipo Imagem, Imagem é a classe que possui o caminho da imagem que sofrerá a conversão
	 * @param nomeArquivo é o nome que será dado para o arquivo convertido (Ex: "imagemAlterada")
	 */
	public static void removerFundoBranco(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		boundaryFill(image.clone(), image, 0, 0, Color.white, 150);
		image.setAlphaByColor(0, 0xFFFFFFFF);
		alphaBoundary(image, 5);
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".png"));
	}
	
	/** 
	 * Este método deixa as imagens em Branco e Preto
	 * 
	 * @param srcImg é um tipo Imagem, Imagem é a classe que possui o caminho da imagem que sofrerá a conversão
	 * @param nomeArquivo é o nome que será dado para o arquivo convertido (Ex: "imagemAlterada")
	 */
	public static void brancoePreto(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		blackAndWhite(image.clone(), image, 152);
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));
	}
	
	/** 
	 * Este método inverte as cores de uma imagem
	 * 
	 * @param srcImg é um tipo Imagem, Imagem é a classe que possui o caminho da imagem que sofrerá a conversão
	 * @param nomeArquivo é o nome que será dado para o arquivo convertido (Ex: "imagemAlterada")
	 */
	public static void inverterCores(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		invertColors(image.clone(), image);
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));
	}
	
	/** 
	 * Este método aplica escala de cinza na imagem
	 * 
	 * @param srcImg é um tipo Imagem, Imagem é a classe que possui o caminho da imagem que sofrerá a conversão
	 * @param nomeArquivo é o nome que será dado para o arquivo convertido (Ex: "imagemAlterada")
	 */
	public static void escalaCinza(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		grayScale(image.clone(), image);
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));
	}

}
