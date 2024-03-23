import java.util.Scanner;
 public class Atividade6lista4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numeroA = 0;
        int numeroB = 0;
    
    //Números um acima do outro

        while (numeroA < 20){
        numeroA++;
        System.out.println(numeroA);
        }

    //Números um ao lado do outro 

        while (numeroB < 20){
        numeroB++;
        System.out.print(" " + numeroB);
        
        }


        scanner.close();
    }
 }