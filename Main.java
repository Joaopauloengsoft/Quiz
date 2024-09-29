import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contadorCorretas = 0;
        Util.cabecalho();
        Scanner scanner = new Scanner(System.in);
        List<Questao> questoes = new ArrayList<>();

        Questao q1 = new Questao();
        q1.pergunta = "QUESTÃO 1- Quem foi D. João VI?";
        q1.opcaoA = "A) Rei de Portugal";
        q1.opcaoB = "B) Rei da Espanha";
        q1.opcaoC = "C) Rei da Inglaterra";
        q1.opcaoD = "D) Rei da França";
        q1.opcaoE = "E) Rei da Itália";
        q1.correta = "A";
        questoes.add(q1);

        Questao q2 = new Questao();
        q2.pergunta = "QUESTÃO 2- Onde e quando ocorreu a Guerra dos Canudos?";
        q2.opcaoA = "A) Interior de São Paulo, entre 1896 e 1899";
        q2.opcaoB = "B) Interior da Bahia, entre 1896 e 1897 ";
        q2.opcaoC = "C) Interior do Rio de Janeiro, entre 1897 e 1899";
        q2.opcaoD = "D) Interior do Rio Grande do Sul, entre 1896 e 1899";
        q2.opcaoE = "E) Interior de Minas Gerais, entre 1896 e 1897";
        q2.correta = "B";
        questoes.add(q2);
    }
}