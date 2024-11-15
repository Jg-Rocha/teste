package exercicios;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        double resultado= infomacaodoRaioDoCirculo();
        System.out.println("O resultado da área do círculo ao quadrado: "+ resultado);

    }

    public static double  infomacaodoRaioDoCirculo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o RC (Raio do círculo )");
        double RC = input.nextInt();
        input.close();
        double resultado = resultadoDoRaioeaAreaDoCirculo(RC);
         return resultado;
    }

    public static double resultadoDoRaioeaAreaDoCirculo(double RC){
        double resultado;
        double PI = 3.14;

         resultado = PI*Math.pow( RC, 2);
         return resultado;
    }
}
