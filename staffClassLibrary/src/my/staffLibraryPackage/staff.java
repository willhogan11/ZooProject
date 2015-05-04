package my.staffLibraryPackage;


public class staff {

    private String firstName;
    private String lastName;
    private String title;
    private String username;
    private String password;
    private String worksInHabitat;
    private int habitatID;
    private String habitatName;
    private int newStaffID;
    private String managesArea;


    public staff () {
        super();
    }


    public String getFirstName () {
        return firstName;
    }


    public void setFirstName (String val) {
        this.firstName = val;
    }


    public int getHabitatID () {
        return habitatID;
    }


    public void setHabitatID (int val) {
        this.habitatID = val;
    }


    public String getHabitatName () {
        return habitatName;
    }


    public void setHabitatName (String val) {
        this.habitatName = val;
    }


    public String getLastName () {
        return lastName;
    }


    public void setLastName (String val) {
        this.lastName = val;
    }


    public int getNewStaffID () {
        return newStaffID;
    }


    public void setNewStaffID (int val) {
        this.newStaffID = val;
    }


    public String getPassword () {
        return password;
    }

    public void setPassword (String val) {
        this.password = val;
    }


    public String getTitle () {
        return title;
    }


    public void setTitle (String val) {
        this.title = val;
    }


    public String getUsername () {
        return username;
    }


    public void setUsername (String val) {
        this.username = val;
    }


    public String getWorksInHabitat () {
        return worksInHabitat;
    }


    public void setWorksInHabitat (String val) {
        this.worksInHabitat = val;
    }


    public String getManagesArea () {
        return managesArea;
    }


    public void setManagesArea (String val) {
        this.managesArea = val;
    }

}