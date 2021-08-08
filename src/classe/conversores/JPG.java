package classe.conversores;

import classe.imagens.Imagem;
import interfaces.InterfaceConverter;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

public class JPG implements InterfaceConverter{
	
	public void converter(Imagem srcImg, String nomeSegundoArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		String salvar = srcImg.getDestino() + nomeSegundoArquivo + ".jpg";
		MarvinImageIO.saveImage(image, salvar);		
	}
}
