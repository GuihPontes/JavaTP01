import java.util.Scanner;

public class TP01Ex07 {

    public static void main(String[] args)
    {
        //Nomes : Guilherme Pontes e Rodrigo Rebelo
        //7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
        //digitados.

        Scanner ler =  new Scanner(System.in);
        System.out.println("Entre com o primeiro valor : ");
        double n1 = ler.nextDouble();
        System.out.println("Entre com o segundo valor : ");
        double n2 = ler.nextDouble();

        double media = n1*n2;
        media = Math.sqrt(media);
        System.out.println("A média geometrica é : "+media);

    }

}
