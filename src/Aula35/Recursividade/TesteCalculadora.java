package Aula35.Recursividade;

public class TesteCalculadora {
    public static void main(String[] args) {
        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Calculadora.fatorialRecursivo(5);
        System.out.println(fatorialR);

    }
}
