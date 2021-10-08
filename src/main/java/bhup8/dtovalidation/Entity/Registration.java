package bhup8.dtovalidation.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Registration {
    @Id
    @GeneratedValue()
    private int id;
    @NotBlank(message = "First Name can not be null")
    private String name;
    private String middle;
    @NotEmpty(message = "Last Name can not be null must have atleast 1 character and whitespace")
    private String lastName;
    //@NotBlank
    @NotBlank
    private String dob;
    @NotBlank
    @Email(message = "Please provide a valid mail")
    private String email;
    @Digits(fraction = 0, integer = 10)
    private int mobNumber;
   // private float mobNumber;
   // private String mobNumber;
    @NotNull
    @Size(min = 2, max=10,message = "Address Should have atleast 2 character and maximum 10 character")
    private String address;

    public Registration() {
    }

    public Registration(int id, String name, String middle, String lastName, String dob, String email, int mobNumber, String address) {
        this.id = id;
        this.name = name;
        this.middle = middle;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.mobNumber = mobNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(int mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
