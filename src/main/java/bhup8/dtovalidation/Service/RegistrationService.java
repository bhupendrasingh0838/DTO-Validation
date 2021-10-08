package bhup8.dtovalidation.Service;

import bhup8.dtovalidation.Entity.Registration;

import java.util.List;

public interface RegistrationService {

    public List<Registration>getAllRegistration();

    public Registration getRegistration(int id);

    public void create(Registration registration);

    public void delete(int id);

    public void update(int id, Registration registration);
}
