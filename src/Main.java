import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //media de notas
        System.out.println("escreva a nota 1: ");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.println("escreva a nota 2: ");
        double nota2 = Double.parseDouble(scanner.nextLine());

        System.out.println("escreva a nota 3: ");
        double nota3 = Double.parseDouble(scanner.nextLine());

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("a media das notas e: " + media);

        // conversor de temperatura
        System.out.println("digite a temperatura em fahrenheit: ");
        double fah = Double.parseDouble(scanner.nextLine());
        double celsius = (fah - 32) / 9 * 5;
        System.out.println("a temperat em celsius: " + celsius);


        // verficador de impar e par
        System.out.println("digite um numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        if (numero % 2 == 0) {
            System.out.println(numero + " e um numero par ");
        } else {
            System.out.println(numero + " e um numero impar ");
        }

        // calculadora de multa
        int limite = 80;
        int considerado;
        int multa;
        int diferenca;
        System.out.println("digite a velocidade: ");
        int velocidade = Integer.parseInt(scanner.nextLine());

        if (velocidade > limite) {
            if (limite <= 100) {
                considerado = velocidade + 7;
            } else {
                considerado = velocidade + (int) (velocidade * 0.1);
            }
            diferenca = considerado - limite;
            multa = diferenca * 10;
        } else {
            multa = 0;
        }
        System.out.println("o valor da multa e  " + multa);


        // descobrir qual e o dia
        System.out.println("digite o numero do dia:  ");
        int dia = Integer.parseInt(scanner.nextLine());

        switch (dia) {
            case 1 -> System.out.println("hoje e domingo");
            case 2 -> System.out.println("hoje e segunda");
            case 3 -> System.out.println("hoje e terca ");
            case 4 -> System.out.println("hoje e quarta ");
            case 5 -> System.out.println("hoje e quinta ");
            case 6 -> System.out.println("hoje e sexta ");
            case 7 -> System.out.println("hoje e sabado ");
            default -> System.out.println("erro");
        }

        //soma de numeros pares
        int soma = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("soma de todos numeros pares " + soma);


        // soma de medias com loop
        int n = 1;
        double nota = 0.0;
        double mmedia = 0.0;
        while (true) {

            System.out.println("digite a nota " + n + ":");
            String line = scanner.nextLine();

            if (line.equals("")) {
                n--;
                break;
            }

            nota += Double.parseDouble(line);
            n++;

        }
        mmedia = nota / n;
        System.out.println("a media de notas e: " + mmedia);


        //tabuada de um numero
        System.out.println("digite o numero que deseja fazer tabuada ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = " + num * i);

        }

    }
}