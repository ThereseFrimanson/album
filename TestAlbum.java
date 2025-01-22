import java.util.ArrayList;
import java.util.List;

/* TestAlbum.java */
public class TestAlbum {

    public static void main(String[] args) {


        Album[] albums = {
                new Album("Hotel California", "Eagles", Album.Genre.ROCK),
                new Album("Best of", "J.S. Bach", Album.Genre.CLASSICAL),
                new Album("Arrival", "ABBA", Album.Genre.POP),
                new Album("Hemma hos 1", "Janne & Kjell", Album.Genre.OTHER),
                new Album("White album", "Beatles", Album.Genre.POP),
                new Album("Best of", "Mozart", Album.Genre.CLASSICAL),
                new Album("Thank you for the music", "ABBA", Album.Genre.POP)
        };

        printAlbums(albums);
    }

    static void printAlbums(Album[] albums) {
        AlbumFilter filter = new AlbumFilter();
        List<Album> popAlbums = new ArrayList<>();
        List<Album> notPopAlbums = new ArrayList<>();

        for (Album album : albums) {
            if (filter.permit(album) == true) {
                popAlbums.add(album);
            } else {
                notPopAlbums.add(album);
            }
        }

        //This prints our pop albums
        System.out.println("Here are out pop albums: " + popAlbums.toString());
        //This prints the other albums
        System.out.println("Here are the rest of the albums which are not pop: " + notPopAlbums.toString());
    }


}