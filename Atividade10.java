import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int z = entrada.nextInt();

        System.out.print("Digite um número para a media (1/2/3):");
        int media = entrada.nextInt();

        switch (media) {
            case 1:
                System.out.println("Geométrica:\n"+x*y*z);
                break;
            case 2:
                System.out.println("Ponderada:\n"+x+3*y+2*z*6);
                break;
            case 3:
                System.out.println("Aritimetica:\n"+x+y+z*3);
                break;
            default:
                System.out.println("Somente os números 1,2,3.");
                break;
        }
        entrada.close();
   
    }
}
