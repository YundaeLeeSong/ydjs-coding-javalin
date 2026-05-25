package practice.java.j;

import practice.java.j.model.Album;
import org.junit.Assert;
import org.junit.Test;

public class InstantiationTest {

    Instantiation i = new Instantiation();

    /**
     * Because null represents the lack of an object, any return from
     * instantiateANewObject which is not null should be counted as a new object.
     */
    @Test
    public void labPart1TestNotNull() {
        Object obj = i.labPart1();
        Assert.assertNotNull("The returned object should not be null.", obj);
    }
    
    @Test
    public void labPart1TestIsAlbum() {
        Object obj = i.labPart1();
        Assert.assertTrue("The returned object should be of type Album.",
                obj.getClass().equals(Album.class));
    }
    
    @Test
    public void labPart2TestNotNull() {
        Object obj = i.labPart2();
        Assert.assertNotNull("The returned object should not be null.", obj);
    }
    
    @Test
    public void labPart2TestNotAlbumOrString() {
        Object obj = i.labPart2();
        Assert.assertFalse("The returned object should not be Album.", 
                obj.getClass().equals(Album.class));
        Assert.assertFalse("The returned object should not be String.", 
                obj.getClass().equals(String.class));
    }
    
    @Test
    public void labPart3TestNotNull() {
        Object obj = i.labPart3();
        Assert.assertNotNull("The returned object should not be null.", obj);
    }
    
    @Test
    public void labPart3TestNotAbc() {
        Object obj = i.labPart3();
        Assert.assertFalse("The returned String should not be abc.", 
                obj.equals("abc"));
    }
}
