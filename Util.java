import java.util.Scanner;
public class util {
    public static void cabecalho() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CENTRO UNIVERSITÁRIO ALFREDO NASSER");
        System.out.println("ALUNO: João Paulo Rodrigues Souza Botelho");
        System.out.println("PROFESSOR: Brenno Pimenta Da Costa");
        System.out.println("");
        System.out.println("***********************************");
        System.out.println("SEJA BEM VINDO AO QUIZ DE HISTÓRIA!");
        System.out.println("A seguir terá um quiz de 15 perguntas do tema: HISTÓRIA GERAL! \nDIVERTA-SE!!!");
        System.out.println("***********************************");
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
        System.out.println("");
    }

    public static void rodape(int corretas, int quant){
        System.out.println("");
        System.out.println("***********************************");
        System.out.println("");
        System.out.println("VOCÊ ACERTOU " + corretas + " QUESTÕES!");
        System.out.println("VOCÊ ERROU " + (quant - corretas) + " QUESTÕES!");
        System.out.println("PORCENTAGEM DE ACERTOS:" +((100*corretas)/ quant));
        System.out.println("OBRIGADO POR JOGAR!");
        System.out.println("");
        System.out.println("***********************************");
    }
}