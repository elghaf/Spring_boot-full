package cas;

public class Sequence{
    private int value;
    public synchronized int next(){
        return value++;
    }
}