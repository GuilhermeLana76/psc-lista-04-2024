import java.util.Scanner;
 public class Atividade7lista4{
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

        // conferindo o maior número
        double maior = Math.max(n1,(Math.max(n2,Math.max(n3, Math.max(n4,n5)))));

        // imprimindo o maior número 
        System.out.println("O maior número digitado foi" +maior);


        scanner.close();
    }
 }