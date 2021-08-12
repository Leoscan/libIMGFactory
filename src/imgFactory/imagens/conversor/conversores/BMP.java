package imgFactory.imagens.conversor.conversores;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import imgFactory.imagens.Imagem;
import imgFactory.imagens.conversor.interfaces.InterfaceConverter;

/**
 * 
 * Detalhamento da Classe BMP
 * Essa classe possui o metodo de conversão para BMP, 
 * pode ser convertido JPG e PNG para BMP.
 * 
 * @author leofelixscandura@gmail.com 
 */
public class BMP implements InterfaceConverter{
	
	/**
	 * @param srcImg é um tipo Imagem, Imagem é a classe que possui o caminho da imagem que sofrerá a conversão
	 * @param nomeSegundoArquivo é o nome que será dado para o arquivo convertido (Ex: "imagemConvertidaBMP")
	 * 
	 */
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
