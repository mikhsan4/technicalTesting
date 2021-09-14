import java.util.Scanner;
import java.util.ArrayList;

public class App {

    static String balance(String s) {
        String result = "NO";
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                arrayList.add(Character.toString(s.charAt(i)));
            }

            else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (arrayList.size() != 0 && arrayList.get(arrayList.size() - 1).equals("(") && s.charAt(i) == ')') {
                    arrayList.remove(arrayList.size() - 1);
                } else if (arrayList.size() != 0 && arrayList.get(arrayList.size() - 1).equals("{") && s.charAt(i) == '}') {
                    arrayList.remove(arrayList.size() - 1);
                } else if (arrayList.size() != 0 && arrayList.get(arrayList.size() - 1).equals("[") && s.charAt(i) == ']') {
                    arrayList.remove(arrayList.size() - 1);
                } else {
                    return result = "NO";
                }
            }

        }
        if (arrayList.isEmpty() == true) {
            return result = "YES";
        }
        
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert '(', '{' or '['");
        String s = input.nextLine();
        String yesno = balance(s);
        System.out.println(yesno);
    }
}
