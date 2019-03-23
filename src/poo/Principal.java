package poo;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Buzz buzz = new Buzz(false,false,false,false);

        Scanner teclado = new Scanner(System.in);

        int opcao = -1;
        String linhas = "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500";
        String linhasSuperiores = "\u250C" + linhas + linhas + linhas + linhas + linhas + linhas + "\u2510";
        String linhasInferiores = "\u2514" + linhas + linhas + linhas + linhas + linhas + linhas + "\u2518";

        while ((opcao < 1) || (opcao > 3))
        {
            System.out.println(linhasSuperiores);
            System.out.println("\u2502      Digite quantos Buzz Lightyear você deseja criar:      \u2502");
            System.out.println("\u2502                                                            \u2502");
            System.out.println("\u2502      (1) 1 Buzz Lightyear                                  \u2502");
            System.out.println("\u2502      (2) 2 Buzz Lightyear                                  \u2502");
            System.out.println("\u2502      (3) 3 Buzz Lightyear                                  \u2502");
            System.out.println(linhasInferiores);

            opcao = teclado.nextInt();
        }

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
        }

        if (opcao == 1)
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
                if(buzz.isCapacete() == true)
                {
                    System.out.println("\nO capacete está aberto!");
                }

                else
                {
                    System.out.println("\nO capacete está fechado!");
                }
            }

            if (opcao == 2)
            {
                buzz.setCapacete(true);
                System.out.println("\nO capacete foi aberto!");
            }

            if (opcao == 3)
            {
                buzz.setCapacete(false);
                System.out.println("\nO capacete foi fechado!");
            }
        }

        if (opcao == 2)
        {
            System.out.println("\n" + buzz.randomFrases());
        }

        if (opcao == 3)
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
                if(buzz.isLaser() == true)
                {
                    System.out.println("\nO laser está disparando!");
                }

                else
                {
                    System.out.println("\nO laser não está disparando!");
                }
            }

            if (opcao == 2)
            {
                buzz.setLaser(true);
                System.out.println("\nO laser está disparando!");
            }

            if (opcao == 3)
            {
                buzz.setLaser(false);
                System.out.println("\nO laser parou de disparar!");

            }
        }

        if (opcao == 4)
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
                if(buzz.isBraços() == true)
                {
                    System.out.println("\nEstá realizando golpes!");
                }

                else
                {
                    System.out.println("\nNão está realizando golpes!");
                }
            }

            if (opcao == 2)
            {
                buzz.setBraços(true);
                System.out.println("\nEstá realizando golpes!");
            }

            if (opcao == 3)
            {
                buzz.setBraços(false);
                System.out.println("\nParou de realizar golpes!");
            }
        }

        if (opcao == 5)
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
                if(buzz.isAsas() == true)
                {
                    System.out.println("\nAs asas estão abertas!");
                }

                else
                {
                    System.out.println("\nAs asas estão fechadas!");
                }
            }

            if (opcao == 2)
            {
                buzz.setAsas(true);
                System.out.println("\nAs asas foram abertas!");
            }

            if (opcao == 3)
            {
                buzz.setAsas(false);
                System.out.println("\nAs asas foram fechadas!");
            }
        }
    }
}