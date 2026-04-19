class Employee {
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
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int diffYear = currentYear - this.hireYear;
        
        if (diffYear < 10) {
            return this.salary * 0.05;
        } else if (diffYear > 9 && diffYear < 20) {
            return this.salary * 0.10;
        } else if (diffYear > 19) {
            return this.salary * 0.15;
        }
        return 0;
    }

    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double totalSalaryWithTaxAndBonus = this.salary - tax + bonus;
        double totalSalary = totalSalaryWithTaxAndBonus + raise;

        return "Adı : " + this.name + "\n" +
               "Maaşı : " + this.salary + "\n" +
               "Çalışma Saati : " + this.workHours + "\n" +
               "Başlangıç Yılı : " + this.hireYear + "\n" +
               "Vergi : " + tax + "\n" +
               "Bonus : " + bonus + "\n" +
               "Maaş Artışı : " + raise + "\n" +
               "Vergi ve Bonuslar ile birlikte maaş : " + totalSalaryWithTaxAndBonus + "\n" +
               "Toplam Maaş : " + totalSalary; 
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(emp.toString());
    }
}
