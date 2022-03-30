package Task2;

public class ArrayThreeNumberException extends Exception {
    private int index = 7;
    public ArrayThreeNumberException(){}
    public ArrayThreeNumberException(int index){
        this.index = index;
    }
    public int getIndex(){
        return index;
    }
    public void setIndex(int index){
        this.index = index;
    }

}
