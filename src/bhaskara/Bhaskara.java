
package bhaskara;
import java.util.Scanner;

public class Bhaskara {

    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Escreva os valores: a, b e c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        delta d1 = new delta(a, b, c);
        d1.print();
    }
    
}
