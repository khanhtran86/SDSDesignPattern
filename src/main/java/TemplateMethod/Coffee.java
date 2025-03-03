package TemplateMethod;

public class Coffee extends HotBeverage{
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
