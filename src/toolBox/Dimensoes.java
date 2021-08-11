package toolBox;

import static marvin.MarvinPluginCollection.*;

import classe.imagens.Imagem;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

public class Dimensoes {
	public static void redimensionar(Imagem srcImg, String nomeArquivo, int Altura, int Largura) {
		
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		scale(image.clone(), image, Altura, Largura); 
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));
	}
	
	public static void rotacionar(Imagem srcImg, String nomeArquivo, int Altura, int Largura) {
		
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		scale(image.clone(), image, Altura, Largura); 
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));

	}
	
	public static void inverterHorizontal(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		flipHorizontally(image.clone(), image); 
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));
	}
	
	public static void inverterVertical(Imagem srcImg, String nomeArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		flipVertically(image.clone(), image); 
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));

	}
	
}
