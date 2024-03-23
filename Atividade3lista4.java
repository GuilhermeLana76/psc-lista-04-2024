import java.util.Scanner;
public class Atividade3lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Recebendo e verificando o nome
        System.out.println("Por Favor digite seu nome: ");
        String nome = scanner.next();

        while(nome.length() <= 3){
            System.out.println("Nome inválido. Digite um nome com mais de 3 caracteres:");
            nome = scanner.next();
        }
        System.out.println("Nome de usuário: " +nome);

        // Recebendo e verificando a idade
        System.out.println("Favor ensira sua idade");
        Double idade = scanner.nextDouble();

        while (idade <0 || idade >150) {
            System.out.println("Idade inválida. Favor ensira uma idade entre 0 e 150.");
            idade = scanner.nextDouble(); 
        }
        System.out.println("Idade de usuário: " + idade);

        // Recebendo e verificando o salário
        System.out.println("Favor ensira seu salario");
        Double salario = scanner.nextDouble();

        while ( salario <= 0 ){
            System.out.println("Salário inválido. Favor ensira um valor maior que 0: ");
            salario = scanner.nextDouble();
        }
        System.out.println("O salario do usúario é de:" +salario);

        // Recebendo e Validando o sexo 
        System.out.println("Favor selecione o sexo");
        System.out.println("M para masculino / F para feminino");
        String sexo = scanner.next();

        while (!sexo.equals("F") && !sexo.equals("M")) {
            System.out.println("Digito inválido. Favor ensira M ou F para selecionar o sexo.");
            sexo = scanner.next();        
        }
        if (sexo.equals("F")){
            System.out.println("O sexo selecionado é Feminio");
        }
        if (sexo.equals("M")) {
            System.out.println("o sexo selecionado é Masculino");           
        }

        // Recebendo e validando o estado civil
        System.out.println("Favor selecione o estado civil");
        System.out.println("S para Solteiro \nC para casado \nV para viúvo \nD para divórciado");
        String civil = scanner.next();

        while (!civil.equals("S") && !civil.equals("C") && !civil.equals("V") && !civil.equals("D")){
            System.out.println("Digito inválido. Favor ensira: S / C / V / D. Para selecionar o Estado Civil.");
            civil = scanner.next(); 
        }   
        if (civil.equals("S")){ System.out.println("O Estado civil selecionado foi: Solteiro");}
        if (civil.equals("C")){ System.out.println("O Estado civil selecionado foi: Casado");}
        if (civil.equals("V")){ System.out.println("O Estado civil selecionado foi: Viúvo");}
        if (civil.equals("D")){ System.out.println("O Estado civil selecionado foi: Divórciado");}

        
        scanner.close();
    } 
}
