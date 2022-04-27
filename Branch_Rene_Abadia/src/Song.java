import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class Song{

    // Native variables
    private final int id;
    private final String title;
    private final String date;
    private final int length;
    private final String genre;
    private final String cover;
    private final String description;
    private final Calendar calendar = Calendar.getInstance();

    // Object constructor
    public Song(int id, String title, String date, int length, String genre, String cover, String description){
        this.id = id;
        this.title = title;
        this.date = date;
        this.length = length;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    // Method to display full information of a song
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

    // Method for get music genre
    public String getGenre(){
        return this.genre;
    }

    // Method for get year
    public int getYear(){
        return calendar.get(Calendar.YEAR);
    }

    // Method to get seconds of duration
    public int getLength(){
        return this.length;
    }

    // Method to get date
    public Date getDate() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dateObj = formatter.parse(date);
        return dateObj;
    }


    // Comparator to sort the List by duration of song
    public static Comparator<Song> lengthComp = Comparator.comparingInt(Song::getLength);

    // Comparator to sort the List by date
    public static Comparator<Song> dateComp = (o1, o2) -> {
        try {
            return o1.getDate().compareTo(o2.getDate());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    };




    /*

    // Override method to compare song's date in array list.
    @Override
    public int compareTo(Song o) {
        //System.out.println(o.getDateTime());
        try {
            return getDate().compareTo(o.getDate());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
*/



}
