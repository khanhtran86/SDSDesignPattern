package builder;

public class TestApp {
    public static void main(String[] args) {
        /*
        Person person = new Person("John", "Ha noi", "john@doe.com");

        */
        Person personBuilder = Person.getBuilder()
                                    .setName("John")
                                    .setPlace("Ha noi")
                                    .setEmail("john@doe.com").build();
        //getBuilder() - return object of object builder
        //setName, setPlace, setEmail these method collect specific property for builder object
        //build() return target object with collected properties
        personBuilder.toString();

        Person shortPerson = Person.getBuilder().setName("Hello person").build();
        shortPerson.toString();

        Person shortPerson2 = Person.getBuilder().setEmail("myemail@gmail.com").setPlace("Ha Noi").build();
        shortPerson2.toString();


        Student student = Student.builder().TT(1).HoTen("Khanh Tran").Lop("Fresher 1").build();

        student.setHoTen("Huong");
        String hoten = student.getHoTen();
    }
}
