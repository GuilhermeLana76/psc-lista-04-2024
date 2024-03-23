import java.util.Scanner;
public class Atividade2lista4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Favor ensira o nome de usuário");
        String nome = scanner.next();

        System.out.println("Favor ensira a senha de usúario");
        String senha = scanner.next();

        while (nome.equals(senha)){
             System.out.println("usúario e senha iguais. Favor ensira novo nome de usúario"); 
             nome = scanner.next();
             System.out.println("favor ensira nova senha");
             senha = scanner.next();
        }
        System.out.println("Bem vindo " + nome);


        scanner.close();
    }
}
