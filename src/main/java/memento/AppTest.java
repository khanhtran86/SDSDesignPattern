package memento;

public class AppTest {
    public static void main(String[] args) {
        Document doc = new Document();
        History history = new History();

        doc.setContent("This is first version of Content");
        history.save(doc);

        doc.setContent("Today is the first day of week");
        history.save(doc);

        doc.setContent("But it is last day of Design Pattern course");
        history.save(doc);

        System.out.println(doc.getContent());

        history.undo(doc);
        System.out.println(doc.getContent());
        history.undo(doc);
        System.out.println(doc.getContent());
        history.undo(doc);
        System.out.println(doc.getContent());
    }
}
