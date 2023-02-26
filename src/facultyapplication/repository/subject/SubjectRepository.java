/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facultyapplication.repository.subject;

import facultyapplication.domain.Subject;
import java.util.List;

/**
 *
 * @author korisnik
 */
public interface SubjectRepository {
    void save(Subject subject) throws Exception;
    List<Subject> getAll();
    void update(Subject subject);
}
