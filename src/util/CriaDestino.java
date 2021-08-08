package util;

public class CriaDestino {
	
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
