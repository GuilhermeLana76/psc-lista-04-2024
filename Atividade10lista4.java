import java.util.Scanner;
 public class Atividade10lista4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    //Recebendo os números
    System.out.println("Digite o primeiro número");
    int n1 = scanner.nextInt();

    System.out.println("Digite o segundo número");
    int n2 = scanner.nextInt();


    int maior = Math.max(n1,n2);
    int menor = Math.min(n1,n2); 

    while(menor < maior || maior > menor){
    menor++;
    System.out.print(" " + menor);
    }
    

        scanner.close();
    }
 }