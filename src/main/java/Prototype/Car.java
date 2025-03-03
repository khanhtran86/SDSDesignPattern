package Prototype;

import lombok.Builder;
import lombok.Data;

import javax.swing.text.Style;

@Builder
@Data
public class Car implements Cloneable{
    private String color;
    private String model;
    private String style;

    public void Print()
    {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Style: " + style);
    }

    @Override
    protected Car clone() {
        return Car.builder().color(this.color).model(this.model).style(this.style).build();
    }
}
