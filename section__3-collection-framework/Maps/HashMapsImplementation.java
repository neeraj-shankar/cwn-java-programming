import java.util.HashMap;
import java.util.Objects;

class CommonMethods{

    public void test(){


    }

}

class Employee{
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        // If the provided objects is same return true
        System.out.println("Self Object: "+ this);
        System.out.println("Object passed as argument: "+obj);
        if (this == obj) return true;

        // If the provided object is null or belong to different class they are not same
        if (obj == null || getClass() != obj.getClass()) return false;

        // Finally type cast provided object to employee 
        Employee employee = (Employee) obj;

        // At last check if the provided object has same id and name

        return (id == employee.id && Objects.equals(name, employee.name));
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name);
    }
}
public class HashMapsImplementation {

    public static void main(String[] args) {
        
        Employee emp1 = new Employee(1, "Neeraj");
        Employee emp2 = new Employee(1, "Neeraj");

        HashMap<Employee, String> map = new HashMap<>();

        map.put(emp1, "Arizona");
        map.put(new Employee(101, "Alice"), "Developer");
        System.out.println("Hashmap content: "+ map);
        System.out.println(map.get(emp2));
    }
    
}
