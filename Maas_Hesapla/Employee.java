package Maas_Hesapla;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return salary;
        } else {
            double tax = this.salary * 0.03;
            return tax;
        }

    }

    public double bonus() {
        double bonus;
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
            return bonus;
        } else
            return 0;
    }

    public double raiseSalary() {
        double raise;
        if (hireYear <= 0 || hireYear > 2021) {
            System.out.println("You have entered an invalid start year, please check again!");

        } else {
            int yearDiff = 2021 - this.hireYear;

            if (yearDiff > 0 && yearDiff < 10) {
                raise = this.salary * 0.05;
                return raise;

            } else if (yearDiff > 9 && yearDiff < 20) {
                raise = this.salary * 0.10;
                return raise;

            } else if (yearDiff > 19) {
                raise = this.salary * 0.15;
                return raise;

            } else {
                raise = 0;
            }
        }
        return 0;
    }

    public void printEmployee() {
        double taxableSalary = salary + bonus() - tax();
        double totalSalary = salary + bonus() + raiseSalary() - tax();
        System.out.println("Name\t\t\t\t: " + this.name);
        System.out.println("Salary\t\t\t\t: " + this.salary);
        System.out.println("Work Hours\t\t\t: " + this.workHours);
        System.out.println("Hire Year\t\t\t: " + this.hireYear);
        System.out.println("Tax\t\t\t\t: " + tax());
        System.out.println("Bonus\t\t\t\t: " + bonus());
        System.out.println("Salary Raise\t\t\t: " + raiseSalary());
        System.out.println("Salary with Tax and Bonus\t: " + taxableSalary);
        System.out.println("Total Salary\t\t\t: " + totalSalary);
    }
}
