package labtwo;


public class LabTWO {

    public static void main(String[] args) {

        Celebrities celebrities = new Celebrities();
        
        Celebrity firstCelebrity = new Celebrity("Gingerbread", 500, "In Room", 15);
        Celebrity secondCelebrity = new Celebrity("Trampoline", 400, "Street", 13);
        Celebrity thirdCelebrity = new Celebrity("Bubbles", 250, "Street", 10);
        Celebrity fourthCelebrity = new Celebrity("Animators", 700, "In Room", 12);
        
        
        celebrities.addCelebrity(firstCelebrity);
        celebrities.addCelebrity(secondCelebrity);
        celebrities.addCelebrity(thirdCelebrity);
        celebrities.addCelebrity(fourthCelebrity);

        System.out.println("Ціна: "+celebrities.getTotalPrice()+"₴");
        System.out.print("Результати пошуку: ");
        celebrities.showArray(celebrities.searchPlace("Street"));
        System.out.println("\nПо віку для найстарших: " + celebrities.getGreaterAge());
        

    }
    
}
