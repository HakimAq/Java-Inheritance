package week5;

public class SeniorDeveloper extends Developer{
    private double salary;
    private String joiningDate;
    private String staffRoomNo;
    private int contactPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;

    public SeniorDeveloper(String platform, String interviwerName, int workingHour, double salary,int contactPeriod){
        super(platform, interviwerName, workingHour);
        this.salary=salary;
        this.contactPeriod=contactPeriod;
        this.joiningDate="";
        this.staffRoomNo="";
        this.advanceSalary=0.0;
        this.appointed=false;
        this.terminated=false;
    }
    public double getSalary(){
        return salary;
    }
    public int getContactPeriod(){
        return contactPeriod;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
    public String getStaffRoomNo(){
        return staffRoomNo;
    }
    public double getAdvanceSalary(){
        return advanceSalary;
    }
    public boolean getAppointed(){
        return appointed;
    }
    public boolean getTerminhated(){
        return terminated;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setContactPeriod(int contactPeriod){
        this.contactPeriod=contactPeriod;
    }
    
    public void hireDeveloper(String developerName, String joiningDate, double advanceSalary, String staffRoomNo ){
        if(appointed == true){
            System.out.println("The developer name is "+ developerName +" & The staff room no. is "+ staffRoomNo);
         }
         else{
                super.setDeveloperName(developerName);
                this.joiningDate=joiningDate;
                this.staffRoomNo=staffRoomNo;
                this.advanceSalary=advanceSalary;
                this.appointed=true;
                this.terminated=false;
            }
        }

    public void terminatDeveloper(){
        if(terminated  == true){
            System.out.println("the developer is terminated");
        }
        else{
            super.setDeveloperName("");
            this.joiningDate="";
            this.advanceSalary=0.0;
            this.appointed=false;
            this.terminated=true;

        }
    }


    public void display(){
        super.display();
        if(appointed==true){
            System.out.println("The termination status is "+ terminated);
            System.out.println("The joining date is "+ joiningDate);
            System.out.println("the advance salary is "+ advanceSalary);
        }
    }
}

