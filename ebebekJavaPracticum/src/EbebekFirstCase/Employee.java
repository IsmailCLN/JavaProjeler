package EbebekFirstCase;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        return (this.salary >= 1000) ? this.salary * 0.03 : 0.0;
    }

    double bonus() {
        double weeklyWorkHours = 40;
        return (this.workHours > weeklyWorkHours) ? (this.workHours - weeklyWorkHours) * 30.0 : 0.0;
    }

    double raiseSalary() {
        int currentYear = 2021;
        if (this.hireYear <= 0 || this.hireYear > currentYear) {
            System.out.println("Please enter valid number");
            return 0.0;
        } else {
            int workYear = currentYear - this.hireYear;
            double raiseSalaryAmount;
            if (workYear > 0 && workYear < 10) {
                raiseSalaryAmount = this.salary * 0.05;
            } else if (workYear > 9 && workYear < 20) {
                raiseSalaryAmount = this.salary * 0.1;
            } else if (workYear > 19) {
                raiseSalaryAmount = this.salary * 0.15;
            } else {
                raiseSalaryAmount = 0.0;
            }
            return raiseSalaryAmount;
        }
    }

    public String toString() {
        return "Name : " + this.name + "\n" +
                "Salary : " + this.salary + "\n" +
                "Working hour : " + this.workHours + "\n" +
                "Hire year : " + this.hireYear + "\n" +
                "Tax : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Salary Raise : " + raiseSalary() + "\n" +
                "Salary with Tax and Bonuses : " + (this.salary - tax() + bonus()) + "\n" +
                "Total salary : " + (this.salary + raiseSalary());
    }
}