package ejerciciostema8;

import java.util.Scanner;
import Funciones.FuncionesMatematicas;

public class Ejercicios20a28Tema8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tamaño, minimo, maximo;
       

        int numBuscado;
        int menu;

        System.out.println("Biblioteca de funciones matemáticas (Array).");
        System.out.println("-------------------------------------");
        System.out.println("1. Generar Array");
        System.out.println("2. Devolver valor mínimo de un Array");
        System.out.println("3. Devolver valor máximo de un Array");
        System.out.println("4. Devolver la media de los valores de un Array");
        System.out.println("5. Número dentro de array");
        System.out.println("6. Posición de un número en un Array");
        System.out.println("7. Voltear Array");
        System.out.println("8. Rotar array hacia la derecha");
        System.out.println("9. Rotar array hacia la izquierda");

        System.out.println("");
        System.out.print("Elige una de las opciones: ");
        menu = s.nextInt();
        
         System.out.println("Introduce tamaño del array: ");
        tamaño = s.nextInt();

        System.out.println("Introduce valor mínimo ");
        minimo = s.nextInt();

        System.out.println("Introduce valor máximo: ");
        maximo = s.nextInt();

        switch (menu) {
            case 1:
                int[] array;

                array = FuncionesMatematicas.generarArray(tamaño, minimo, maximo);

                for (int dato : array) {
                    System.out.print(dato + ", ");
                }
                break;
            case 2:
                int[] array2;

                array2 = FuncionesMatematicas.generarArray(tamaño, minimo, maximo);

                for (int dato : array2) {
                    System.out.print(dato + ", ");
                }

                int minimoArray;

                minimoArray = FuncionesMatematicas.minimoArray(array2);

                System.out.println("\nEl mínimo del array es: " + minimoArray);
                break;
            case 3:
                int[] array3 = FuncionesMatematicas.generarArray(tamaño, minimo, maximo);

                for (int dato : array3) {
                    System.out.print(dato + ", ");
                }

                int maximoArray;

                maximoArray = FuncionesMatematicas.maximoArray(array3);

                System.out.println("\nEl máximo del array es: " + maximoArray);
                break;
            case 4:
                int[] array4;
                array4 = FuncionesMatematicas.generarArray(tamaño, minimo, maximo);

                for (int dato : array4) {
                    System.out.print(dato + ", ");
                }

                int media;

                media = FuncionesMatematicas.mediaArray(array4);

                System.out.println("\nLa media del array es: " + media);
                break;
            case 5:
                int[] array5;
                array5 = FuncionesMatematicas.generarArray(tamaño, minimo, maximo);

                boolean dentro;

                for (int dato : array5) {
                    System.out.print(dato + ", ");
                }

                System.out.println("Introduce el número que está buscando: ");
                numBuscado = s.nextInt();

                dentro = FuncionesMatematicas.estaArray(array5, numBuscado);

                if (dentro == true) {
                    System.out.println("El número que busca está dentro del array");
                } else {
                    System.out.println("El número que busca no se encuentra en el array");
                }
                break;
            case 6:
                int[] array6;
                array6 = FuncionesMatematicas.generarArray(tamaño, minimo, maximo);

                for (int dato : array6) {
                    System.out.print(dato + ", ");
                }

                System.out.println("\nIntroduce el número que está buscando: ");
                numBuscado = s.nextInt();

                int posicion;

                posicion = FuncionesMatematicas.posicionArray(array6, numBuscado);

                if (numBuscado == array6[posicion]) {
                    System.out.println("El número que busca se encuentra en la posición " + posicion);
                } else {
                    System.out.println("El número que busca no se encuentra en ninguna posición");
                }
                break;
            case 7:
                int[] array7 = FuncionesMatematicas.generarArray(tamaño, minimo, maximo);

                System.out.println("Array Normal: ");
                for (int dato1 : array7) {
                    System.out.print(dato1 + ", ");
                }

                int[] arrayVolteado = FuncionesMatematicas.volteaArray(array7);

                System.out.println("\nArray Volteado: ");
                for (int dato2 : arrayVolteado) {
                    System.out.print(dato2 + ", ");
                }
                break;
            case 8:
                int[] array8 = FuncionesMatematicas.generarArray(tamaño, minimo, maximo);

                System.out.println("Array Normal: ");
                for (int dato1 : array8) {
                    System.out.print(dato1 + ", ");
                }

                int[] rotadoDerecha = FuncionesMatematicas.rotaDerechaArray(array8);

                System.out.println("\nArray Rotado hacia la derecha: ");
                for (int dato2 : rotadoDerecha) {
                    System.out.print(dato2 + ", ");
                }
                break;
            case 9:
                int[] array9 = FuncionesMatematicas.generarArray(tamaño, minimo, maximo);

                System.out.println("Array Normal: ");
                for (int dato1 : array9) {
                    System.out.print(dato1 + ", ");
                }

                int[] rotadoIzquierda = FuncionesMatematicas.rotaIzquierdaArray(array9);

                System.out.println("\nArray Rotado hacia la izquierda: ");
                for (int dato2 : rotadoIzquierda) {
                    System.out.print(dato2 + ", ");
                }
                break;
        }

    }

}
