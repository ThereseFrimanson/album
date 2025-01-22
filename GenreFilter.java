import java.util.ArrayList;
import java.util.List;

public interface GenreFilter {
    public boolean permit(Album album);

    public List<Album> filter(List<Album> albums);
}
