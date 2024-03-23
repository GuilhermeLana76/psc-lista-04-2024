import java.util.Scanner;

public class Atividade1lista4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Favor insira um número de 1 a 10");
        double numero = scanner.nextDouble();

        while(numero < 1 || numero > 10) {
        System.out.println("Favor Digitar um número válido");
        numero = scanner.nextDouble();
        }
        System.out.println("o número digitado foi:" + numero);
        

        scanner.close();

    }  
}
