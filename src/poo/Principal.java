package poo;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Buzz buzz = new Buzz(false,false,false,false);

        Scanner teclado = new Scanner(System.in);

        int quantidadeBuzz = 4;
        String linhas = "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500";
        String linhasSuperiores = "\u250C" + linhas + linhas + linhas + linhas + linhas + linhas + "\u2510";
        String linhasInferiores = "\u2514" + linhas + linhas + linhas + linhas + linhas + linhas + "\u2518";

        while ((quantidadeBuzz < 1) || (quantidadeBuzz > 3))
        {
            System.out.println(linhasSuperiores);
            System.out.println("\u2502      Digite quantos Buzz Lightyear você deseja criar:      \u2502");
            System.out.println("\u2502                                                            \u2502");
            System.out.println("\u2502      (1) 1 Buzz Lightyear                                  \u2502");
            System.out.println("\u2502      (2) 2 Buzz Lightyear                                  \u2502");
            System.out.println("\u2502      (3) 3 Buzz Lightyear                                  \u2502");
            System.out.println(linhasInferiores);

            quantidadeBuzz = teclado.nextInt();
        }

        while ((quantidadeBuzz < 1) || (quantidadeBuzz > 5))
        {
            System.out.println(linhasSuperiores);
            System.out.println("\u2502        Digite qual parte que você deseja acessar:          \u2502");
            System.out.println("\u2502                                                            \u2502");
            System.out.println("\u2502        (1) Capacete                                        \u2502");
            System.out.println("\u2502        (2) Frases                                          \u2502");
            System.out.println("\u2502        (3) Laser                                           \u2502");
            System.out.println("\u2502        (4) Braços                                          \u2502");
            System.out.println("\u2502        (5) Asas                                            \u2502");
            System.out.println(linhasInferiores);

            quantidadeBuzz = teclado.nextInt();
        }

        if (quantidadeBuzz == 1)
        {
            System.out.println(linhasSuperiores);
            System.out.println("\u2502       Digite o que você deseja fazer com o capacete:       \u2502");
            System.out.println("\u2502                                                            \u2502");
            System.out.println("\u2502       (1) Verificar estado                                 \u2502");
            System.out.println("\u2502       (2) Abrir                                            \u2502");
            System.out.println("\u2502       (3) Fechar                                           \u2502");
            System.out.println(linhasInferiores);

            quantidadeBuzz = teclado.nextInt();

            if (quantidadeBuzz == 1)
            {
                if(buzz.isCapacete() == true)
                {
                    System.out.println("O capacete está aberto!");
                }

                else
                {
                    System.out.println("O capacete está fechado!");
                }
            }

            if (quantidadeBuzz == 2)
            {
                if(buzz.isCapacete() == true)
                {
                    System.out.println("O capacete já está aberto!");
                }

                else
                {
                    buzz.setCapacete(true);
                    System.out.println("O capacete foi aberto!");
                }
            }

            if (quantidadeBuzz == 3)
            {
                if(buzz.isCapacete() == false)
                {
                    System.out.println("O capacete já está fechado!");
                }

                else
                {
                    buzz.setCapacete(false);
                    System.out.println("O capacete foi fechado!");
                }
            }
        }
    }
}