package GitHub_Work.TimeConversion;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.print("this program will convert minutes to days, hours, and the remaining minutes. \n");
        Scanner in = new Scanner(System.in);
        System.out.print("number of minutes: ");
        int min = in.nextInt();
        int p1 = (min/(24*60));
        int p2 = (min%(24*60)) / 60;
        int p3 = (min%(24*60)) % 60;
        in.close();
        
        System.out.print( p1 + " days and " + p2 + " hours " + p3 + "minutes");
    }
    
}
