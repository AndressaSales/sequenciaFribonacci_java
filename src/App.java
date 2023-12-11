import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        Scanner tela11 = new Scanner(System.in);

        int anterior = 0;
        int atual = 1;
        int proximo = 1;

        System.out.println("Sequência de Fribonacci");
        System.out.println("Digite um número: ");
        int num = tela11.nextInt();

        for(int i = 0; i < num; i++){
            anterior = atual + proximo;
            atual = proximo;
            proximo = anterior;
            System.out.print(proximo);
        }
        
    }
}
