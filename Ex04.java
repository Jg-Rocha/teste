package exercicios;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
       coletordeNumero();
    }

    public static int coletordeNumero(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor de n1");
		int n1= input.nextInt(); 
        input.close(); 

        sinalizadordoNumero(n1);
        return n1;
        
    }

    public static void sinalizadordoNumero(int n1) {
        if (n1 > 0){
            System.out.println("O valor é positivo");
        }
        else if (n1 < 0){
            System.out.println("O valor é negativo");
        }
       
    } 
}
