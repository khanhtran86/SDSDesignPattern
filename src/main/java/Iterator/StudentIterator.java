package Iterator;

public class StudentIterator implements Iterator {
    private String[] students;
    private int index = 0;

    public StudentIterator(String[] students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return index<students.length;
    }

    @Override
    public Object next() {
        if(this.hasNext()) {
            return students[index++];
        }
        return null;
    }
}
