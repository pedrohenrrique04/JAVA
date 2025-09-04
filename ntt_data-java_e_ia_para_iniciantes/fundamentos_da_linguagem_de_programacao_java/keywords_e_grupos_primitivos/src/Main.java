public class Main {
    public static void main(String[] args) {
        byte number = 127;            // Máximo valor para byte
        short number1 = 32767;        // Máximo valor para short
        int number2 = 2147483647;     // Máximo valor para int
        long number3 = 9223372036854775807L; // Máximo valor para long (com 'L' no final)

        System.out.printf("Aqui estao os maiores valores de cada tipo sem ponto flutuante %s para byte, %s para short, %s para int e %s para long, esse valor maior colocamos um L no fim.\n", number, number1, number2, number3);

        float number4 = Float.MAX_VALUE;       // 3.4028235e+38f
        double number5 = Double.MAX_VALUE;     // 1.7976931348623157e+308d

        System.out.println("O maior valor para float e "+ number4);
        System.out.println("O maior valor para double e "+ number5);

        char caractere = 'a'; //  Use quando quiser representar um único caractere (letra, número ou símbolo).
        String palavras = "Use quando quiser representar palavras, frases ou qualquer sequência de caracteres.";

        boolean boll = false;
    }
}