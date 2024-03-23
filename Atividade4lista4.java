import java.util.Scanner;
public class Atividade4lista4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Setando população

        double paisA = 80000;
        double paisB = 200000;
        int anos = 0;
        
        while (paisA < paisB) {

           anos++;
           paisA = paisA + (0.03 * paisA);
           paisB = + paisB + (0.015 * paisB);
        }
        System.out.println("a cidade A passa a cidade B em:");
        System.out.println(anos + " anos");




        scanner.close();
    }
}