//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Esse é o Screen Match");
//        System.out.println("Filme: Top Gun: Maverick");
//
//        int anoLancamento = 2022;
//        System.out.println("Ano de lançamento: " + anoLancamento);
//        boolean incluidoNoPlano = true;
//        double notaFilme = 8.1;
//
//        String nome = "Maria";
//        int idade = 30;
//        double valor = 55.9999;
//        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
//
//        String nome1 = "João";
//        int aulas = 4;
//
//        String mensagem = """
//                  Olá, %s!
//                  Boas vindas ao curso de Java.
//                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
//                  """.formatted(nome1, aulas);
//
//        System.out.println(mensagem);
//
//
//        String saudacao = "Olá, meu nome é ";
//        String nome2 = "Alice ";
//        String continuacao = "e minha idade é ";
//        int idade2 = 17;
//        System.out.println(saudacao + nome2 + continuacao + idade2);
//
//        double temperaturaCelsius = 20.5;
//        int temperaturaFahrenheit = (int) ((temperaturaCelsius * 1.8) + 32);
//        System.out.println(temperaturaFahrenheit);
//
//
//        double nota1 = 5.8;
//        int nota2 = 8;
//        double media = (nota1 + nota2) / 2;
//        System.out.println(media);
//
//        double mediaExata = (int) ((nota1 + nota2) / 2);
//        System.out.println(mediaExata);
//
//
//                char letra = 'A';
//                String palavra = "MARELO";
//
//                String mensagem1 = "A letra é " + letra + " e a palavra é " + palavra;
//
//                System.out.println(mensagem1);
//
//
//
//        double valorEmDolares = 5;
//        double valorEmReais = valorEmDolares * 4.94;
//        System.out.println(String.format("R$ %.2f",valorEmReais));
//
//
//                double precoOriginal = 150.0;
//
//                double percentualDesconto = 10.0;
//                double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
//                double novoPreco = precoOriginal - valorDesconto;
//
//                System.out.println("Preço original: R$" + precoOriginal);
//                System.out.println("Desconto: R$" + valorDesconto);
//                System.out.println("Novo preço com desconto: R$" + novoPreco);

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);



    }
}