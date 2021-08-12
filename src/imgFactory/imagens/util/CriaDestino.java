package imgFactory.imagens.util;

/**
 *	classe CriaDestino é uma classe útil
 * 	serve para converter o caminho de uma imagem para o destino da imagem
 *  
 * @author leofelixscandura@gmail.com
 *
 */
public class CriaDestino {
	
	/**
	 * @param Path é o caminho da imagem (/User/Exemplo/imagem.png)
	 * @return destino é o Destino da imagem baseado no PATH (/User/Exemplo/)
	 */
	public static String defineDestino(String Path) {		
		String[] separado = Path.split("/");
		
		if(separado.length > 1) {
			String destino = "";
			int count = 0;
			for (String palavra : separado) {
				if (count < separado.length - 1 ) {
					destino = destino + palavra + "/";
				}
				count++;
			}
			return destino;
		} else return Path;
	}

}
