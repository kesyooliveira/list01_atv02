import java.util.Scanner;

class list01_atv02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    int numero;   

    System.out.print("Informe um número: ");
    numero = sc.nextInt();

    System.out.print("O número informado foi " + numero);

    sc.close();
    }
}