package TemplateMethod;

public abstract class HotBeverage {
    //Final - Khong cho overwritten
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    //Step 1
    private void boilWater()
    {
        System.out.println("Boiling Water...");
    }

    //Step 2
    public abstract void brew();

    //Step 3
    private void pourInCup()
    {
        System.out.println("Pouring Into Cup...");
    }

    //Step 4
    public abstract void addCondiments();
}
