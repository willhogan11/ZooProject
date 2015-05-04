package my.animalLibraryPackage;

public class Animal {

    private int animalId = 0;
    private int zooHabitatID = 0;
    private int IUCNCode = 0;
    private int taxonomyID = 0;
    private int foodID = 0;
    private int animalHistoryID = 0;
    private int age = 0;
    private int areaSize = 0;
    private int dailyFeeds = 0;
    private double weightKg = 0.0;
    private double heightFt = 0.0;
    private double lengthFt = 0.0;
    private String commonName = "";
    private String nickName = "";
    private String gender = "";
    private String birthDate = "";
    private String birthLocation = "";
    private String countryOfOrigin = "";
    private String species = "";
    private String family = "";
    private String ordering = "";
    private String animalClass = "";
    private String phylum = "";
    private String kingdom = "";
    private String zooHabitat = "";
    private String IUCNStatus = "";
    private String foodType = "";
    private String previousLocation = "";
    private String dateArrived = "";
    private String dateDeparted = "";
    private String departedTo = "";
    private String dateDeceased = "";


    public void setTaxonomyID (int value) {
        this.taxonomyID = value;
    }


    public int getTaxonomyID () {
        return taxonomyID;
    }
    
    public void setAnimalID (int value) {
        this.animalId = value;
    }


    public int getAnimalID () {
        return animalId;
    }


    public void setCommonName (String value) {
        this.commonName = value;
    }


    public String getCommonName () {
        return commonName;
    }


    public void setNickName (String value) {
        this.nickName = value;
    }


    public String getNickName () {
        return nickName;
    }


    public void setGender (String value) {
        this.gender = value;
    }


    public String getGender () {
        return gender;
    }


    public void setAge (int value) {
        this.age = value;
    }


    public int getAge () {
        return age;
    }


    public void setBirthdate (String value) {
        this.birthDate = value;
    }


    public String getBirthdate () {
        return birthDate;
    }


    public void setBirthLocation (String value) {
        this.birthLocation = value;
    }


    public String getBirthLocation () {
        return birthLocation;
    }


    public void setCountryOfOrigin (String value) {
        this.countryOfOrigin = value;
    }


    public String getCountryOfOrigin () {
        return countryOfOrigin;
    }


    public void setWeight (double value) {
        this.weightKg = value;
    }


    public double getWeight () {
        return weightKg;
    }


    public void setHeight (double value) {
        this.heightFt = value;
    }


    public double getHeight () {
        return heightFt;
    }


    public void setLength (double value) {
        this.lengthFt = value;
    }


    public double getLength () {
        return lengthFt;
    }


    public void setIUCNCode (int val) {
        this.IUCNCode = val;
    }


    public int getIUCNCode () {
        return IUCNCode;
    }


    public String getIUCNStatus () {
        return IUCNStatus;
    }


    public void setIUCNStatus (String val) {
        this.IUCNStatus = val;
    }


    public String getAnimalClass () {
        return animalClass;
    }


    public void setAnimalClass (String val) {
        this.animalClass = val;
    }

    public int getAnimalHistoryID () {
        return animalHistoryID;
    }

    public void setAnimalHistoryID (int val) {
        this.animalHistoryID = val;
    }

    public int getAreaSize () {
        return areaSize;
    }

    public void setAreaSize (int val) {
        this.areaSize = val;
    }


    public int getDailyFeeds () {
        return dailyFeeds;
    }


    public void setDailyFeeds (int val) {
        this.dailyFeeds = val;
    }


    public String getDateArrived () {
        return dateArrived;
    }

    public void setDateArrived (String val) {
        this.dateArrived = val;
    }


    public String getDateDeceased () {
        return dateDeceased;
    }


    public void setDateDeceased (String val) {
        this.dateDeceased = val;
    }


    public String getDateDeparted () {
        return dateDeparted;
    }


    public void setDateDeparted (String val) {
        this.dateDeparted = val;
    }

    public String getDepartedTo () {
        return departedTo;
    }


    public void setDepartedTo (String val) {
        this.departedTo = val;
    }

    public String getFamily () {
        return family;
    }


    public void setFamily (String val) {
        this.family = val;
    }


    public int getFoodID () {
        return foodID;
    }


    public void setFoodID (int val) {
        this.foodID = val;
    }


    public String getFoodType () {
        return foodType;
    }


    public void setFoodType (String val) {
        this.foodType = val;
    }

    public String getKingdom () {
        return kingdom;
    }


    public void setKingdom (String val) {
        this.kingdom = val;
    }


    public String getOrdering () {
        return ordering;
    }


    public void setOrdering (String val) {
        this.ordering = val;
    }


    public String getPhylum () {
        return phylum;
    }


    public void setPhylum (String val) {
        this.phylum = val;
    }

    public String getPreviousLocation () {
        return previousLocation;
    }


    public void setPreviousLocation (String val) {
        this.previousLocation = val;
    }


    public String getSpecies () {
        return species;
    }


    public void setSpecies (String val) {
        this.species = val;
    }


    public String getZooHabitat () {
        return zooHabitat;
    }


    public void setZooHabitat (String val) {
        this.zooHabitat = val;
    }


    public int getZooHabitatID () {
        return zooHabitatID;
    }


    public void setZooHabitatID (int val) {
        this.zooHabitatID = val;
    }
}