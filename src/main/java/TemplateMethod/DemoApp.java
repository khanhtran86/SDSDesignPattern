package TemplateMethod;

public class DemoApp {
    public static void main(String[] args) {
        HotBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        HotBeverage tea = new Tea();
        tea.prepareRecipe();

    }
}
