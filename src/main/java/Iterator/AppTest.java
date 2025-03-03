package Iterator;

public class AppTest {
    public static void main(String[] args) {
        String[] studentsList = {"Trung", "Hieu", "Viet", "Tuan"};

        Iterator iterator = new StudentIterator(studentsList);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
