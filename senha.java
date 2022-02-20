
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import  java.util.Scanner;

class Senha {

    public static void main(String[] args) {
        try (Scanner nome = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            String nome_usuario = nome.nextLine();
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Digite a senha: ");
                String senha = sc.nextLine();
                Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&+])(?=\\S+$).{6,20}$");
                Matcher m = p.matcher(senha);
                if(m.matches()){
                    System.out.println("Ok, Senha Forte");
                }else{
                    System.out.println("Tente novamente. Senha fraca");
                }

                System.out.println("Nome: " + nome_usuario + " Senha: " + senha);
            }
        }
    }
    
    
}