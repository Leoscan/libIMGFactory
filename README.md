## Lib IMGFactory
Lib desenvolvida utilizando padrão Java Eclipse, com o intuito de fazer trabalhos de imagem utilizando JAVA. 

Para Ver Testes [JUNIT](https://github.com/Leoscan/TestesLibJunit) <- clique aqui

Para Ver Informações da [LIB](https://github.com/Leoscan/TrabalhoLIB) <- clique aqui

## Dependencia
```
Marvin Project
```
link para Acessar a pagina do [Marvin](http://marvinproject.sourceforge.net/en/index.html).

## Utilidades 

Atualmente o projeto IMGFactory conta com:
- Conversores de Extensão, Trabalhando com Imagens:
    - JPG, 
    - PNG, 
    - BMP.
- ByteCode 
    - Gerando Imagens em Base64,
    - Convertendo Base64 em Imagem.
- Trabalho de Cores 
    - Remover Fundo Branco,
    - Branco e Preto,
    - Inverter Cores,
    - Escala de Cinza.
- Dimensão
    - Redimensionar
    - Inverter Horizontalmente,
    - Inverter Verticalmente.

## Exemplos 
```java
/*Gerando Base64*/    
Imagem cryptex = new Imagem();
  //definindo o PATH da Imagem
  String helper = System.getProperty("user.dir");
  cryptex.setPath(helper + "/src/IMGTeste/Cryptex.jpg");
  
//chamando metodo estatico para geração do ByteCode
String Base64 = ByteCode.geraBase64(cryptex);
System.out.println(Base64);
```

```java
/*Convertendo Imagem JPG para BMP*/
Imagem batman = new Imagem();
  //definindo o PATH da Imagem
  String helper = System.getProperty("user.dir");
  batman.setPath(helper + "/src/junitTestes/IMGTeste/batman.jpg");
  
//chamando o método padrão Design Pattern Strategy
Conversor.fazerConversao(batman, "batmanBMP", new BMP());
```









