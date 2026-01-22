public class utilitats {

    // Suma dos números
    public static int suma(int a, int b) {
        return a + b;
    }

    // Resta dos números
    public static int resta(int a, int b) {
        return a - b;
    }

    // Comprueba si un número es par
    public static boolean esParell(int n) {
        return n % 2 == 0;
    }

    // Comprueba si un número es positivo
    public static boolean esPositiu(int n) {
        return n > 0;
    }

    // Divide dos números
    public static int divideix(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No es pot dividir per zero");
        }
        return a / b;
    }

    // Arrel quadrada entera
    public static int arrelQuadradaEntera(int n) {
        if (n < 0) {
            throw new ArithmeticException("No existeix arrel quadrada entera de negatius");
        }
        return (int) Math.sqrt(n);
    }

    // Retorna una salutació si el nom és vàlid
    public static String saludaSiNomValid(String nom) {
        if (nom == null) return null;
        if (nom.trim().isEmpty()) return null;
        return "Hola, " + nom.trim() + "!";
    }

    // Retorna la primera lletra d’un text
    public static String trobaInicial(String text) {
        if (text == null) return null;
        text = text.trim();
        if (text.isEmpty()) return null;
        return text.substring(0, 1);
    }
}
