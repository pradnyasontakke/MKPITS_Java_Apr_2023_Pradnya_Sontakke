/*one class employee here store the data name and salary
create second class where write switch case
in main method call that classes object
in switch case
if press 1 then add the record
2 display
3 find
4 modify
5 delete
6 delete all
0 exit
 */

public class Employee {
    String name;
    int salary;

    public Employee() {
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String setname(String name) {
        this.name = name;
        return name;
    }
    public String getname() {
        return name;
    }

    @Override
    public String toString() {  //convert object to string
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}