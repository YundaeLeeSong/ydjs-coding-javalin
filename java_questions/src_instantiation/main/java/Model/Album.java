package Model;

import java.util.List;

/**
 * Sample class used to model an Album.
 * There is no need to change anything in this class.
 */
public class Album {
    public String title;
    public List<Song> songs;

    /**
     * No-args constructor
     */
    public Album(){
        this.title = "sample title";
        this.songs = null;

    }

    /**
     * Constructor that may be used when we would like to provide the starting values for this
     * model's fields, title and songs
     */
    public Album(String title, List<Song> songs) {
        this.title = title;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }
}
