package simulador;
import java.util.Scanner;

public class ValidaSenhaForte {
    public static void main(String[] args) {

    int caracterM = 8;
        
    Scanner dados = new Scanner(System.in);

    System.out.println("Digite seu nome de usuario: ");
    String nome = dados.nextLine();

    System.out.println("-----------");

    System.out.println("Digite a senha desejada: ");
    String senha = dados.nextLine();

    System.out.println("-----------");


    boolean tem_numero = senha.chars().anyMatch(Character::isDigit);
    String[] senhasObvias = {"12345678", "senha123", "admin123"};
    boolean obviodemaisnovin = false;


    if (senha.length() >= caracterM) {
        System.out.println("Padrão de quantidade dentro dos conformes");
        System.out.println("-----------");
    } else {
        System.out.println("O tamanho mínimo da senha são 8 caracteres");
        System.out.println("-----------");

    } if (tem_numero) {
        System.out.println("A senha possui número");
        System.out.println("-----------");
    } else {
        System.out.println("A senha precisa de números");
        System.out.println("-----------");

    } for (int i = 0; i < senhasObvias.length; i++ ) {
        if (senha.equals(senhasObvias[i])) {
            obviodemaisnovin = true;
            break;
        }

    }

    if (obviodemaisnovin) {
        System.out.println(" Tá querendo ser roubado mano ? Melhore ");
        System.out.println("-----------");

    } else {
        System.out.println("Senha dentro do padrão !");
    }


    dados.close();

    }
    
}
