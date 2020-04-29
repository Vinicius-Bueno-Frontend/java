package cursoJava;

public class Fundamentos {
    
    public static void main(String[] args) {
        // String: Usada para caracteres.
        String nome;
        // int: variável que utiliza APENAS números inteiros.
        int idade = 19;
        // char: essa variável só aceita um caractere. Sempre inicializada 
        // com aspas simples.
        char sexo ='M';
        // double: variável que usa valores inteiros e decimais. Para decimais,
        // se usa "."
        double temperatura = 26.7;
        // boolean: Só aceitam dois valores - Verdadeiro ou Falso //
        boolean arCondicionado = false;
        nome = "Vinicius Bueno Silva";
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Ar condicionado: " + arCondicionado);
    }
}
