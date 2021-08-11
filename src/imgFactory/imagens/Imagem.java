package imgFactory.imagens;

import java.io.File;

import imgFactory.imagens.util.CriaDestino;

public class Imagem {
	//atributos
	private String path;
	private String Destino;
	private Extensoes extensao;
	
	//construtores
	public Imagem(String path, String destino, Extensoes extensao) {
		setPath(path);
		setExtensao(extensao);
	}
	public Imagem() {
		
	}

	//Get e Set
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		//Verificando se o arquivo existe no path passado
		File f = new File(path);
		
		if (f.exists() && !f.isDirectory()) {
			this.path = path;
			setDestino(path);
		} else System.out.println("Não Foi Possivel Encontrar o Arquivo (Verifique se foi especificado o caminho corretamente)");
	}
	
	public String getDestino() {
		return Destino;
	}

	private void setDestino(String destino) {
		//definindo o path apenas eliminando o nome do arquivo
		destino = CriaDestino.defineDestino(destino);
		Destino = destino;
	}

	Extensoes getExtensao() {
		return extensao;
	}

	public void setExtensao(Extensoes extensao) {
		this.extensao = extensao;
	}
	
	//to String
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n-------------\n");
		builder.append("Path: ");
		builder.append(path);
		builder.append("\nDestino: ");
		builder.append(Destino);
		builder.append("\nExtensao: ");
		builder.append(extensao);
		builder.append("\n-------------\n");
		return builder.toString();
	}
	
	
	
	
}
