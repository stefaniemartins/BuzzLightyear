package poo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Buzz buzz1;
        Buzz buzz2;
        Buzz buzz3;

        Buzz vetor[] = new Buzz[3];

        Scanner teclado = new Scanner(System.in);

        int quantidade = -1;
        int nBuzz = -1;
        int opcao;
        String linhas = "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500";
        String linhasSuperiores = "\u250C" + linhas + linhas + linhas + linhas + linhas + linhas + "\u2510";
        String linhasInferiores = "\u2514" + linhas + linhas + linhas + linhas + linhas + linhas + "\u2518";

        while ((quantidade < 1) || (quantidade > 3))
        {
            System.out.println(linhasSuperiores);
            System.out.println("\u2502      Digite quantos Buzz Lightyear você deseja criar:      \u2502");
            System.out.println("\u2502                                                            \u2502");
            System.out.println("\u2502      (1) 1 Buzz Lightyear                                  \u2502");
            System.out.println("\u2502      (2) 2 Buzz Lightyear                                  \u2502");
            System.out.println("\u2502      (3) 3 Buzz Lightyear                                  \u2502");
            System.out.println(linhasInferiores);

            quantidade = teclado.nextInt();
        }

        if (quantidade == 1)
        {
            vetor [0] = (buzz1 = new Buzz());
        }

        else if (quantidade == 2)
        {
            vetor [0] = buzz1 = new Buzz();
            vetor [1] = buzz2 = new Buzz();
        }

        else if (quantidade == 3)
        {
            vetor [0] = buzz1 = new Buzz();
            vetor [1] = buzz2 = new Buzz();
            vetor [2] = buzz3 = new Buzz();
        }


        while ((nBuzz < 1) || (nBuzz > 3))
        {
            System.out.println(linhasSuperiores);
            System.out.println("\u2502    Digite o Buzz você deseja modificar ou 10 para sair:    \u2502");
            System.out.println(linhasInferiores);

            nBuzz = teclado.nextInt();

            if (nBuzz == 10)
            {
                break;
            }

            if (nBuzz > quantidade)
            {
                nBuzz = -1;
            }

            else
            {
                nBuzz--;
                opcao = -1;

                while ((opcao < 1) || (opcao > 5))
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

                    opcao = teclado.nextInt();

                    while (opcao == 1)
                    {
                        System.out.println(linhasSuperiores);
                        System.out.println("\u2502       Digite o que você deseja fazer com o capacete:       \u2502");
                        System.out.println("\u2502                                                            \u2502");
                        System.out.println("\u2502       (1) Verificar estado                                 \u2502");
                        System.out.println("\u2502       (2) Abrir                                            \u2502");
                        System.out.println("\u2502       (3) Fechar                                           \u2502");
                        System.out.println(linhasInferiores);

                        opcao = teclado.nextInt();

                        if (opcao == 1)
                        {
                            if(vetor[nBuzz].isCapacete())
                            {
                                System.out.println("\nO capacete está aberto!\n");
                            }

                            else
                            {
                                System.out.println("\nO capacete está fechado!\n");
                            }

                            opcao = -1;
                        }

                        if (opcao == 2)
                        {
                            vetor[nBuzz].setCapacete(true);
                            System.out.println("\nO capacete foi aberto!\n");
                        }

                        if (opcao == 3)
                        {
                            vetor[nBuzz].setCapacete(false);
                            System.out.println("\nO capacete foi fechado!\n");
                        }
                    }

                    if (opcao == 2)
                    {
                        System.out.println("\n" + vetor[nBuzz].randomFrases());
                    }

                    while (opcao == 3)
                    {
                        System.out.println(linhasSuperiores);
                        System.out.println("\u2502        Digite o que você deseja fazer com o laser:         \u2502");
                        System.out.println("\u2502                                                            \u2502");
                        System.out.println("\u2502        (1) Verificar estado                                \u2502");
                        System.out.println("\u2502        (2) Disparar                                        \u2502");
                        System.out.println("\u2502        (3) Parar de disparar                               \u2502");
                        System.out.println(linhasInferiores);

                        opcao = teclado.nextInt();

                        if (opcao == 1)
                        {
                            if(vetor[nBuzz].isLaser())
                            {
                                System.out.println("\nO laser está disparando!\nn");
                            }

                            else
                            {
                                System.out.println("\nO laser não está disparando!\n");
                            }
                        }

                        if (opcao == 2)
                        {
                            vetor[nBuzz].setLaser(true);
                            System.out.println("\nO laser está disparando!\n");
                        }

                        if (opcao == 3)
                        {
                            vetor[nBuzz].setLaser(false);
                            System.out.println("\nO laser parou de disparar!\n");
                            opcao = 2;
                        }

                        else
                        {
                            opcao = 3;
                        }
                    }

                    while (opcao == 4)
                    {
                        System.out.println(linhasSuperiores);
                        System.out.println("\u2502       Digite o que você deseja fazer com os braços:        \u2502");
                        System.out.println("\u2502                                                            \u2502");
                        System.out.println("\u2502       (1) Verificar estado                                 \u2502");
                        System.out.println("\u2502       (2) Realizar golpes                                  \u2502");
                        System.out.println("\u2502       (3) Parar os golpes                                  \u2502");
                        System.out.println(linhasInferiores);

                        opcao = teclado.nextInt();

                        if (opcao == 1)
                        {
                            if(vetor[nBuzz].isBraços())
                            {
                                System.out.println("\nEstá realizando golpes!\n");
                            }

                            else
                            {
                                System.out.println("\nNão está realizando golpes!\n");
                            }
                        }

                        if (opcao == 2)
                        {
                            vetor[nBuzz].setBraços(true);
                            System.out.println("\nEstá realizando golpes!\n");
                        }

                        if (opcao == 3)
                        {
                            vetor[nBuzz].setBraços(false);
                            System.out.println("\nParou de realizar golpes!\n");
                        }

                        else
                        {
                            opcao = 4;
                        }
                    }

                    while (opcao == 5)
                    {
                        System.out.println(linhasSuperiores);
                        System.out.println("\u2502        Digite o que você deseja fazer com as asas:         \u2502");
                        System.out.println("\u2502                                                            \u2502");
                        System.out.println("\u2502        (1) Verificar estado                                \u2502");
                        System.out.println("\u2502        (2) Abrir asas                                      \u2502");
                        System.out.println("\u2502        (3) Fechar asas                                     \u2502");
                        System.out.println(linhasInferiores);

                        opcao = teclado.nextInt();

                        if (opcao == 1)
                        {
                            if(vetor[nBuzz].isAsas() == true)
                            {
                                System.out.println("\nAs asas estão abertas!\n");
                            }

                            else
                            {
                                System.out.println("\nAs asas estão fechadas!\n");
                            }
                        }

                        if (opcao == 2)
                        {
                            vetor[nBuzz].setAsas(true);
                            System.out.println("\nAs asas foram abertas!");
                        }

                        if (opcao == 3)
                        {
                            vetor[nBuzz].setAsas(false);
                            System.out.println("\nAs asas foram fechadas!\n");
                        }

                        else
                        {
                            opcao = 5;
                        }

                    }

                    opcao = 1;
                    nBuzz = -1;
                }
            }
        }
    }
}