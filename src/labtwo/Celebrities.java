package labtwo;


import java.util.ArrayList;

public class Celebrities  {

    private ArrayList<Celebrity> celebrities = new ArrayList<>();

    void addCelebrity(Celebrity obj){
        celebrities.add(obj);
    }

    double getTotalPrice(){
        double totalPrice = 0;
        for(int i = 0;i < celebrities.size(); i++) {
            totalPrice += celebrities.get(i).getPrice();
        }
        return totalPrice;
    }

    ArrayList searchPlace(String celebrityPlace){
        ArrayList<String> temp = new ArrayList<>();

        for(int i = 0;i < celebrities.size(); i++) {
            String thisColor = celebrities.get(i).getPlace();
            if (thisColor.compareTo(celebrityPlace) == 0){
                temp.add(celebrities.get(i).getName());
            }
        }
        return temp;
    }


    String getGreaterAge() {
        int max = 0;
        int temp = 0;

        for (int i = 0; i < celebrities.size(); i++)
            if (max < celebrities.get(i).getAge()) {
                max = celebrities.get(i).getAge();
                temp = i;
            }

        return celebrities.get(temp).getName();
    }

    void showArray(ArrayList array){

        String[] myArray = {};
        myArray = (String[]) array.toArray(new String[array.size()]);
        for(int i = 0; i < array.size(); i++){
            System.out.print(myArray[i] + " ");
        }
    }
}
