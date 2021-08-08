package conversores;

import classes.Imagem;
import interfaces.InterfaceConverter;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;

public class JPG implements InterfaceConverter{
	
	public void converter(Imagem srcImg) {
		MarvinImage image = MarvinImageIO.loadImage(srcImg.getPath());
		String salvar = srcImg.getSalvarEm() +"ImagemConvertidaJPG.jpg";
		MarvinImageIO.saveImage(image, salvar);		
	}
}
