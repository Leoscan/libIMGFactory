package classe.imagens;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import util.CriaDestino;

public class Imagem {
	private String path;
	private String Destino;
	private Extensoes extensao;

	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		Path file = new File(path).toPath();
		boolean exists = Files.exists(file);
		 
		if (exists) {
			this.path = path;
			setDestino(path);
		} else System.out.println("Não Foi Possivel Encontrar o Arquivo (Verifique se foi especificado o caminho corretamente)");
	}
	
	public String getDestino() {
		return Destino;
	}

	private void setDestino(String destino) {
		destino = CriaDestino.defineDestino(destino);
		Destino = destino;
	}

	Extensoes getExtensao() {
		return extensao;
	}

	public void setExtensao(Extensoes extensao) {
		this.extensao = extensao;
	}
	
	
	
}
