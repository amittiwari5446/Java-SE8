package FIDemo3;

public interface Doable {
    default void doIt(){
       System.out.println("Do it vro...");
    }
}
