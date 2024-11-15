package exercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        int maior = maiorNumeroInteiro();
        System.out.println("O maior número é: " + maior);

    }

    public static int maiorNumeroInteiro(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o valor de n1 ");
        int n1 = input.nextInt();
        System.out.println("Digite o valor de n2 ");
        int n2 = input.nextInt();
        System.out.println("Digite o valor de n3");
        int n3 = input.nextInt();
        input.close();
        int maior = indentificadorDoMaiorInteiro(n1,n2,n3);
        return maior;
    }

    public static int indentificadorDoMaiorInteiro(int n1,int n2,int n3){
        int maior = n1;
    
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }
      return maior;
    }
}
