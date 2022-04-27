package com.Sofka;
/**
 * Programa de Biblioteca de música y su filtrado según su categoría y clasificación
 * @Autor: Rene Abdia y Elkin Sierra Hernández
 * Importación de librería, clases y recursos
 * Declaración de Variables
 */
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
/**
 * Declaración de clase Scarner para la carga de y petición de datos por el usuario.
 * Declaración de variables tipo enteros y carácter
 */
public class Main {
    static Scanner num = new Scanner(System.in);
    static Scanner texto = new Scanner(System.in);
    public static int option, exit, years;
    public static String genre;
    /**
     * Se listan las canciones para ser cargadas por el sistema cuando el usuario lo requiera.
     */
    /*
    static Song song1 = new Song(1, "La vida es un carnaval ", "01/01/1990", 160, "salsa", "cover1.png ", "Written by  Víctor Daniel");
    static Song song2 = new Song(2, "Periódico de Ayer      ", "02/02/1990", 150, "salsa", "cover2.png ", "Written by Title Curet Alonso");
    static Song song3 = new Song(3, "Civil War              ", "03/03/1990", 140, "rock", "cover3.png  ", "Written by Guns N' Roses");
    static Song song4 = new Song(4, "You Could Be Mine      ", "04/04/1980", 130, "rock", "cover4.png  ", "Written by Guns N' Roses");
    static Song song5 = new Song(5, "Anything for Your Love ", "05/05/1980", 121, "blues", "cover5.png ", "Written by Eric Clapton");
    static Song song6 = new Song(6, "Hound Dog              ", "06/06/1980", 113, "blues", "cover6.png ", "Written by Eric Clapton");
    static Song song7 = new Song(7, "Nina Simone            " , "07/07/1990",145, "jazz", "cover6.png  ", "Written by Nina Simone");
    static Song song8 = new Song(8, "He needs me            ", "08/08/1990", 155, "jazz", "cover6.png  ", "Written by Nina Simone");
    static Song song9 = new Song(9, "Tu Eres Ajena          ", "09/09/1990",125, "jazz", "cover6.png  ", "Written by Eddy Herrera");
    static Song song10 = new Song(10, "Tu Sonrisa           ","10/10/1980",115, "jazz", "cover6.png  ", "Written by Elvis Crespo");
    */
    /**
     *
     * @param args Definición del parámetro para la realización de los arreglos tipo string
     * @throws ParseException se realiza para explícitamente capturar errores de la excepción de la clase estática main
     * @throws IOException Realizamos la excepción por si ocurren errores de entrada y salida
     */
    public static void main(String[] args) throws ParseException, IOException {
        do {
            main();
            option = captureOption();
            exit = evaluteOption(option);
        } while (exit != 0);
    }

    public static int captureOption() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }


    public static void main() {
        System.out.println(" ");
        System.out.println("Please, first load the songs to the system with menu option 1.");
        System.out.println("Please select an option");
        System.out.println("1. View all songs");
        System.out.println("2. Filter songs by date");
        System.out.println("3. Filter songs by duration");
        System.out.println("4. Filter songs by music genre");
        System.out.println("5. Filter songs by Years");
        System.out.println("0. EXIT THE SYSTEM");

    }

    public static int evaluteOption(int option) throws IOException, ParseException {
        switch (option) {
            case 1 -> musicList();
            case 2 -> filterByDate();
            case 3 -> filterByDuration();
            case 4 -> filterByGenre();
            case 5 -> filterByYears();
        }
        return option;
    }

    /**
     * Método encargado de cargar y listar las canciones ya ingresadas en el sistema
     * @throws ParseException excepción para el manejo de carga en el listado de las músicas existentes
     */

    public static void musicList() throws ParseException {

    }

    /**
     * Función que llama método de la clase song para filtrado por género
     * @throws ParseException excepción explícita del filtro por género
     */
    public static void filterByGenre() throws ParseException {

    }

    /**
     * Función que llama método de la clase song para filtrado por año
     * @throws ParseException excepción para errores de carga del filtro por año, con la elección del usuario.
     */
    private static void filterByYears() throws ParseException {
        System.out.println("Please enter the year you want to filter");
        years = num.nextInt();

    }

    /**
     * Función que llama método de la clase song para filtrado por duración
     * @throws ParseException para la muestra de captura de listado musical por duración
     */
    public static void filterByDuration() throws ParseException {

    }

    /**
     * Función que llama método de la clase song para filtrado por fechas
     * @throws ParseException excepción de carga de canciones, para mostrados por fecha.
     */
    public static void filterByDate() throws ParseException {


    }
}

