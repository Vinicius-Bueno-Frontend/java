package cursoJava;

public class Fundamentos {
    
    public static void main(String[] args) {
        double i = 10;
        System.out.println("Operadores Aritméticos e Atribuições");
        System.out.println("Exemplos:");
        // O sinal de "+" também tem a função de concatenador (unir textos). //
        System.out.println("i = " + i);
        // Soma (+)
        System.out.println("i = " + i + " + 5 | i = " + (i + 5));
        // Subtração (-)
        System.out.println("i = " + i + " - 5 | i = " + (i - 5));
        // Multiplicação (*)
        System.out.println("i = " + i + " * 5 | i = " + (i * 5));
        // Divisão (/)
        System.out.println("i = " + i + " / 5 | i = " + (i / 5));
        // Resto da Divisão (%) também é chamado de "mod".
        System.out.println("i = " + i + " % 5 | i = " + (i % 5));
        // += Soma o valor a variável.
        System.out.println("i += 5        | i = " + (i += 5));
        // -= Subtrai o valor a variável.
        System.out.println("i -= 5        | i = " + (i -= 5));
        // *= Multiplica o valor a variável.
        System.out.println("i *= 5        | i = " + (i *= 5));
        // /= Dividi o valor a variável.
        System.out.println("i /= 5        | i = " + (i /= 5));
        // i++ é um incrementador. Adiciona 1 a variável.
        i++;
        System.out.println("i++           | i = " + i);
        // i-- é um decrementador. Subtrai 1 da variável.
        i--;
        System.out.println("i--           | i = " + i);

    }
}
