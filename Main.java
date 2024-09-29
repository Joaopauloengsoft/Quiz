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
        