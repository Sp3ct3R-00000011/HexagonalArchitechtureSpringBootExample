package hexaDemo.infrastructure.dataJPA.repository;
import hexaDemo.model.laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface laptopRepo extends JpaRepository<laptop, String> {

}
