import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            listaNumeros.add(i);
        }
        // System.out.println(listaNumeros);

        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for (Integer numero : listaNumeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            } else {
                numerosImpares.add(numero);
            }
        }

        System.out.println("Numeros pares:");
        numerosPares.forEach(pares -> System.out.println(pares));
        System.out.println("Numeros impares:");
        numerosImpares.forEach(impares -> System.out.println(impares));

    }
}