package apps.flowerstore;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository {
    @Query("SElECT s FROM student s WHERE s.firstName = :firstName")
    public Optional<Student> findFirstName(String firstName);
    
}
