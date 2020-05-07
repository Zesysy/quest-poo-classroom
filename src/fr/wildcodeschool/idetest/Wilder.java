package fr.wildcodeschool.idetest;

public class Wilder {
	
	// attributes
    private String firstname;
    private boolean aware;
	
    // constructor
    public Wilder(String firstname) {
        this.firstname = firstname;
    }
    
    // getters
    public String getfirstname() {
        return this.firstname;
    }
    
    public boolean isAware() {
        return this.aware;
    }
    
    // setter
    public void setAware(boolean aware) {
        this.aware = aware;
    }
    
    // method
    public String whoAmI() {
    	
    	if (this.isAware() == true) {
    		 return "Je m'appelle " + this.getfirstname() + " et je suis aware." ;
    	} else {
    		return "Je m'appelle " + this.getfirstname() + " et je ne suis pas aware." ;
    	}
    }
}
