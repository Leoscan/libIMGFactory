package imgFactory.imagens.toolBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import imgFactory.imagens.Imagem;

/**
 *	Classe ByteCode faz parte da caixa de ferramentas, 
 *  contendo métodos uteis para trabalhar com imagens em Base64
 *  metodos para a geração da imagem em Base 64 e transformação da Base 64 de volta para imagem
 *  
 * @author leofelixscandura@gmail.com
 */
public class ByteCode {
	
	/**
	 * 
	 * @param srcImg é um tipo Imagem, Imagem é a classe que possui o caminho da imagem que sofrerá a conversão
	 * @return base64Image Retorna uma String com o texto da imagem em Base 64
	 */
	public static String geraBase64(Imagem srcImg){
		String base64Image = "";
		File file = new File(srcImg.getPath());
		
		try (FileInputStream imageInFile = new FileInputStream(file)) {
			// Converte Imegem para Base 64
			byte imageData[] = new byte[(int) file.length()];
			imageInFile.read(imageData);
			base64Image = Base64.getEncoder().encodeToString(imageData);
			
		} catch (FileNotFoundException e) {
			System.out.println("Imagem não encontrada" + e);
		} catch (IOException ioe) {
			System.out.println("Aconteceu algum problema ao codificar a imagem:  " + ioe);
		}
		return base64Image;
	}
	
	/**
	 * 
	 * @param base64 é um tipo String contendo o texto da imagem em Base 64
	 * @param SalvarEm PATH ou local para ser salva a imagem convertida  
	 */
	public static void converteBase64(String base64, String SalvarEm) {
		try (FileOutputStream imageOutFile = new FileOutputStream(SalvarEm)) {
			// Converting a Base64 String into Image byte array
			byte[] imageByteArray = Base64.getDecoder().decode(base64);
			imageOutFile.write(imageByteArray);
		} catch (FileNotFoundException e) {
			System.out.println("Caminho não encontrado" + e);
		} catch (IOException ioe) {
			System.out.println("Aconteceu algum problema ao decodificar a imagem: " + ioe);
		}
	}
}
