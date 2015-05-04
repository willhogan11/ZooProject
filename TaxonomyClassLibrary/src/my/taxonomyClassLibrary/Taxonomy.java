/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package my.taxonomyClassLibrary;

/**
 *
 * @author patrick
 */
public class Taxonomy {
    
    private int taxonCode;
    private String species;
    private String family;
    private String ordering;
    private String className;
    private String phylum;
    private String kingdom;

    /**
     * @return the taxonCode
     */
    public int getTaxonCode() {
        return taxonCode;
    }

    /**
     * @param taxonCode the taxonCode to set
     */
    public void setTaxonCode(int taxonCode) {
        this.taxonCode = taxonCode;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the family
     */
    public String getFamily() {
        return family;
    }

    /**
     * @param family the family to set
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * @return the ordering
     */
    public String getOrdering() {
        return ordering;
    }

    /**
     * @param ordering the ordering to set
     */
    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return the phylum
     */
    public String getPhylum() {
        return phylum;
    }

    /**
     * @param phylum the phylum to set
     */
    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    /**
     * @return the kingdom
     */
    public String getKingdom() {
        return kingdom;
    }

    /**
     * @param kingdom the kingdom to set
     */
    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }
   
}