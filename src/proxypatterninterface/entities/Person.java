package proxypatterninterface.entities;

public class Person {

    private Long id;

    private String firstName;

    private String lastName;

    public Person() {
	// TODO Auto-generated constructor stub
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    @Override
    public String toString() {
	return "{id=" + id + ", firstName=" + firstName
		+ ", lastName=" + lastName + "}";
    }

}
