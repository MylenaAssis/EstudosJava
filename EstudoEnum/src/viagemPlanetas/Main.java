package viagemPlanetas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Método para listar a lista do enum.
        Criando variável p para fazer iteração para cada valor do enum.
         */
        for (EnumPlanetas p : EnumPlanetas.values()) {
            //sout com formatação: uma string por linha, exibindo p
            System.out.printf("%s%n", p);
        }

        //criando a leitura de planeta para o usuário
        Scanner entrada = new Scanner(System.in);
        String planeta;

        System.out.println("Para onde deseja ir?");
        //A String planeta vai receber o valor lido no Scanner entrada. Como em nosso enum tudo foi registrado em maiúsculas, uso o método .toUpperCase para converter a entrada para maiúscula.
        planeta = entrada.next().toUpperCase();
        //fechando o scanner
        entrada.close();

        //instanciando a classe ComentaPlaneta para chamar o método que comenta o planeta escolhido (viajarPlaneta). Objeto comenta.
        ComentaPlaneta comenta = new ComentaPlaneta(planeta);
        comenta.viajarPlaneta();
    }
}