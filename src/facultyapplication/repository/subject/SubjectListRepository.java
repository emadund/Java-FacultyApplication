/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facultyapplication.repository.subject;

import facultyapplication.domain.Subject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author korisnik
 */
public class SubjectListRepository implements SubjectRepository{
    private List<Subject> subjects;

    public SubjectListRepository() {
        subjects = new ArrayList<>();
    }
    
    @Override
    public void save(Subject subject) throws Exception {
        //proveri da li subject postoji
        /*for (Subject s : subjects)
        {
        if (s.getName().equals(subject.getName()))
        {
        throw new Exception("Predmet vec postoji.");
        }
        }*/
        
        if (subjects.contains(subject))
        {
            throw new Exception("Predmet vec postoji.");
        }
        else
        {
            subjects.add(subject);
        }
        
    }

    @Override
    public List<Subject> getAll() {
        return subjects;
    }

    @Override
    public void update(Subject subject) {
        for (Subject s : subjects) {
            if (s.getName().equals(subject.getName())){
                s.setEspb(subject.getEspb());
                s.setDepartment(subject.getDepartment());
                return;
            }
        }
    }
    
}
