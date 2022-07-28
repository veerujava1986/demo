package Streams;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    int id;
    String Group;
    int quantity;
}
