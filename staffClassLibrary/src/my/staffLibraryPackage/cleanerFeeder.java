package my.staffLibraryPackage;

public class cleanerFeeder extends staff {
 
    private int reportsToID;
    private String reportsToName;
    private String cleaningProductsRequired;
    private String notes;
    private String reportsTo;
    private String jobDescription;

    public cleanerFeeder () {
    }


    public String getReportsTo () {
        return reportsTo;
    }


    public void setReportsTo (String val) {
        this.reportsTo = val;
    }


    public int getReportsToID () {
        return reportsToID;
    }


    public void setReportsToID (int val) {
        this.reportsToID = val;
    }


     public String getJobDescription () {
        return jobDescription;
    }


    public void setJobDescription (String val) {
        this.jobDescription = val;
    }


    public String getCleaningProductsRequired () {
        return cleaningProductsRequired;
    }


    public void setCleaningProductsRequired (String val) {
        this.cleaningProductsRequired = val;
    }


    public String getNotes () {
        return notes;
    }


    public void setNotes (String val) {
        this.notes = val;
    }


    public String getReportsToName () {
        return reportsToName;
    }


    public void setReportsToName (String val) {
        this.reportsToName = val;
    }

    public String canFeedAnimals (String val) {
        return val;
    }


    public String canCleanArea (String val) {
        return val;
    }

}