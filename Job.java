public class Job {
    //private instance variables
    private double payPerToy;
    private String jobTitle;
    
    //constructor
    public Job(double payPerToy, String jobTitle){
        this.payPerToy = payPerToy;
        this.jobTitle = jobTitle;
    }
    
    //getter and setter methods
    public double getPay(){
        return payPerToy;
    }
    
    public void setPay(double payPerToy){
        this.payPerToy = payPerToy;
    }
    
    public String getJobTitle(){
        return jobTitle;
    }
    
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
}