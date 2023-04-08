import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a nota do 1º bimestre:");
        double nota1 = input.nextDouble();
        
        System.out.println("Digite a nota do 2º bimestre:");
        double nota2 = input.nextDouble();
        
        System.out.println("Digite a nota do 3º bimestre:");
        double nota3 = input.nextDouble();
        
        System.out.println("Digite a nota do 4º bimestre:");
        double nota4 = input.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A média bimestral é: %.2f", media);
        
        input.close();
    }
}
