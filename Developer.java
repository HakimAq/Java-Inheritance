package week5;

public class Developer {
    private String platform;
    private String interviwerName;
    private String developerName;
    private int workingHour;

    public Developer(String platform, String interviwerName, int workingHour){
        this.platform=platform;
        this.interviwerName=interviwerName;
        this.developerName="";
        this.workingHour=workingHour;

    }
    public String getPlatform(){
        return platform;
    }
    public String getInterviwerName(){
        return interviwerName;
    }
    public String getDeveloperName(){
        return developerName;
    }
    public int getWorkingHour(){
        return workingHour;
    }
    public void setDeveloperName(String developerName){
        this.developerName=developerName;

    }

    public void display(){
        System.out.println("The platform is "+ platform);
        System.out.println("The interviwer name is "+ interviwerName);
        if(developerName!= ""){
            System.out.println("The developer name is "+ developerName);
        }
        System.out.println("The working hour is "+ workingHour);
    }
    
}
