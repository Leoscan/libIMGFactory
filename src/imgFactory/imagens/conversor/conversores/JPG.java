package imgFactory.imagens.conversor.conversores;

import imgFactory.imagens.Imagem;
import imgFactory.imagens.conversor.interfaces.InterfaceConverter;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

public class JPG implements InterfaceConverter{
	
	public void converter(Imagem srcImg, String nomeSegundoArquivo) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		String salvar = srcImg.getDestino() + nomeSegundoArquivo + ".jpg";
		MarvinImageIO.saveImage(image, salvar);		
	}
}
