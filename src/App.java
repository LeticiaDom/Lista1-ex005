import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double metro, cm; 
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor em metros: ");
        metro = sc.nextDouble(); 
        sc.close();

        cm = metro * 100; 

        System.out.println("A conversão para centímetros é: " + cm);
        
    }
}
