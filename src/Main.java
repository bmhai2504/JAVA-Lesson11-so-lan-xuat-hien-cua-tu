import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class Main {
    static TreeMap<String, Integer> treeMap = new TreeMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++){
            if(!treeMap.containsKey(String.valueOf(string.charAt(i)))){
                String tempString = String.valueOf(string.charAt(i));
                int count = 0;
                for (int j = 0; j < string.length(); j++){
                    if(tempString.equals(String.valueOf(string.charAt(j)))){
                        count++;
                    }
                }
                treeMap.put(tempString, count);
            }
        }
        System.out.println(treeMap);
    }

    public static boolean isExist(String string,int index){
        return treeMap.containsKey(String.valueOf(string.charAt(index)));
    }
}