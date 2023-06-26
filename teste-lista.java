import java.util.*;

class ListaNumeros { //removi o "public" antes do "class" porque tava dando erro: Exception in Thread “main” java.lang.error: Unresolved Compilation Problem"

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Lendo a lista de números
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        // Imprimindo a lista de números
        System.out.println("Números digitados: " + numeros);
    }
}

