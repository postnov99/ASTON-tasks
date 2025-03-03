package tasks;

public class LeapYearDeterminer {
    public static void Year ( int n){
        System.out.println(n % 4 == 0 && n % 400 == 0 || n % 100 != 0);
    }

}
