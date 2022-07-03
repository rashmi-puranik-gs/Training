import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {
        ArrayList<String> pets = new ArrayList<>();

        pets.add("cat");
        pets.add("dog");
        pets.add("cat");
        pets.add("pig");

        System.out.println(pets);

        Set<String> hashSet = new LinkedHashSet(pets);
        ArrayList<String> removedDuplicates = new ArrayList(hashSet);

        System.out.println(removedDuplicates);
    }
}