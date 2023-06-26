import java.util.*;
class Primeiro {
    public static void main(String[] args) {
    System.out.println("Boa tarde! Nova linha.");
    System.out.print("Este texto ");
    System.out.print("na mesma linha! ");
    System.out.println(43);
    System.out.println();
    /* 
    Isso 
    é um comentário de 
    múltiplas linhas 
    */  
    int a, b, c; //comentario de uma única linha
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o primeiro valor: ");
    a = Integer.parseInt(entrada.nextLine());
    System.out.print("Digite o segundo valor: ");
    b = Integer.parseInt(entrada.nextLine());
    c = a + b;
    System.out.println("Resultado: " + c);
    /*
     * próximo teste é de incremento e decremento
     */
    int x;
    x = 2;
    System.out.println("x: " + x);
    System.out.println("x++: " + x++);
    System.out.println("x: " + x);
    System.out.println("++x: " + ++x);
    System.out.println("x: " + x);
    System.out.println("x--: " + x--);
    System.out.println("x: " + x);
    System.out.println("--x: " + --x);
    System.out.println("x: " + x);

    }
    }