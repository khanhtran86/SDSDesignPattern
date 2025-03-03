package Composite;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Manager {
    private String name;
    private List<Developer> employees = new ArrayList<Developer>();

    public void AdjustSalary(int ratio)
    {
        for (Developer employee : employees) {
            employee.setSalary(employee.getSalary() + (ratio*employee.getSalary()/100));
        }
    }

    public void AddDeveloper(Developer developer)
    {
        employees.add(developer);
    }

    public void showInfo()
    {
        System.out.println("Manager Name: " + name);
        for (Developer employee : employees) {
            employee.showDetails();
        }
    }
}
