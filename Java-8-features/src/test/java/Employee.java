import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private int id;
    private int salary;
    private int age;

}
