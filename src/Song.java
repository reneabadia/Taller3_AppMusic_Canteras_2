/**
 * Clase song e importación de librerías necesarias para las funciones de formato de fechas
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class Song {
    /**
     * Declaración de variables según su formato y funciones necesarias.
     * Variables Nativas y no nativas
     */
    private final int id;
    private final String title;
    private final String date;
    private final int length;
    private final String genre;
    private final String cover;
    private final String description;
    private final Calendar calendar = Calendar.getInstance();

    /**
     * Método constructor para la creación del listado
     *
     * @param id          variable de tipo entero, única que no se repite
     * @param title       variable tipo Carácter para el título de las canciones
     * @param date        variable tipo fecha para almacenar la fecha de la canción
     * @param length      Variable numérica larga para decimales
     * @param genre       variable tipo carácter para clasificar género de cada canción
     * @param cover       variable tipo carácter para mostrar nombre de imagen .jpg
     * @param description Variable tipo carácter que mostrara descripción de autor o escritor de las canciones
     */
    public Song(int id, String title, String date, int length, String genre, String cover, String description) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.length = length;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }


    /**
     * Método printInfo la cual se encargara de cargar y mostrar la lista musical.
     * Ordena y distribuye la información de cada canción cargada o declarada en el menú principal.
     *
     * @throws ParseException excepción de errores para la carga de información.
     */
    public void printInfo() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dateObj = formatter.parse(date);
        calendar.setTime(dateObj);
        System.out.print("ID: " + id);
        System.out.print(" | Title: " + title);
        System.out.printf(" | Date: %tb %<te, %<tY", calendar);
        System.out.print(" | Duration: " + length + " seconds");
        System.out.print(" | Genre: " + genre);
        System.out.print(" | Cover: " + cover);
        System.out.println(" | Description: " + description);
    }


    /**
     * Método getGenre para clasificación de lista de canciones según el género
     * @return devuelve la lista de canciones según el género de cada canción la cual sea elegida por el usuario
     */
    public String getGenre() {
        return this.genre;
    }


    /**
     * Método getYear para clasificación de lista de canciones según el año
     * @return devuelve la lista de cada canción según el año de cada canción la cual sea elegida por el usuario
     */
    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    /**
     * Método getLength para clasificación de lista de canciones según el tiempo de duración
     * @return devuelve la lista de cada canción según la duración de cada canción.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Método getDate para clasificación de lista de canciones según la fecha de las canciones
     * @return devuelve la lista de cada canción según la fecha de cada canción la cual será indicada po rel usuario
     */
    public Date getDate() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dateObj = formatter.parse(date);
        return dateObj;
    }


    /**
     * Método que se encarga de la comparación de duración para ordenar cada canción.
     * Su funcionalidad contiene la comparación del getLength
     */
    public static Comparator<Song> lengthComp = Comparator.comparingInt(Song::getLength);


    /**
     * Método que se encarga de la comparación de fechas para ordenar cada canción.
     * Su funcionalidad contiene la comparación del getDate
     */
    public static Comparator<Song> dateComp = (o1, o2) -> {
        try {
            return o1.getDate().compareTo(o2.getDate());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    };


}
