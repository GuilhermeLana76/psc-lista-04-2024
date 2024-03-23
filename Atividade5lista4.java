import java.util.Scanner;
public class Atividade5lista4{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

                // Setando população

                System.out.println("Favor ensira a população do pais A");
                double paisA = scanner.nextDouble();
                System.out.println("Favor ensira a população do pais B");
                double paisB = scanner.nextDouble();
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
    
