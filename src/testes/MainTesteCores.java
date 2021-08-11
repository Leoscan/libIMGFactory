package testes;

import classe.imagens.Imagem;
import toolBox.Cores;

public class MainTesteCores {

	public static void main(String[] args) {
		Imagem batman = new Imagem();
		batman.setPath("/Users/Leo/Documents/Eclipse/IMGFactory/IMGTeste/batman.jpg");
		Imagem paisagem = new Imagem();
		paisagem.setPath("/Users/Leo/Documents/Eclipse/IMGFactory/IMGTeste/800x729.jpg");
		//Remover Fundo Branco
		Cores.removerFundoBranco(batman, "FundoRemovido");
		
		//deixa a imagem em branco e preto
		Cores.brancoePreto(batman, "batmanBrancoePreto");
		Cores.brancoePreto(paisagem, "paisagemBrancoePreto");

	}

}
