package practice.java.j.model;

import java.util.List;

/**
 * Sample class used to model an Artist.
 */
public class Artist {
    public String name;
    public List<Album> albums;

    public Artist() {
        this.name = "sample name";
        this.albums = null;
    }

    public Artist(String name, List<Album> albums) {
        this.name = name;
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "Artist{" + "name='" + name + '\'' + ", albums=" + albums + '}';
    }
}
