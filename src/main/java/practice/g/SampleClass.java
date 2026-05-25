package practice.g;

/**
 * Parent Object Class Methods Challenge
 * 
 * Your goal for this activity is to provide an overriden implementation of the
 * 'equals' method and the 'toString' method. Please note that these methods
 * are automatically inherited by all classes in Java from the Object class.
 * 
 * The equals() method compares two objects and should return a boolean to
 * determine if the objects are equivalent to one another. This equivalency
 * typically means that all respective instance variable values between two
 * objects of the same type are the same. For the SampleClass below two objects
 * are "equal" if the fields 'a' and 'b' are the same in both objects. The
 * equals() method should take in a parameter that is another SampleClass
 * object, and access its version of the fields 'a' and 'b'. Return true if the
 * values of 'a' and 'b' are equal in both objects, and false otherwise.
 * 
 * The toString() method is used to return a descriptive representation of the
 * object in memory. Typically this includes the name of the class, and the
 * value of each field of that object. Please note the the test cases for this 
 * lab will check if the String returned by the toString method contains
 * information about the fields of this object.
 *
 * The test cases for this class use methods called .equals which aren't written
 * anywhere in this class. How? All objects have a method called .equals and a
 * method called toString - they are inherited from the Object class.
 */
public class SampleClass {
    public int a;
    public boolean b;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SampleClass)) return false;
        SampleClass instance = (SampleClass) obj;
        return (this.a == instance.a) && (this.b == instance.b);
    }

    @Override
    public String toString() {
        return "SampleClass[a=" + a + ", b=" + b + "]";
    }
}
