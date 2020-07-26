package tarea.pkg1;

import java.util.Scanner;

public class Tarea1 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        comparacion();
        Comparacion2();
    }

    public static void CaracteresIguales() {

        String cadena1 = "";
        String cadena2 = "";
        String caracteres = cadena1 + cadena2;

        System.out.println("ingrese la primer cadena");
        cadena1 = entrada.nextLine();
        System.out.println("ingrese la segunda cadena");
        cadena2 = entrada.nextLine();

        String[] iguales = caracteres.split("a");

        for (int i = 0; i < iguales.length; i++) {
            System.out.print(iguales[i]);
        }
    }

    public static void ya() {

        String cadena1 = "";
        String cadena2 = "";
        String palabra = "";

        System.out.println("ingrese la primera cadena");
        cadena1 = entrada.nextLine();
        System.out.println("ingrese la segunda cadena");
        cadena2 = entrada.nextLine();

        char[] aCaracteres1 = cadena1.toCharArray();
        char[] aCaracteres2 = cadena2.toCharArray();

        if (cadena1.length() == cadena2.length()) {
            for (int i = 0; i < aCaracteres1.length; i++) {
                for (int j = 0; j < aCaracteres2.length; j++) {

                }
            }
        }

    }

    public static void comparacion() {

        String palabra1 = "";
        String palabra2 = "";
        String aux = "";
    
        System.out.println("ingrese 1");
        palabra1 = entrada.next();
        System.out.println("ingrese 2");
        palabra2 = entrada.next();

        if (palabra1.length() == palabra2.length()) {
            for (int i = 0; i < palabra1.length(); i++) {
                for (int j = 0; j < palabra2.length(); j++) {
                    if (palabra1.charAt(i) == palabra2.charAt(j)) {
                        aux += palabra1.charAt(i);
                    
                    }
                }

            }
            System.out.print(aux);
     
        }

    }
        public static void Comparacion2() {

        String palabra1;
        String palabra2;

        System.out.println("ingrese la primera muestra");
        palabra1 = entrada.next();
        System.out.println("ingrese la segunda muestra");
        palabra2 = entrada.next();

        if (palabra1.length() >= palabra2.length()) {
            
            Respuesta1(palabra1, palabra2);
        } else if (palabra2.length() > palabra1.length()) {

        }

    }

    public static void Respuesta1(String palabra1, String palabra2) {

        String Respuesta = "";
        int contador = 2;
        boolean coincidencia = false;

        while (coincidencia == false) {

            for (int i = 0; i < palabra1.length(); i ++) {
                for (int j = 0; j < palabra2.length(); j ++) {
                    if (palabra1.charAt(i) == palabra2.charAt(j)) {
                        Respuesta += palabra1.charAt(i);
                        coincidencia = true;
                    } else {
                        i++;
                    }
                }
            }
            System.out.print(Respuesta);

        }

      
    }
}
