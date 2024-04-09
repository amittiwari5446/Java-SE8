package FIDemo2;
@FunctionalInterface
public interface Say {
    void say(String str);

    //can contain any number of object class methods but only one abstract method
    boolean equals(Object obj);
    int hashCode();
    String toString();
}
