package exercicios;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int celsius = temperaturaFahreint();
        System.out.println("A temperatura em graus Celsius é: "+celsius);
         
    }
    public static int temperaturaFahreint(){
        int celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahreint ");
        int grausfahreint = input.nextInt();
        celsius = resposta (grausfahreint);
        input.close();
        return celsius;
    }
       
        public static int resposta (int grausfahreint){
        
            int celsius = 5*(grausfahreint - 32/9);

         return celsius; 

        }
    }

