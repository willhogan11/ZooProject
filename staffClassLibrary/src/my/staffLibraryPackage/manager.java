package my.staffLibraryPackage;

public class manager extends staff {

    private String jobDescription;

    public manager () {
    }


    public String getReportsTo () {
        return null;
    }


    public void setReportsTo (String val) {
    }


    public int getReportsToID () {
        return 0;
    }


    public void setReportsToID (int val) {
    }


    public String getJobDescription () {
        return jobDescription;
    }


    public void setJobDescription (String val) {
        this.jobDescription = val;
    }

    public String canManageStaff(String val)
    {
        return val;
    }

}