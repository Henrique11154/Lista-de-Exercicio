import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número(positivo): ");
        double n1 = entrada.nextFloat();

        double quadrado = n1*n1;
        double raiz = Math.sqrt(n1);
        
        if(n1>0){
            System.out.println("Quadrado do número: "+quadrado);
            System.out.println("Raiz do número: "+raiz);
        }else{
            System.out.println("O número não é positivo.");
        }
        entrada.close();
    }
}
