import java.util.*;
import java.lang.Math;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    	
        System.out.println("Neste programa voc� digitar� dois n�meros que passar�o pelas quatro opera��es matem�ticas b�sicas:");
        System.out.println("SOMA, SUBTRA��O, MULTIPLICA��O e DIVIS�O obtendo seus respectivos resultados");
        int n1;
        
        System.out.println("Digite o Primeiro n�mero: ");
        n1 = input.nextInt();
        int n2;
        
        System.out.print("Digite o segundo n�mero: ");
        n2 = input.nextInt();
        int soma;
        
        soma = n1 + n2;
        System.out.println("o resultado da SOMA �: " + soma);
        int subt;
        
        subt = n1 - n2;
        System.out.println("o resultado da SUBTRA��O �: " + subt);
        int mult;
        
        mult = n1 * n2;
        System.out.println("o resultado da MULTIPLICA��O �: " + mult);
        int divs;
        
        // convers�o de vari�vel double para resultado em n�mero inteiro
        divs = (int) ((double) n1 / n2);
        System.out.println("o resultado da DIVIS�O �: " + divs);
    }
}
