package exercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        double pesoIdeal = informacaoDoUsuario();
        System.out.println("O peso ideal de acordo com o seu gênero é: "+pesoIdeal); 
    }
    public static Double informacaoDoUsuario(){
      
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double altura = input.nextDouble();
        
        System.out.println("Digite o gênero da pessoa (1 para feminino e 2 para masculino): ");
        int genero = input.nextInt();
        input.close();
       
          double pesoIdeal= calculoDoPesoIdeal(altura, genero);

        return pesoIdeal;

    }

    public static double calculoDoPesoIdeal(double altura, int genero){
        
        double pesoIdeal = 0;
        if (genero == 2) {

                pesoIdeal = (72.7*altura) - 58;
            
        }else if (genero == 1) {
                 pesoIdeal = (62.1*altura) - 44.7;
        } else {
            System.out.println("Valor inserido inválido!");
        } 
        return pesoIdeal; 
    }       
}
