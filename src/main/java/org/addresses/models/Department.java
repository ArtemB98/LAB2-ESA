package org.addresses.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "department", schema = "public")
public class Department {

    @GeneratedValue
    @Id
    @Column(name = "id")
    private long id;

    @Basic
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "departmentByDepartmentId",targetEntity=Employee.class)
    private Collection<Employee> employeesById;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Collection<Employee> getEmployeesById() {
        return employeesById;
    }

    public void setEmployeesById(Collection<Employee> employeesById) {
        this.employeesById = employeesById;
    }
}
