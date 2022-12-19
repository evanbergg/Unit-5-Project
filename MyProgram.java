public class MyProgram
{
    public static void main(String[] args)
    {
        //Creating the available Job objects
        Job toyMaker = new Job(7.25, "Toy Maker");
        Job giftWrapper = new Job(3.05, "Gift Wrapper");
        Job sackPacker = new Job(8.03, "Sack Packer");
        Job manager = new Job(65.50, "Manager");
        
        //Creating the Elf objects
        Elf buddy = new Elf("Buddy", manager);
        //Toy Makers
        Elf walter = new Elf("Walter", toyMaker);
        Elf arnold = new Elf("Arnold", toyMaker);
        Elf shaq = new Elf("Shaquille", toyMaker);
        //Gift Wrappers
        Elf susie = new Elf("Susie", giftWrapper);
        Elf janet = new Elf("Janet", giftWrapper);
        Elf bruce = new Elf("Bruce", giftWrapper);
        //Sack Packers
        Elf kevin = new Elf("Kevin", sackPacker);
        Elf patrick = new Elf("Patrick", sackPacker);
        Elf michelle = new Elf("Michelle", sackPacker);
        
        
        //This loop makes gifts until there is 100 gifts
        while(Gift.numGifts < 100){
            //creating gift object
            Gift gift = new Gift();
            
            //assigning workers to each gift
            gift.makeToy("Toy Car", walter);
            gift.wrapGift(susie);
            gift.putInBag(kevin);
            gift.managerCheck(buddy);
            
            gift.makeToy("Doll House", arnold);
            gift.wrapGift(janet);
            gift.putInBag(patrick);
            gift.managerCheck(buddy);
            
            gift.makeToy("Socks", shaq);
            gift.wrapGift(bruce);
            gift.putInBag(michelle);
            gift.managerCheck(buddy);
        }
        //Printing out all the results
        System.out.println("Santa has " + Santa.numWorkers + " elves working to get his gifts ready for Christmas!");
        System.out.println();
        System.out.println("The elves have made and packed " + Gift.numGifts + " gifts so far.");
        System.out.println();
        System.out.println("Here are the elves along with their information:");
        System.out.println();
        System.out.println("Manager:");
        System.out.println(buddy.toString());
        System.out.println();
        System.out.println("Toy Makers:");
        System.out.println(walter.toString());
        System.out.println(arnold.toString());
        System.out.println(shaq.toString());
        System.out.println();
        System.out.println("Gift Wrappers:");
        System.out.println(susie.toString());
        System.out.println(janet.toString());
        System.out.println(bruce.toString());
        System.out.println();
        System.out.println("Sack Packers: ");
        System.out.println(kevin.toString());
        System.out.println(patrick.toString());
        System.out.println(michelle.toString());
    }
}