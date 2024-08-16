import java.util.Optional;

public class OptionalExample {
    class Employee{
        String name;
        Employee(String name){
            this.name = name;
        }
    }
    public void optionalMethods(){

        Optional<Employee> employee = Optional.of(new Employee("Padma"));
        Optional<Employee> nullEmployee = Optional.ofNullable(null);
        Optional<Employee> emptyEmployee = Optional.empty();

        System.out.println(employee.get().name);
        employee.ifPresent(e -> System.out.println("Name is present " + e.name));

        System.out.println(nullEmployee.map(e -> e.name).orElse("Null value"));
        System.out.println(emptyEmployee.map(e -> e.name).orElse("Empty value"));

    }
}
