/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr.ws.b.datamahasiswa;

/**
 *
 * @author alamnurcahaya
 */
public class DataMahasiswa {
    public String name;
    public String studentid;
    public String dateofbirth;
    public String gender;
    private String photo;
    public DataMahasiswa() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        
    public String getStudentID(){
        return studentid;
    }
    public void setStudentID(String studentid){
        this.studentid = studentid;
    }
    
    public String getDateofBirth(){
        return dateofbirth;
    }
    public void setDateofBirth(String dateofbirth){
        this.dateofbirth = dateofbirth;
    }
    
    public String getGender(){
        return gender;
    }
    public void setGender(String Gender){
        gender = Gender;
    }
    
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo){
        this.photo = photo;
    }
}