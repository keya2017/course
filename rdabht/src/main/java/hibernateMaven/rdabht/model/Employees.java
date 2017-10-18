package model;
// Generated 7 Sep, 2017 7:26:20 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Employees generated by hbm2java
 */
public class Employees  implements java.io.Serializable {


     private Integer eid;
     private Courses courses;
     private Division division;
     private String ename;
     private String emppic;
     private String designation;
     private String whtasapp;
     private String localnum;
     private String skype;
     private String dropbox;
     private String email;
     private Date dob;
     private String password;
     private String passportno;
     private Date passportExpiry;
     private String visaNo;
     private Date visaExpiry;
     private Date doj;
     private Date dor;
     private int statusId;
     private String experence;
     private String nationality;
     private String qulification;
     private String skillset;
     private String resetToken;
     private Date resetDate;
     private Set batchesForLocalSpoc = new HashSet(0);
     private Set batchesForSoftSkillTrainer = new HashSet(0);
     private Set batchesForTechTrainer = new HashSet(0);
     private Set consultants = new HashSet(0);

    public Employees() {
    }

	
    public Employees(String ename, Date doj, int statusId) {
        this.ename = ename;
        this.doj = doj;
        this.statusId = statusId;
    }
    public Employees(Courses courses, Division division, String ename, String emppic, String designation, String whtasapp, String localnum, String skype, String dropbox, String email, Date dob, String password, String passportno, Date passportExpiry, String visaNo, Date visaExpiry, Date doj, Date dor, int statusId, String experence, String nationality, String qulification, String skillset, String resetToken, Date resetDate, Set batchesForLocalSpoc, Set batchesForSoftSkillTrainer, Set batchesForTechTrainer, Set consultants) {
       this.courses = courses;
       this.division = division;
       this.ename = ename;
       this.emppic = emppic;
       this.designation = designation;
       this.whtasapp = whtasapp;
       this.localnum = localnum;
       this.skype = skype;
       this.dropbox = dropbox;
       this.email = email;
       this.dob = dob;
       this.password = password;
       this.passportno = passportno;
       this.passportExpiry = passportExpiry;
       this.visaNo = visaNo;
       this.visaExpiry = visaExpiry;
       this.doj = doj;
       this.dor = dor;
       this.statusId = statusId;
       this.experence = experence;
       this.nationality = nationality;
       this.qulification = qulification;
       this.skillset = skillset;
       this.resetToken = resetToken;
       this.resetDate = resetDate;
       this.batchesForLocalSpoc = batchesForLocalSpoc;
       this.batchesForSoftSkillTrainer = batchesForSoftSkillTrainer;
       this.batchesForTechTrainer = batchesForTechTrainer;
       this.consultants = consultants;
    }
   
    public Integer getEid() {
        return this.eid;
    }
    
    public void setEid(Integer eid) {
        this.eid = eid;
    }
    public Courses getCourses() {
        return this.courses;
    }
    
    public void setCourses(Courses courses) {
        this.courses = courses;
    }
    public Division getDivision() {
        return this.division;
    }
    
    public void setDivision(Division division) {
        this.division = division;
    }
    public String getEname() {
        return this.ename;
    }
    
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getEmppic() {
        return this.emppic;
    }
    
    public void setEmppic(String emppic) {
        this.emppic = emppic;
    }
    public String getDesignation() {
        return this.designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getWhtasapp() {
        return this.whtasapp;
    }
    
    public void setWhtasapp(String whtasapp) {
        this.whtasapp = whtasapp;
    }
    public String getLocalnum() {
        return this.localnum;
    }
    
    public void setLocalnum(String localnum) {
        this.localnum = localnum;
    }
    public String getSkype() {
        return this.skype;
    }
    
    public void setSkype(String skype) {
        this.skype = skype;
    }
    public String getDropbox() {
        return this.dropbox;
    }
    
    public void setDropbox(String dropbox) {
        this.dropbox = dropbox;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassportno() {
        return this.passportno;
    }
    
    public void setPassportno(String passportno) {
        this.passportno = passportno;
    }
    public Date getPassportExpiry() {
        return this.passportExpiry;
    }
    
    public void setPassportExpiry(Date passportExpiry) {
        this.passportExpiry = passportExpiry;
    }
    public String getVisaNo() {
        return this.visaNo;
    }
    
    public void setVisaNo(String visaNo) {
        this.visaNo = visaNo;
    }
    public Date getVisaExpiry() {
        return this.visaExpiry;
    }
    
    public void setVisaExpiry(Date visaExpiry) {
        this.visaExpiry = visaExpiry;
    }
    public Date getDoj() {
        return this.doj;
    }
    
    public void setDoj(Date doj) {
        this.doj = doj;
    }
    public Date getDor() {
        return this.dor;
    }
    
    public void setDor(Date dor) {
        this.dor = dor;
    }
    public int getStatusId() {
        return this.statusId;
    }
    
    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
    public String getExperence() {
        return this.experence;
    }
    
    public void setExperence(String experence) {
        this.experence = experence;
    }
    public String getNationality() {
        return this.nationality;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getQulification() {
        return this.qulification;
    }
    
    public void setQulification(String qulification) {
        this.qulification = qulification;
    }
    public String getSkillset() {
        return this.skillset;
    }
    
    public void setSkillset(String skillset) {
        this.skillset = skillset;
    }
    public String getResetToken() {
        return this.resetToken;
    }
    
    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }
    public Date getResetDate() {
        return this.resetDate;
    }
    
    public void setResetDate(Date resetDate) {
        this.resetDate = resetDate;
    }
    public Set getBatchesForLocalSpoc() {
        return this.batchesForLocalSpoc;
    }
    
    public void setBatchesForLocalSpoc(Set batchesForLocalSpoc) {
        this.batchesForLocalSpoc = batchesForLocalSpoc;
    }
    public Set getBatchesForSoftSkillTrainer() {
        return this.batchesForSoftSkillTrainer;
    }
    
    public void setBatchesForSoftSkillTrainer(Set batchesForSoftSkillTrainer) {
        this.batchesForSoftSkillTrainer = batchesForSoftSkillTrainer;
    }
    public Set getBatchesForTechTrainer() {
        return this.batchesForTechTrainer;
    }
    
    public void setBatchesForTechTrainer(Set batchesForTechTrainer) {
        this.batchesForTechTrainer = batchesForTechTrainer;
    }
    public Set getConsultants() {
        return this.consultants;
    }
    
    public void setConsultants(Set consultants) {
        this.consultants = consultants;
    }




}


