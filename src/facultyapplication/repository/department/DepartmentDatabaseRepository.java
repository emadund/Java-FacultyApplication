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
public class DepartmentDatabaseRepository implements DepartmentRepository{
    @Override
    public void save(Department department){
        System.out.println("Save to database...");
    }

    @Override
    public List<Department> getAll() {
        return null;
    }

    @Override
    public void update(Department department) {
       
    }
}
