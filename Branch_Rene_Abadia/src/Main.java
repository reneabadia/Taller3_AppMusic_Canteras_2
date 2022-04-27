import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        // Create songs
        Song song1 = new Song(1,"title1","01/01/1990",160,"rock","cover1.png","desc1");
        Song song2 = new Song(2,"title2","02/02/1990",150,"blues","cover2.png","desc2");
        Song song3 = new Song(3,"title3","03/03/1990",140,"jazz","cover3.png","desc3");
        Song song4 = new Song(4,"title4","04/04/1980",130,"rock","cover4.png","desc4");
        Song song5 = new Song(5,"title5","05/05/1980",121,"blues","cover5.png","desc5");
        Song song6 = new Song(6,"title6","06/06/1980",113,"jazz","cover6.png","desc6");

        // Add songs to Library
        appSong library = new appSong();
        library.addToLibrary(song1); library.addToLibrary(song2);
        library.addToLibrary(song3); library.addToLibrary(song4);
        library.addToLibrary(song5); library.addToLibrary(song6);
        library.getLibraryInfo();

        // Filter songs by music genre and year
        library.filterGenre("rock"); library.getFilterInfo();
        library.filterGenre("jazz"); library.getFilterInfo();
        library.filterYear(1980); library.getFilterInfo();
        library.filterYear(1990); library.getFilterInfo();

        // Sort Library by length of songs
        library.sortByLength();

        //System.out.println(song1.getDate());
        library.sortByDate();



    }
}
