package bhup8.dtovalidation.Controller;

import bhup8.dtovalidation.Entity.Registration;
import bhup8.dtovalidation.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RegistrationController {
    @Autowired
    RegistrationService service;

    @GetMapping("/getAllRegistration")
    public List<Registration> getAllRegistration(){
        return service.getAllRegistration();

    }
    @GetMapping("/getRegistration/{id}")
    public Registration getRegistration(@PathVariable int id){
        return service.getRegistration(id);

    }
    @PostMapping("/create")
    public String create(@Valid @RequestBody Registration registration){
        service.create(registration);
        return "Data Created";

    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "Data Deleted";

    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable int id, @Valid @RequestBody Registration registration){
        service.update(id, registration);
        return "Data Updated Successfully";

    }
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
