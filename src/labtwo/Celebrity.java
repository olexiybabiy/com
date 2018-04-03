package labtwo;

public class Celebrity {
    private String name;
    private int price;
    private String place;
    private int age;

    Celebrity(String name,int price, String place, int age){

        this.name = name;
        this.price = price;
        this.place = place;
        this.age = age;
    }

    public int getPrice(){
        return this.price;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getPlace(){
        return this.place;
    }


}