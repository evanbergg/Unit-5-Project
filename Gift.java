public class Gift {
    //private instance variables
    private String giftType;
    private boolean isWrapped;
    private boolean isInBag;
    public static int numGifts;
    
    //constructor
    public Gift() {
        boolean isWrapped = false;
        boolean isInBag = false;
    }
    
    //methods, the elf parameter in certain methods is so it can pay the elf after each toy.
    //creates the toy
    public void makeToy(String giftType, Elf elf){
        this.giftType = giftType;
        //I know this method is weird, but it works
        elf.addMoney(elf.getJob().getPay());
    }
    
    public void wrapGift(Elf elf){
        isWrapped = true;
        elf.addMoney(elf.getJob().getPay());
    }
    
    public boolean isWrapped(){
        if(isWrapped){
            return true;
        }
        return false;
    }
    
    //puts gift in bag
    public void putInBag(Elf elf){
        isInBag = true;
        //adds numGifts here, as the gift only counts if it is in Santa's bag.
        numGifts++;
        elf.addMoney(elf.getJob().getPay());
    }
    
    //This method pays the manager to check if gift is in the bag and wrapped.
    public boolean managerCheck(Elf elf){
        elf.addMoney(elf.getJob().getPay());
        
        if(isInBag && isWrapped){
            return true;
        }
        return false;
    }
    
}