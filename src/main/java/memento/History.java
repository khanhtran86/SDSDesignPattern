package memento;

import java.util.Stack;

public class History {
    private Stack<Memento> history = new Stack<>();

    public void save(Document doc)
    {
        history.push(doc.save());
    }

    public void undo(Document doc)
    {
        if(!history.isEmpty())
        {
            doc.restore(history.pop());
        }
        else
        {
            System.out.println("No history to restore");
        }
    }
}
