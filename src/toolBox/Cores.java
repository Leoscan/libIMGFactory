package toolBox;

import java.awt.Color;
import classe.imagens.Imagem;

import static marvin.MarvinPluginCollection.*;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;



public class Cores {

	public static void removerFundoBranco(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		boundaryFill(image.clone(), image, 0, 0, Color.white, 150);
		image.setAlphaByColor(0, 0xFFFFFFFF);
		alphaBoundary(image, 5);
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".png"));
	}
	
	public static void brancoePreto(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		blackAndWhite(image.clone(), image, 152);
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));
	}
	
	public static void inverterCores(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		invertColors(image.clone(), image);
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));
	}
	
	public static void escalaCinza(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		grayScale(image.clone(), image);
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));
	}

}
