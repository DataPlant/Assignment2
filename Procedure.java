package Assignment2;

public class Procedure {
    public String pname;
    public String date;
    public String doctor;
    public double cost;

    //Constructor no arg
    public Procedure(){
        this.pname = "Default Procedure";
        this.date = "00/00/0000";
        this.doctor = "Default Doctor";
        this.cost = 0.00;
    }
    //Procedure Name/Date
    public void pBasic(String proName, String proDate){
        this.pname = proName;
        this.date = proDate;
    }
    //Procedure Details All
    public void pDetail(String proName, String proDate, String proDoctor, double proCost){
        this.pname = proName;
        this.date = proDate;
        this.doctor = proDoctor;
        this.cost = proCost;
    }
}
