import java.text.ParseException;
import java.util.ArrayList;

public class appSong {

    /**
     * Declaration of native objects of de class
     */
    ArrayList<Song> songLibrary = new ArrayList<>();
    ArrayList<Song> filteredLibrary = new ArrayList<>();

    /** Method to add a song to the collection
     * @param song Instance of 'Song' class
     */
    public void addToLibrary(Song song) {
        songLibrary.add(song);
    }

    /**
     * Method to get information of Library
     * @throws ParseException Exception to share argument to method 'printInfo' of class 'Song'
     */
    public void getLibraryInfo() throws ParseException {
        System.out.println("Songs in Library: " + songLibrary.size());
        for (Song song : songLibrary) song.printInfo();
    }

    /**
     * Method to filter Library by song's music genre
     * @param genre Variable type string, it is used to compare with method 'getGenre' output
     */
    public void filterGenre(String genre) {
        this.filteredLibrary.clear();
        for(Song song: songLibrary){
            if(song.getGenre().equals(genre)) {
                filteredLibrary.add(song);
            }
        }
        System.out.println("\nSongs of music genre: " + genre);
    }

    /**
     * Method to filter Library by song's year
     * @param year Variable type integer, it is used to compare with method 'getYear' output
     */
    // Method to filter Library by song's year
    public void filterYear(int year) {
        this.filteredLibrary.clear();
        for(Song song: songLibrary){
            if(song.getYear()==year) {
                filteredLibrary.add(song);
            }
        }
        System.out.println("\nSongs of year: " + year);
    }

    /**
     * Method to get information of the filtered library
     * @throws ParseException Exception to share argument to method 'printInfo' of class 'Song'
     */
    // Method to get information of filtered Library
    public void getFilterInfo() throws ParseException {
        for (Song song : filteredLibrary) song.printInfo();
    }

    /**
     * Method to sort array 'songLibrary' by date
     * @throws ParseException Exception to share argument to method 'printInfo' of class 'Song'
     */
    // Method to sort Library by duration of songs
    public void sortByDate() throws ParseException {
        songLibrary.sort(Song.dateComp);
        System.out.println("\nSongs ordered by date: ");
        for (Song song : songLibrary){
            song.printInfo();
        }
    }

    /**
     * Method to sort array 'songLibrary' by duration of song in seconds
     * @throws ParseException Exception to share argument to method 'printInfo' of class 'Song'
     */
    // Method to sort Library by duration of songs
    public void sortByLength() throws ParseException {
        songLibrary.sort(Song.lengthComp);
        System.out.println("\nSongs ordered by duration: ");
        for (Song song : songLibrary){
            song.printInfo();
        }
    }


}
