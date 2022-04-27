import java.text.ParseException;
import java.util.ArrayList;


public class appSong {

    // Native array objects
    ArrayList<Song> songLibrary = new ArrayList<>();
    ArrayList<Song> filteredLibrary = new ArrayList<>();

    //  Method to add song to collection.
    public void addToLibrary(Song song) {
        songLibrary.add(song);
    }

    // Method to get information of Library
    public void getLibraryInfo() throws ParseException {
        System.out.println("Songs in Library: " + songLibrary.size());
        for (Song song : songLibrary) song.printInfo();
    }


    // Method to filter Library by song's music genre
    public void filterGenre(String genre) {
        this.filteredLibrary.clear();
        for(Song song: songLibrary){
            if(song.getGenre().equals(genre)) {
                filteredLibrary.add(song);
            }
        }
        System.out.println("\nSongs of music genre: " + genre);
    }


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


    // Method to get information of filtered Library
    public void getFilterInfo() throws ParseException {
        for (Song song : filteredLibrary) song.printInfo();
    }

    // Method to sort Library by duration of songs
    public void sortByDate() throws ParseException {
        songLibrary.sort(Song.dateComp);
        System.out.println("\nSongs ordered by date: ");
        for (Song song : songLibrary){
            song.printInfo();
        }
    }

    // Method to sort Library by duration of songs
    public void sortByLength() throws ParseException {
        songLibrary.sort(Song.lengthComp);
        System.out.println("\nSongs ordered by duration: ");
        for (Song song : songLibrary){
            song.printInfo();
        }
    }


}
