import java.io.File;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        for (String jmeno:new File("Z:/").list()){
            Jmeno s = new Jmeno(jmeno);
            arr.add(s);
        }
        Collections.sort(arr);
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}