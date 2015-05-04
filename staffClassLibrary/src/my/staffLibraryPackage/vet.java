package my.staffLibraryPackage;

public class vet extends staff {


    private int reportsToID;
    private String reportsToName;
    private String speciality; //{Bovine, Equine, Reptile, Amphibian, Birds, Feline, Canine, Microbiology, Poultry, Parsitology};
    private String notes;
    private String jobDescription;

    public vet () {
    }


    public String getReportsTo () {
        return reportsToName;
    }


    public String getJobDescription () {
        return jobDescription;
    }


    public void setJobDescription (String val) {
        this.jobDescription = val;
    }

    public void setReportsTo (String val) {
        this.reportsToName = val;
    }


    public int getReportsToID () {
        return reportsToID;
    }


    public void setReportsToID (int val) {
        this.reportsToID = val;
    }


    public String getReportsToName () {
        return reportsToName;
    }


    public void setReportsToName (String val) {
        this.reportsToName = val;
    }


    public String getSpeciality () {
        return speciality;
    }


    public void setSpeciality (String val) {
        this.speciality = val;
    }


    public String getNotes () {
        return notes;
    }


    public void setNotes (String val) {
        this.notes = val;
    }


    public String canExamineAnimals(String val) {
        return val;
    }
}