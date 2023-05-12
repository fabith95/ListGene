import java.util.*;

//Given a List of Person, please determine how many male and females Person are in the list.
public class ListGene {
    public static void main(String[] args) {
        List<People> listGene = new ArrayList<>();

        listGene.add(new People("Javier", "male"));
        listGene.add(new People("Juliana", "female"));
        listGene.add(new People("Jhoan", "male"));
        listGene.add(new People("Rosa", "female"));
        listGene.add(new People("Michael", "male"));
        listGene.add(new People("Raul", "male"));
        listGene.add(new People("Maria", "female"));

        int male = 0;
        int female = 0;
        String gender = "male";

        for (int i = 0; i < listGene.size(); i++) {

            if (listGene.get(i).getGenero() == (gender)) {
                male += 1;
            } else {
                female += 1;
            }
        }
        System.out.println("male are: " + male);
        System.out.println("female are: " + female);
    }
}
