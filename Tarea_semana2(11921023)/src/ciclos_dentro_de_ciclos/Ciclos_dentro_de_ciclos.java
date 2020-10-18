/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos_dentro_de_ciclos;

import java.util.Scanner;

/**
 *
 * @author Ariel
 */
public class Ciclos_dentro_de_ciclos {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char resp = 's';
        while (resp == 's' || resp == 'S') {
//"%s\n"
            System.out.printf("%s\n", "1).............Numeros pares e impares");
            System.out.printf("%s\n", "2)............................Tabla de multiplicar");
            System.out.printf("%s\n", "3).............................Factorial");
            System.out.printf("%s\n", "4)....................................numero primo");
            System.out.printf("%s\n", "5)......................... potencia");
            System.out.printf("%s\n", "6)..................................serie #1");
            System.out.printf("%s\n", "7)...............................serie #2");
            System.out.printf("%s\n", "8)......................................Serie Fibonacci");
            System.out.printf("%s\n", "9)......................................La sumatoria del examen pero en dos metodos");
            System.out.printf("%s\n", "Ingrese la opcion que desea: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("%s\n", "Ingrese el limite: ");
                    int limite = leer.nextInt();
                    pares_impares(limite);
                    break;
                case 2:
                    System.out.printf("%s\n", "...............Tabla de multiplicar...................");
                    System.out.printf("%s\n", "Elija el numero base: ");
                    int numero_base = leer.nextInt();
                    System.out.printf("%s\n", "Elija hasta que numero se desea multiplicar: ");
                    int lim = leer.nextInt();
                    tabla(numero_base, lim);
                    break;
                case 3:
                    System.out.printf("%s\n", ".............Fctorial................");
                    System.out.printf("%s\n", "Ingrese el numero: ");
                    int n = leer.nextInt();
                    int resultado = factorial(n);
                    System.out.printf("%s\n", "El factorial de " + n + " es " + resultado);
                    break;
                case 4:
                    System.out.printf("%s\n", ".................Numero Primo.....................");
                    System.out.printf("%s\n", "Ingrese un numero: ");
                    int primo = leer.nextInt();
                    int primo_dos = primo - 1;
                    String retorna = primo_numero(primo, primo_dos);
                    System.out.printf("%s\n", retorna);
                    break;
                case 5:
                    System.out.printf("%s\n", "...............Potencia................................");
                    System.out.printf("%s\n", "Ingrese un numero base: ");
                    int base = leer.nextInt();
                    System.out.printf("%s\n", "Ingrese la potencia: ");
                    int potencia = leer.nextInt();
                    int respuesta = potencia_numero(base, potencia);
                    System.out.printf("%s\n", "El resultado de " + base + " a la " + potencia + " = " + respuesta);

                    break;
                case 6:
                    System.out.printf("%s\n", "Ingrese un limite: ");
                    limite = leer.nextInt();
                    la_serie_uno(limite);
                    System.out.printf("%s\n", " ");
                    break;
                case 7:
                    System.out.printf("%s\n", "Ingrese un limite: ");
                    lim = leer.nextInt();
                    la_serie_dos(lim);

                    break;
                case 8:
                    System.out.println(".................Serie Fibonacci......................");
                    System.out.println("Ingrese el limite: ");
                    lim = leer.nextInt();
                    la_serie_fibonacci(lim);
                    break;

                case 9:
                    //Ariel Reyes - 11921023
                    System.out.printf("Ingrese la cantidad de N: ");
                    n = leer.nextInt();
                    // decisiones por si el usuario se pasa de los limites 
                    while (n < 1) {
                        System.out.printf("Ingrese un numero mayor  o igual a uno: ");
                        n = leer.nextInt();
                    }
                    while (n > 10) {
                        System.out.printf("Ingrese un numero menor que 10: ");
                        n = leer.nextInt();
                        if (n < 1) {
                            while (n < 1) {
                                System.out.printf("Ingreso un numero meyor que 0");
                                n = leer.nextInt();
                            }
                        }
                    }
                    double acumua = 0;
                    for (int i = 1; i <= n; i++) {
                        double arriba = parte_arriba(i);

                        double abajo = parte_abajo(i);
                        double divid = arriba / abajo;
                        acumua = acumua + divid;
                    }
                    System.out.printf("% 5f %n", acumua);

                    break;

            }

            System.out.printf("%s\n", "Quiere continuar s=si/n=no");
            resp = leer.next().charAt(0);

        }

    }

    public static void pares_impares(int limite) {
        int cont = 0;
        char resp = 's';
        while (cont < limite) {

            System.out.printf("%s\n", "Ingrese un numero: ");
            int numero = leer.nextInt();

            int tot = numero % 2;

            if (tot % 2 == 0) {
                System.out.printf("%s\n", "NO ES PAR");
            } else if (tot % 2 == 1) {
                System.out.printf("%s\n", "Es par");
            }

            cont++;
        }

        System.out.printf("%s\n", "desea continuar s=si/n=no");
        resp = leer.next().charAt(0);
    }

    public static void tabla(int numero_base, int lim) {
        int c = 1;
        int mult = 0;
        while (c < lim + 1) {
            mult = numero_base * c;
            System.out.printf("%s\n", numero_base + " * " + c + " = " + mult);
            c++;
        }
    }

    public static int factorial(int n) {
        int c = 1;
        int facto = 1;
        while (c <= n) {
            facto = facto * c;
            c++;
        }
        return facto;
    }

    public static String primo_numero(int primo, int primo_dos) {
        while (primo % primo_dos != 0) {

            primo_dos = primo_dos - 1;
        }
        String devuelve;
        if (primo_dos == 1) {
            devuelve = "Es primo";

        } else {
            devuelve = "No es primo";
        }
        return devuelve;
    }

    public static int potencia_numero(int base, int potencia) {
        int f = 1;
        int pote = 1;
        while (f <= potencia) {
            pote = pote * base;
            f++;
        }

        return pote;
    }

    public static void la_serie_uno(int limite) {

        int contador = 0;
        int acu = 0;
        while (contador < limite) {
            int dos = 2;
            acu = acu + dos;

            if (contador % 2 == 0) {
                System.out.printf("%s", acu + ",");
            } else {
                System.out.printf("%s", "-" + acu + ",");
            }

            contador++;

        }
    }

    public static void la_serie_dos(int lim) {
        int c = 0;
        int pares = 2;
        int impares = 3;
        while (c < lim) {
            System.out.printf("%s", pares + " ");
            c = c + 1;
            System.out.printf("%s", impares + " ");
            c = c + 1;

            pares = pares * pares;
            impares = impares * impares;

        }
    }

    public static void la_serie_fibonacci(int lim) {
        int c = 0;
        int a_uno = 1;
        int a_cero = 0;
        int sum = 0;

        while (c < lim) {

            System.out.printf("%s", a_cero + ",");
            sum = a_uno + a_cero;
            a_cero = a_uno;

            a_uno = sum;

            c++;

        }
    }
 // Ariel Fernando Reyes Castellanos - 11921023
    public static double parte_abajo(int n) {
        double facto = 1;
        for (int i = 1; i <= n; i++) {
            double la_i = 1;
            // elevacion de la i 
            la_i = i * i;
            // el 8*i que tiene la formula 

            // abajo es a lo que se le tiene que sacar el factorial 
            double abajo = 1 + i;

            facto = 1;
            // se le saca el facto a la parte de abajo 
            for (int f = 1; f <= abajo; f++) {
                facto = facto * f;
                //
            }

        }

        return facto;

    }

    public static double parte_arriba(int n) {
        double arriba = 0;
        for (int i = 1; i <= n; i++) {
            double la_i = 1;
            // elevacion de la i 
            la_i = i * i;
            // el 8*i que tiene la formula 
            double ocho = 8 * i;
            // abajo es a lo que se le tiene que sacar el factorial 
            double abajo = 1 + i;
            // arriba es la parte de arriba de la formula 
            arriba = la_i + ocho + 10;

        }
        return arriba;
    }

}
