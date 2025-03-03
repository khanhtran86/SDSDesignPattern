package GenegicType;

public class TestBox {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Miu miu");

        Dog dog = new Dog();
        dog.setName("Gau gau");

        Box<Cat> boxCat = new Box<>();
        boxCat.putInBox(cat);

        Box<Dog> boxDog = new Box<>();
        boxDog.putInBox(dog);


        String typeOfObjectInBoxCat = boxCat.getOutBox() instanceof Cat ? "Cat" : "Khong biet";

        System.out.println(typeOfObjectInBoxCat);
    }
}
