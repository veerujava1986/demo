package com.example.root.lombak;
import lombok.*;

@Setter
@Getter
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    public int id;
    public String name;
    public float salary;
}
