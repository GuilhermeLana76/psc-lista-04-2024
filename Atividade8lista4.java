import java.util.Scanner;
 public class Atividade8lista4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // recebendo os números []
        System.out.println("Favor ensira o primeiro número");
        double n1 = scanner.nextDouble();
        System.out.println("Favor ensira o segundo número");
        double n2 = scanner.nextDouble();
        System.out.println("Favor ensira o terceiro número");
        double n3 = scanner.nextDouble();
        System.out.println("Favor ensira o quarto número");
        double n4 = scanner.nextDouble();
        System.out.println("Favor ensira o quinto número");
        double n5 = scanner.nextDouble();

        // Fazendo a soma 
        double soma = 0;
        soma = soma + n1 + n2 + n3 + n4 + n5;
        System.out.println("A soma dos números é:" + soma);

        // Fazendo a media 
        double media;
        media = soma / 5;
        System.out.println("A media dos números é:" + media);

     scanner.close();
    }
}