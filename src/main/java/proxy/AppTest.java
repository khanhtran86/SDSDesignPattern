package proxy;

public class AppTest {
    public static void main(String[] args) {
        Document userDoc = new DocumentProxy("mydoc.pdf", "user");
        userDoc.display();
    }
}
