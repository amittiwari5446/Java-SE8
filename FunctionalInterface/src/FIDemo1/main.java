package FIDemo1;

@FunctionalInterface
interface Say{
    void say(String str);
}

public class main {
    public static void main(String[] args){
        Sayable sy=new Sayable();
        sy.say("Say something bro...");
    }
}
