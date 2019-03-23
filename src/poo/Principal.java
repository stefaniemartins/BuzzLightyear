package poo;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Buzz buzz;

        Scanner teclado = new Scanner(System.in);

        int quantidadeBuzz = 4;
        String linhas = "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500";

        while ((quantidadeBuzz < 1) || (quantidadeBuzz > 3))
        {
            System.out.println("\u250C" + linhas + linhas + linhas + linhas + linhas + linhas + "\u2510");
            System.out.println("\u2502      Digite quantos Buzz Lightyear você deseja criar:      \u2502");
            System.out.println("\u2502                                                            \u2502");
            System.out.println("\u2502      (1) 1 Buzz Lightyear.                                 \u2502");
            System.out.println("\u2502      (2) 2 Buzz Lightyear.                                 \u2502");
            System.out.println("\u2502      (3) 3 Buzz Lightyear.                                 \u2502");
            System.out.println("\u2514" + linhas + linhas + linhas + linhas + linhas + linhas + "\u2518");

            quantidadeBuzz = teclado.nextInt();
        }

        for (int i = 0; i < quantidadeBuzz; i++)
        {
            buzz = new Buzz(false,false,false,false);
        }
    }
}