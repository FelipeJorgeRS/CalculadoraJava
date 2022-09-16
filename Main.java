import java.util.*;
import java.lang.Math;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    	
        System.out.println("Neste programa você digitará dois números que passarão pelas quatro operações matemáticas básicas:");
        System.out.println("SOMA, SUBTRAÇÃO, MULTIPLICAÇÃO e DIVISÃO obtendo seus respectivos resultados");
        int n1;
        
        System.out.println("Digite o Primeiro número: ");
        n1 = input.nextInt();
        int n2;
        
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();
        int soma;
        
        soma = n1 + n2;
        System.out.println("o resultado da SOMA é: " + soma);
        int subt;
        
        subt = n1 - n2;
        System.out.println("o resultado da SUBTRAÇÃO é: " + subt);
        int mult;
        
        mult = n1 * n2;
        System.out.println("o resultado da MULTIPLICAÇÃO é: " + mult);
        int divs;
        
        // conversão de variável double para resultado em número inteiro
        divs = (int) ((double) n1 / n2);
        System.out.println("o resultado da DIVISÃO é: " + divs);
    }
}
