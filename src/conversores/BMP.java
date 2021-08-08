package conversores;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import classes.Imagem;
import interfaces.InterfaceConverter;

public class BMP implements InterfaceConverter{
	
	public void converter(Imagem srcImg) {
				
		File input = new File(srcImg.getPath());   
		BufferedImage image;
		
		try {
			
			image = ImageIO.read(input);
			
			String salvar = srcImg.getSalvarEm() +"ImagemConvertidaBMP.bmp";
			File output = new File(salvar);
			
			ImageIO.write(image, "bmp", output);
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
	
	}
}
