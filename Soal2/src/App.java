import java.util.Scanner;

public class App {

    public static void stringReverse(char[] ch, int pos) {
        if(pos >= ch.length)
            return;
            
        stringReverse(ch, pos+1);
        System.out.print(ch[pos]);

    }

    public static void main(String[] args) {
        //declare scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Input chars");

        try{

            String s = input.nextLine();
            int pos = 0;
            char[] ch = new char[s.length()];

            for(int i=0; i<s.length();i++){
                ch[i] = s.charAt(i);
            }

            stringReverse(ch, pos);

        } catch (Exception e){
            System.out.println("Error.");
        } finally{
            input.close();
        }

    }
}
