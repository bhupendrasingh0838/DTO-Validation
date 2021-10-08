package bhup8.dtovalidation.Repository;

import bhup8.dtovalidation.Entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration,Integer> {
}
