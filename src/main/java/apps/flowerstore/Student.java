package apps.flowerstore;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table
public class Student {
    Long id;
    String firstName;
    String name;
    String gender;
    @Transient
    int age;

}
