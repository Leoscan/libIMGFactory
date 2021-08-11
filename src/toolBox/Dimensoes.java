package toolBox;

import static marvin.MarvinPluginCollection.scale;

import classe.imagens.Imagem;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

public class Dimensoes {
	public static void redimensionar(Imagem srcImg, String nomeArquivo, int Altura, int Largura) {
		
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		scale(image.clone(), image, Altura, Largura); 
		MarvinImageIO.saveImage(image, (srcImg.getDestino() + nomeArquivo + ".jpg"));
	}
}
