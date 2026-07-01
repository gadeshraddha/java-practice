/*Name: Employee
Data member/Attributes: id (int), salary (int)
Constructor: Employee(id,salary) -> Initializes values to respective variables 
Name: SalesEmployee (extends Employee)
Data member/Attributes: sales (int)
Constructor: SalesEmployee(id,salary,sales) -> calls super(id,salary) and initialzes value to sales*/

class inheritance {

    static class Employee {
        int id;
        int salary;

        Employee(int id, int salary) {
            this.id = id;
            this.salary = salary;
        }
    }


    static class SalesEmployee extends Employee {

        int sales;

        SalesEmployee(int id, int salary, int sales) {

            super(id, salary);

            this.sales = sales;
        }
    }


    public static void main(String[] args) {

        SalesEmployee se = new SalesEmployee(1, 50000, 100);

        System.out.println("ID: " + se.id);
        System.out.println("Salary: " + se.salary);
        System.out.println("Sales: " + se.sales);
    }
}