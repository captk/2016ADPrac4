/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2016adprac4;

/**
 *
 * @author k
 */
public class Student {
    
    private int idNumber;
    private String familyName;
    private String personalName;
    private int yearOfBirth;

    public Student(int idNumber, String familyName, String personalName, int yearOfBirth) {
        this.idNumber = idNumber;
        this.familyName = familyName;
        this.personalName = personalName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getPersonalName() {
        return personalName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
}
