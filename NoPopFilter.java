public class NoPopFilter implements GenreFilter {
    public boolean permit(Album album) {
        return album.getGenre() != Album.Genre.POP;
    }
}
