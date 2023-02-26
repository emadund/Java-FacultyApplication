/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facultyapplication.repository.department;

import facultyapplication.domain.Department;
import java.util.List;

/**
 *
 * @author korisnik
 */
public interface DepartmentRepository {
    void save(Department department);
    List<Department> getAll();
    void update(Department department) ;
}
