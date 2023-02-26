/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facultyapplication.repository.department;

import facultyapplication.domain.Department;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author korisnik
 */
public class DepartmentListRepository implements DepartmentRepository{
    private List<Department> departments;

    public DepartmentListRepository() {
        departments = new ArrayList<>();
        
        departments.add(new Department("d-1", "Department - 1"));
    }
    
    @Override
    public void save(Department department){
        departments.add(department);
    }

    @Override
    public List<Department> getAll() {
        return departments;
    }

    @Override
    public void update(Department department) {
        for (Department dept : departments) {
            if (dept.getShortname().equals(department.getShortname())){
                dept.setName(department.getName());
                break;
            }
        }
    }
    
    
}
