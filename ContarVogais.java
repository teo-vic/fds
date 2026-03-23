import java.util.Scanner;

public class ContarVogais{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ContadorVogais = 0;

        System.out.println("Digite uma palavra ou frase");
        String texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c== 'a' || c == 'e' || c == 'i' || c == 'u'){
                ContadorVogais++;
            }
        }
        System.out.println("quantidade de vogais: " + ContadorVogais);



        
        

    }
}