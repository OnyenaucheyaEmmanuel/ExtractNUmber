import java.util.ArrayList;
import java.util.List;

public class ExtractNumber {
// extract and count the number from a list of alpahnumeric digits 
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("7123abc");
        list.add("987poi");
        System.out.println(getNumber(list));

    }
    private static  int getNumber(List<String>list){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if(Character.isDigit(list.get(i).charAt(j))) count ++;
            }
        }
        return count;
    }
}
