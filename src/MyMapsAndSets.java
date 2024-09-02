import sun.security.timestamp.TSRequest;
import sun.tracing.dtrace.DTraceProviderFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.jar.JarInputStream;


public class MyMapsAndSets {
    public static void main(String[] args) throws FileNotFoundException {
        /*Map<String, Integer> phonebook = new HashMap<>();

        phonebook.put("Peter", 43435566);
        phonebook.put("Hanne", 43439898);
        phonebook.put("Brian", 43487765);
        phonebook.put("Maria", 43998776);
        phonebook.put("Rene", 8985566);

        System.out.println("The map contains: "+phonebook);
        System.out.println();

        System.out.println("Search for Peter_: "+phonebook.get("Peter"));
        System.out.println();

        System.out.println("Contains Ralf: "+ phonebook.containsKey("Ralf"));
        System.out.println("Contains Hanne: "+ phonebook.containsKey("Hanne"));
        System.out.println();

        System.out.println("keyset: "+phonebook.keySet());
        System.out.println("size: "+phonebook.size());*/

        Set<String> countWords = new HashSet<>();
        Scanner scan1 = new Scanner(new File("mobydick.txt"));
        while (scan1.hasNext()){
            String word = scan1.next();
            countWords.add(word.toLowerCase());
        }

        ArrayList<String> book = new ArrayList<>();
        Scanner scan2 = new Scanner(new File("mobydick.txt"));
        while (scan2.hasNext()){
            String word = scan2.next();
            book.add(word.toLowerCase());
        }

        System.out.println("size of ArrayList:"+book.size());
        System.out.println("size of set: "+countWords.size());

        String[] animals = {"Dog", "Bird", "Fish", "Cat", "Dragon"};
        List<String> animalList = new ArrayList<>(Arrays.asList(animals));

        System.out.println("The list contains: "+animalList);

        deleteSom(animalList, 'D');

    }
    public static void deleteSom(List<String> animals, char letter) {
        Iterator<String> iter = animals.iterator();
        while (iter.hasNext()){
            String animal = iter.next();
            if (animal.charAt(0) == letter){
                iter.remove();
            }
        }
        System.out.println("the list without the d words: "+animals);
    }

}
