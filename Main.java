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

        Questao q3 = new Questao();
        q3.pergunta = "QUESTÃO 3- É correto afirmar que Tiradentes foi:";
        q3.opcaoA = "A) Líder da Guerra dos Mascates";
        q3.opcaoB = "B) Líder da Guerra dos Emboabas";
        q3.opcaoC = "C) Líder da Guerra dos Canudos";
        q3.opcaoD = "D) Líder da Conjuração Baiana";
        q3.opcaoE = "E) Líder da Inconfidência Mineira";
        q3.correta = "E";
        questoes.add(q3);

        Questao q4 = new Questao();
        q4.pergunta = "QUESTÃO 4- Quem unificou o Egito?";
        q4.opcaoA = "A) Quéops";
        q4.opcaoB = "B) Menés ";
        q4.opcaoC = "C) Tutankamon";
        q4.opcaoD = "D) Ramsés";
        q4.opcaoE = "E) Tutmés II";
        q4.correta = "B";
        questoes.add(q4);
        
        Questao q5 = new Questao();
        q5.pergunta = "QUESTÃO 5- Quando foi firmado o Tratado de Tordesilhas";
        q5.opcaoA = "A) 1 de janeiro de 1593";
        q5.opcaoB = "B) 21 de abril de 1792 ";
        q5.opcaoC = "C) 22 de abril de 1500";
        q5.opcaoD = "D) 7 de junho de 1494";
        q5.opcaoE = "E) 12 de outubro de 1492";
        q5.correta = "D";
        questoes.add(q5);

        Questao q6 = new Questao();
        q6.pergunta = "QUESTÃO 6- O líder da Inconfidência Mineira, conhecido por Tiradentes, chamava-se:";
        q6.opcaoA = "A) Washington Luís";
        q6.opcaoB = "B) José Bonifácio";
        q6.opcaoC = "C) Joaquim José da Silva Xavier ";
        q6.opcaoD = "D) Joaquim Nabuco";
        q6.opcaoE = "E) Eusébio de Queirós";
        q6.correta = "C";
        questoes.add(q6);

        Questao q7 = new Questao();
        q7.pergunta = "QUESTÃO 7- Com que idade Dom Pedro II tornou-se imperador do Brasil?\n";
        q7.opcaoA = "A) 8 anos";
        q7.opcaoB = "B) 5 anos";
        q7.opcaoC = "C) 10 anos";
        q7.opcaoD = "D) 21 anos";
        q7.opcaoE = "E) 31 anos";
        q7.correta = "C";
        questoes.add(q7);

        Questao q8 = new Questao();
        q8.pergunta = "QUESTÃO 8- Quem foi o primeiro presidente dos Estados Unidos?";
        q8.opcaoA = "A) Abraham Lincoln";
        q8.opcaoB = "B) George Washington";
        q8.opcaoC = "C) Thomas Jefferson";
        q8.opcaoD = "D) John Adams";
        q8.opcaoE = "E) James Madison";
        q8.correta = "B";
        questoes.add(q8);

        Questao q9 = new Questao();
        q9.pergunta = "QUESTÃO 9- Qual foi a principal causa da Primeira Guerra Mundial?";
        q9.opcaoA = "A) A morte do arquiduque Francisco Ferdinando";
        q9.opcaoB = "B) A invasão da Polônia";
        q9.opcaoC = "C) A Revolução Russa";
        q9.opcaoD = "D) A crise dos mísseis de Cuba";
        q9.opcaoE = "E) A Guerra Civil Americana";
        q9.correta = "A";
        questoes.add(q9);

        Questao q10 = new Questao();
        q10.pergunta = "QUESTÃO 10- Quem descobriu o Brasil?";
        q10.opcaoA = "A) Cristóvão Colombo";
        q10.opcaoB = "B) Fernão de Magalhães";
        q10.opcaoC = "C) Vasco da Gama";
        q10.opcaoD = "D) Pedro Álvares Cabral";
        q10.opcaoE = "E) Américo Vespúcio";
        q10.correta = "D";
        questoes.add(q10);

        Questao q11 = new Questao();
        q11.pergunta = "QUESTÃO 11- Qual foi o primeiro país a abolir a escravidão?";
        q11.opcaoA = "A) Estados Unidos";
        q11.opcaoB = "B) Brasil";
        q11.opcaoC = "C) França";
        q11.opcaoD = "D) Inglaterra";
        q11.opcaoE = "E) Haiti";
        q11.correta = "E";
        questoes.add(q11);

        Questao q12 = new Questao();
        q12.pergunta = "QUESTÃO 12- Quem foi o líder da Revolução Francesa?";
        q12.opcaoA = "A) Maximilien Robespierre";
        q12.opcaoB = "B) Luís XVI";
        q12.opcaoC = "C) Napoleão Bonaparte";
        q12.opcaoD = "D) Jean-Paul Marat";
        q12.opcaoE = "E) Georges Danton";
        q12.correta = "A";
        questoes.add(q12);

        Questao q13 = new Questao();
        q13.pergunta = "QUESTÃO 13- Qual foi o evento que marcou o início da Idade Média?";
        q13.opcaoA = "A) A ascensão do Império Bizantino";
        q13.opcaoB = "B) A descoberta da América";
        q13.opcaoC = "C) A Revolução Industrial";
        q13.opcaoD = "D) A queda do Império Romano do Ocidente";
        q13.opcaoE = "E) A Guerra dos Cem Anos";
        q13.correta = "D";
        questoes.add(q13);

        Questao q14 = new Questao();
        q14.pergunta = "QUESTÃO 14- Quem foi o primeiro imperador de Roma?";
        q14.opcaoA = "A) Júlio César";
        q14.opcaoB = "B) Augusto";
        q14.opcaoC = "C) Nero";
        q14.opcaoD = "D) Calígula";
        q14.opcaoE = "E) Trajano";
        q14.correta = "B";
        questoes.add(q14);

        Questao q15 = new Questao();
        q15.pergunta = "QUESTÃO 15- Qual foi a principal causa da Revolução Industrial?";
        q15.opcaoA = "A) A Revolução Francesa";
        q15.opcaoB = "B) A descoberta da eletricidade";
        q15.opcaoC = "C) A invenção da máquina a vapor";
        q15.opcaoD = "D) A Guerra dos Trinta Anos";
        q15.opcaoE = "E) A colonização das Américas";
        q15.correta = "C";
        questoes.add(q15);


        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();
            if (questao.isCorreta(resposta)) {
                contadorCorretas++;
            }
        }
        Util.rodape(contadorCorretas, questoes.size());
    }
}