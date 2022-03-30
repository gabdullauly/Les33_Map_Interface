package Task2;

public class ArrayThreeNumberException extends Exception {
    private int index;
    private String message;
    public ArrayThreeNumberException(){}
    public ArrayThreeNumberException(int index, String message){
        this.index = index;
        this.message = message;
    }
    public int getIndex(){
        return index;
    }
    public String getMessage(){
        return message;
    }
    public void setIndex(int index){
        this.index = index;
    }
}
