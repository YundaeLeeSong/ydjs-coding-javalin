package practice.java.j.model;

import java.util.List;

/**
 * Sample class used to model an Album.
 */
public class Album {
    public String title;
    public List<Song> songs;

    public Album() {
        this.title = "sample title";
        this.songs = null;
    }

    public Album(String title, List<Song> songs) {
        this.title = title;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Album{" + "title='" + title + '\'' + ", songs=" + songs + '}';
    }
}
