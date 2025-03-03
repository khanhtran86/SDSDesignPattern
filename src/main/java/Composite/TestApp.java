package Composite;

public class TestApp {
    public static void main(String[] args) {
        Manager team1 = new Manager();
        team1.setName("Team 1");

        team1.AddDeveloper(Developer.builder().name("Developer 1").age(20).salary(10000000).build());
        team1.AddDeveloper(Developer.builder().name("Developer 2").age(30).salary(20000000).build());

        team1.AdjustSalary(10);
        team1.showInfo();
    }
}
