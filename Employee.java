
import java.util.Objects;

import javax.persistence.*;

import org.hibernate.mapping.List;

@Entity
public class Employee extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeID;
    private String departmentName;
    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;
    
    
        
        @OneToMany(cascade = CascadeType.ALL,
                orphanRemoval = true,
                targetEntity = ContactDetails.class,
                fetch = FetchType.LAZY)
        private List contactDetails; // Unidirectional Relationship
        //private Set<ContactDetails> contactDetails;



	public long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(departmentName, employeeID, laptop);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(departmentName, other.departmentName) && employeeID == other.employeeID
				&& Objects.equals(laptop, other.laptop);
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", departmentName=" + departmentName + ", laptop=" + laptop + "]";
	}
    
}
