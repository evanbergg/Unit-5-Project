public class Elf {
    //private instance variables
    private String name;
    private Job job;
    private double money;
    //constructor
    public Elf(String name, Job job){
        this.name = name;
        this.job = job;
        //this increases the number of workers everytime a new Elf is created
        Santa.increaseWorkers();
    }
    
    //getter and setter methods
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Job getJob(){
        return job;
    }
    
    public void setJob(Job job){
        this.job = job;
    }
    
    public double getMoney(){
        return money;
    }
    //adds to the elf's total money
    public void addMoney(double money){
        this.money += money;
    }
    //toString method, returns the elf's name and their job
    public String toString(){
        return name + " the elf makes $" + job.getPay() + " per gift working as a " + job.getJobTitle() + ".\n" + name + " has made $" + money + " so far.";
    }
}