package Prototype;

public class TestApp {
    public static void main(String[] args) {
        Car myCar = Car.builder().color("Red").model("2025").style("Sedan").build();
        Car yourCar = myCar.clone();
        yourCar.setColor("Blue");


        myCar.Print();
        yourCar.Print();

        Book book = Book.builder().Name("Advanced Java").Publisher("Aspress").build();

        Book yourBook = book.clone();
        yourBook.setName("Advance Java 17");

        book.Print();
        yourBook.Print();
    }
}
