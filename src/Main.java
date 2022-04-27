/**
 * Programa de Biblioteca de música y su filtrado según su categoría y clasificación
 * @Autor: Rene Abadia y Elkin Sierra Hernández
 * Importación de librería, clases y recursos
 * Declaración de Variables
 */

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    /**
     * Declaración de clase Scarner para la carga de y petición de datos por el usuario.
     * Declaración de variables tipo enteros y carácter
     */
    static Scanner num = new Scanner(System.in);
    static Scanner texto = new Scanner(System.in);
    public static int option, exit, years;
    public static String genre;
    /**
     * Se listan las canciones para ser cargadas por el sistema cuando el usuario lo requiera.
     */
    static Song song1 = new Song(1, "La vida es un Carnaval ", "01/01/1990",160, "salsa","cover1.png ", "Written by Victor Daniel");
    static Song song2 = new Song(2, "Periodico de Ayer      ", "02/02/1990",150, "salsa","cover2.png ", "Written by Tite Curet Alonso");
    static Song song3 = new Song(3, "Civil War              ", "03/03/1990",140, "rock", "cover3.png  ", "Written by Guns N' Roses");
    static Song song4 = new Song(4, "You Could Be Mine      ", "04/04/1980",130, "rock", "cover4.png  ", "Written by Guns N' Roses");
    static Song song5 = new Song(5, "Anything for Your Love ", "05/05/1980",121, "blues","cover5.png ", "Written by Eric Clapton");
    static Song song6 = new Song(6, "Hound Dog              ", "06/06/1980",113, "blues","cover6.png ", "Written by Eric Clapton");
    static Song song7 = new Song(7, "Nina Simone            ", "07/07/1990",145, "jazz", "cover6.png  ", "Written by Nina Simone");
    static Song song8 = new Song(8, "He needs me            ", "08/08/1990",155, "jazz", "cover6.png  ", "Written by Nina Simone");
    static Song song9 = new Song(9, "Tu Eres Ajena          ", "09/09/1990",125, "jazz", "cover6.png  ", "Written by Eddy Herrera");
    static Song song10 = new Song(10, "Tu Sonrisa           ", "10/10/1980",115, "jazz", "cover6.png  ", "Written by Elvis Crespo");
    static appSong library = new appSong();

    /**
     * @param args Definición del parámetro para la realización de los arreglos tipo string
     * @throws ParseException se realiza para explícitamente capturar errores de la excepción de la clase estática main
     */
    public static void main(String[] args) throws ParseException {
        do {
            mainOpt();
            option = captureOption();
            exit = evaluteOption(option);
        } while (exit != 0);
    }

    /**
     * Captura de la opción elegida por el usuario.
     * @return captura y devuelve el contenido de la elección ingresado por el usuario.
     */
    public static int captureOption() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    /**
     *Menú de 6 opciones para mostrar distintas formas de lista de canciones y finalización del sistema
     */
    public static void mainOpt() {
        System.out.println(" ");
        System.out.println("Please, first load the songs to the system with menu option 1.");
        System.out.println("1. View all songs");
        System.out.println("2. Sort songs by year");
        System.out.println("3. Sort songs by duration");
        System.out.println("4. Filter songs by music genre");
        System.out.println("5. Filter songs by year");
        System.out.println("0. EXIT THE SYSTEM");
        System.out.print("Please select an option: ");
    }

    /**
     * Método para evaluación y redirección de opción elegida por el usuario
     * @param option definición de la variable para la ejecución de la opción elegida
     * @return Devolvemos la variable option para evaluar su contenido en nuestro menú de opciones
     * @throws ParseException excepción explicita para reflejar la opción elegida
     */
    public static int evaluteOption(int option) throws ParseException {
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
        library.addToLibrary(song1);
        library.addToLibrary(song2);
        library.addToLibrary(song3);
        library.addToLibrary(song4);
        library.addToLibrary(song5);
        library.addToLibrary(song6);
        library.addToLibrary(song7);
        library.addToLibrary(song8);
        library.addToLibrary(song9);
        library.addToLibrary(song10);
        library.getLibraryInfo();
    }

    /**
     * Función que llama método de la clase song para filtrado por género
     * @throws ParseException excepción explícita del filtro por género
     */
    public static void filterByGenre() throws ParseException {
        System.out.print("Please, enter the genre you want to filter: ");
        genre = texto.nextLine();
        library.filterGenre(genre);
        library.getFilterInfo();
    }

    /**
     * Función que llama método de la clase song para filtrado por año
     * @throws ParseException excepción para errores de carga del filtro por año, con la elección del usuario.
     */
    private static void filterByYears() throws ParseException {
        System.out.print("Please, enter the year you want to filter: ");
        years = num.nextInt();
        library.filterYear(years);
        library.getFilterInfo();
    }

    /**
     * Función que llama método de la clase song para filtrado por duración
     * @throws ParseException para la muestra de captura de listado musical por duración
     */
    public static void filterByDuration() throws ParseException {
        library.sortByLength();
    }

    /**
     * Función que llama método de la clase song para filtrado por fechas
     * @throws ParseException excepción de carga de canciones, para mostrados por fecha.
     */
    public static void filterByDate() throws ParseException {
        library.sortByDate();
    }
}


