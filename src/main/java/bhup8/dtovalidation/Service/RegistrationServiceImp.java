package bhup8.dtovalidation.Service;

import bhup8.dtovalidation.Entity.Registration;
import bhup8.dtovalidation.Repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegistrationServiceImp implements RegistrationService{
    @Autowired
    RegistrationRepository repository;
    @Override
    public List<Registration> getAllRegistration() {
        return (List<Registration>) repository.findAll();
    }

    @Override
    public Registration getRegistration(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void create(Registration registration) {
        repository.save(registration);

    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);

    }

    @Override
    public void update(int id, Registration registration) {
        Registration registration1=repository.findById(id).get();
        registration1.setName(registration.getName());
        registration1.setMiddle(registration.getMiddle());
        registration1.setLastName(registration.getLastName());
        registration1.setDob(registration.getDob());
        registration1.setEmail(registration.getEmail());
        registration1.setMobNumber(registration.getMobNumber());
        registration1.setAddress(registration.getAddress());
        repository.save(registration1);
        System.out.println("Data Updated Successfully");

    }
}
