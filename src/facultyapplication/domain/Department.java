/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facultyapplication.domain;

/**
 *
 * @author korisnik
 */
public class Department {
    private String shortname;
    private String name;

    public Department() {
    }

    public Department(String shortname, String name) {
        this.shortname = shortname;
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" + "shortname=" + shortname + ", name=" + name + '}';
    }


    
}
