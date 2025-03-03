package Prototype;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Book implements Cloneable {
    public String Publisher;
    public String Name;

    public void Print(){
        System.out.println("Publisher: " + this.Publisher);
        System.out.println("Name: " + this.Name);
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
