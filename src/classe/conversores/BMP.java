package classe.conversores;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import classe.imagens.Imagem;
import interfaces.InterfaceConverter;

public class BMP implements InterfaceConverter{
	
	public void converter(Imagem srcImg, String nomeSegundoArquivo) {
				
		File input = new File(srcImg.getPath());   
		BufferedImage image;
		
		try {
			
			image = ImageIO.read(input);
			
			String salvar = srcImg.getDestino() + nomeSegundoArquivo+ ".bmp";
			File output = new File(salvar);
			
			ImageIO.write(image, "bmp", output);
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
	
	}
}
