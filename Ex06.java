package exercicios;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        int areadoquadrado = informacoesdaAlturaeDoLadoDoQuadrado();
        System.out.println("A área do quadrado é " + areadoquadrado);
    }

    public static int informacoesdaAlturaeDoLadoDoQuadrado() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a altura do quadrado: ");
        int alturadoquadrado = input.nextInt();
        System.out.println("Digite o lado do quadrado: ");
        int ladodoquadrado = input.nextInt();
        input.close();
        int areadoquadrado = calculadordosLadoseDaAltura(alturadoquadrado, ladodoquadrado);
        return areadoquadrado;
    }

    public static int calculadordosLadoseDaAltura(int alturadoquadrado, int ladodoquadrado) {

        int areadoquadrado;

        areadoquadrado = alturadoquadrado * ladodoquadrado * 2;
        return areadoquadrado;

    }

}
