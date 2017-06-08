import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by RICK on 9/6/2017.
 */
public class second {

    public static void main (String args[]){

        String fileName = "list.txt";
        List<innerClass> innerClassList = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(k -> innerClassList.add(splitStringtoObject(k)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        innerClassList.remove(0); //remove title
        innerClassList.sort(Comparator.comparing(a -> a.Name));
        innerClassList.sort((a,b)->b.GPA.compareTo(a.GPA));
        innerClassList.forEach(k -> System.out.println(k.Name));

        System.out.println("--- end ---");
    }

    private static innerClass splitStringtoObject(String string){
        innerClass ic = new innerClass();
        String[] splited = string.split("\\s+");
        ic.ID = splited[0];
        ic.Name = splited[1];
        ic.GPA = splited[2];
        return ic;
    }

}



class innerClass{
    String ID;
    String Name;
    String GPA;
}
