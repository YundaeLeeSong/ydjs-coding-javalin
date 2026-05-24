package Model;

import java.util.List;

/**
 * Sample class used to model an Artist.
 * There is no need to change anything in this class.
 */
public class Artist {

    public String name;
    public List<Album> albums;


    /**
     * No-args constructor
     */
    public Artist(){
//        some sensible starting values
        this.name = "sample name";
        this.albums = null;
    }

    /**
     * Constructor that may be used when we would like to provide the starting values for this
     * model's fields
     */
    public Artist(String name, List<Album> albums) {
        this.name = name;
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", albums=" + albums +
                '}';
    }
}
