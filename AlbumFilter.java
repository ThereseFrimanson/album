import java.util.ArrayList;
import java.util.List;

public class AlbumFilter implements GenreFilter{

    @Override
    public boolean permit(Album album) {
        return album.genre().equals(Album.Genre.POP);
    }

    public List<Album> filter(List<Album> albums) {
        List<Album> filteredAlbums = new ArrayList<>();
        for(Album album : albums){
            if(permit(album)){
                filteredAlbums.add(album);
            }
        }
        return filteredAlbums;
    }
}
