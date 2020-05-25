package space.banka.alyona.nauka.schedule.db.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
public class Employee {

    @Id
    Integer id;

    String name;
    String surname;
    Date birthDate;

    @ManyToOne
    Position position;

    boolean remoteWork;

    String address;

    @ManyToOne
    Department department;

    @OneToMany(mappedBy = "employee")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    public Collection<EmployeeDay> employeeDays;
}
