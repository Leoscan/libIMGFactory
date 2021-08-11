package imgFactory.junitTestes;

import org.junit.Test;

import imgFactory.imagens.Imagem;
import imgFactory.imagens.toolBox.Cores;

public class MainTesteCores {

	@Test
	public void testaRemFundo() {
		String helper = System.getProperty("user.dir");
		
		Imagem batman = new Imagem();
		batman.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/batman.jpg");
		//Remover Fundo Branco
		Cores.removerFundoBranco(batman, "FundoRemovido");
	}
	
	@Test
	public void testaBrancoePreto() {
		String helper = System.getProperty("user.dir");
		
		Imagem batman = new Imagem();
		batman.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/batman.jpg");
		Imagem paisagem = new Imagem();
		paisagem.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/800x729.jpg");
		
		//deixa a imagem em branco e preto
				Cores.brancoePreto(batman, "batmanBrancoePreto");
				Cores.brancoePreto(paisagem, "paisagemBrancoePreto");
		
	}
	
	@Test
	public void testaCoresInvertidas() {
		String helper = System.getProperty("user.dir");
		
		Imagem paisagem = new Imagem();
		paisagem.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/800x729.jpg");
		
		//deixa a imagem com cores invertidas
				Cores.inverterCores(paisagem, "paisagemCoresInvertidas");
		
	}
	
	@Test
	public void testaEscCinza() {
		String helper = System.getProperty("user.dir");
		
		Imagem paisagem = new Imagem();
		paisagem.setPath(helper + "/src/imgFactory/junitTestes/IMGTeste/800x729.jpg");
		//deixa a imagem com escala de cinza
				Cores.escalaCinza(paisagem, "paisagemCinza");
		
	}

}
