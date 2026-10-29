package simulador;
import java.util.Scanner;

public class ValidaSenhaForte {
    public static void main(String[] args) {

        int caracterM = 8;
        Scanner dados = new Scanner(System.in);
        boolean senhaValida = false;

        System.out.println("Digite seu nome : ");
        String nome = dados.nextLine();

        while (!senhaValida) {
            System.out.println("Digite a senha desejada: ");
            String senha = dados.nextLine();

            boolean tem_numero = senha.chars().anyMatch(Character::isDigit);
            
            boolean tem_maiuscula = senha.chars().anyMatch(Character::isUpperCase);
            
            String[] senhasObvias = {"12345678", "senha123", "admin123"};
            
            boolean obviodemaisnovin = false;

            for (int i = 0; i < senhasObvias.length; i++ ) {
                if (senha.equals(senhasObvias[i])) {
                    obviodemaisnovin = true;
                    break;
                }
            }

            if (senha.length() < caracterM) {
                System.out.println("O tamanho mínimo da senha são 8 caracteres");
            } 
            else if (!tem_numero) {
                System.out.println("A senha precisa de números");
            } 
            else if (obviodemaisnovin) {
                System.out.println("Tá querendo ser roubado mano ? Melhore ");
            } 
            else if (!tem_maiuscula) {
                System.out.println("A senha precisa conter pelo menos uma letra maiúscula.");
            } 
            else {
                System.out.println(nome + " senha dentro do padrão ! ");
                System.out.println("Seja muito bem vindo!");
                senhaValida = true; 
            }
        }

        dados.close();
    }
}
