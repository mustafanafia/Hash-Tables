import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static int num_occurances(List<String> magazine, List<String> note){

        HashSet<String> set = new HashSet<String>(note);
        String[] array = set.toArray(new String[0]);
        int count = 0;

        for(int i =0; i< array.length; i++){

            if(magazine.contains(array[i])){
                count++;

            }
        }
        return count++;

    }


    public static void checkMagazine(List<String> magazine, List<String> note) {


        if(Result.num_occurances(magazine, note) < note.size()){
            System.out.println("No");
        }

        else{
            System.out.println("Yes");
        }


    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "));

        List<String> note = Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "));

        Result.num_occurances(magazine,note);
        Result.checkMagazine(magazine, note);


        bufferedReader.close();
    }
}
