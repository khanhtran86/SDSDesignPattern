package GenegicType;

//Dinh nghia generic voi kie la T
public class Box <T>{
    private T value;

    public void putInBox(T value) {
        this.value = value;
    }

    public T getOutBox() {
        return value;
    }
}
