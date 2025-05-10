public class OnlyPopFilter implements GenreFilter {
    public boolean permit(Album album) {
        return album.getGenre() == Album.Genre.POP;
    }
}
