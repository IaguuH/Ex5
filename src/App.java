import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Metros - ");

        float metros = teclado.nextFloat();
        System.out.print("" + metros + " metros é igual a ");
        
        float centimetros = metros * 100;
        System.out.print(centimetros);
        System.out.print(" centimetros");
    }
}