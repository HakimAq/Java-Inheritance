package week5;

public class JoiniorDeveloper extends Developer {
    private double salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;

    public JoiniorDeveloper(String platform, String interviwerName, int workingHour, double salary, String appointedBy, String terminationDate){
        super(platform, interviwerName, workingHour);
        this.salary=salary;
        this.appointedDate="";
        this.evaluationPeriod="";
        this.terminationDate=terminationDate;
        this.specialization="";
        this.appointedBy=appointedBy;
        this.joined=false;
    }
    public double getSalary(){
        return salary;
    }
    public String getAppointedDate(){
        return appointedDate;
    }
    public String getEvalutationPeriod(){
        return evaluationPeriod;
    }
    public String getTerminationDat(){
        return terminationDate;
    }
    public String getSpecialization(){
        return specialization;
    }
    public String getAppointedBy(){
        return appointedBy;
    }
    public boolean getJoined(){
        return joined;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specilization){
        if(joined == false){
            super.setDeveloperName(developerName);
            joined=true;
            this.appointedDate=appointedDate;
            this.specialization=specialization;
            this.terminationDate=terminationDate;
        }
        else{
            System.out.println("The developer is appointed "+ appointedDate);
        }
    } 
    public void display(){
        super.display();
        if(joined==true){
                System.out.println("The appointed date is "+ appointedDate);
                System.out.println("Developer name is "+ super.getDeveloperName());
                System.out.println("Termination date is "+ terminationDate);
                System.out.println("Salary is "+ salary);
                System.out.println("Evaluation date is "+ evaluationPeriod);
                System.out.println("Developer specilization is "+ specialization);
                System.out.println("The developer appointed by "+ appointedBy);
    }
    }

}
