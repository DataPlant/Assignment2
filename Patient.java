package Assignment2;

public class Patient {
    //Name
    public String firstName;
    public String middleName;
    public String lastName;
    //Address
    public String address;
    public String city;
    public String state;
    public String zip;
    //Phone Number
    public String phoneNumber;
    //Emergency Contact
    public String emerName;
    public String emerNumber;

    //Starting Constructors
    
    //No ARG Constructor
    public Patient(){
        firstName = "No Name";
        middleName = "No Name";
        lastName = "No Name";
        address = "Does Not Exist";
        city = "Does Not Exist";
        phoneNumber = "000-000-0000";
        emerName = "No Emergency Contact";
        emerNumber = "No Emergency Number";
    }
    //Setting First, Middle, and Last Names Constructor
    public void set3Names(String x, String y, String z){
        this.firstName = x;
        this.middleName = y;
        this.lastName = z;
    }
    //Setting First and Last Names Constructor
    public void set2Names(String x, String y){
        this.firstName = x;
        this.lastName = x;
    }
    //Setting Addresses
    public void setAddress(String xaddress, String xcity, String xstate, String xzip){
        this.address = xaddress;
        this.city = xcity;
        this.state = xstate;
        this.zip = xzip;
    }
    //Setting Phone Number
    public void setPhone(String xnumber){
        this.phoneNumber = xnumber;
    }
    //Setting Emergency Contact
    public void setEmer(String emergname, String emernumber){
        this.emerName = emergname;
        this.emerNumber = emernumber;
    }
    //Combine Name
    public String buildFullName(){
        String fullName = this.firstName + " " + this.middleName + " " + this.lastName;
        return fullName;
    }
    //Get First Name
    public String getFirstName(){
        return this.firstName;
    }
    //Get Middle Name
    public String getMiddleName(){
        return this.middleName;
    }
    public String toString() {
        return "First Name:" + firstName + "\nMiddle Name:" + middleName + "\nLast Name:" + lastName +
        "Address: " + address + " " + city + ", " + state + " " + zip + "\nPhone Number:" + phoneNumber +
        "\nEmergency Contact Name:" + emerName + "\nEmergency Contact Number:" + emerNumber;
    }
}
