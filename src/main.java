import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


/**
 * Created by RICK on 8/6/2017.
 */
public class main {

    private static Pattern p;
    private static Matcher m;

    private static final String IPADDRESS_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main (String args[]){

        String fileName = "test.txt";

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(main::validate);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("--- end ---");
    }


    public static void validate(final String ip){
        p = Pattern.compile(IPADDRESS_PATTERN);
        m = p.matcher(ip);
        if(m.matches())
        System.out.println(ip);
    }





}
