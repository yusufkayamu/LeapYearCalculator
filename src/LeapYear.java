import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input= new Scanner(System.in);

        System.out.print("Give a year =");
        year = input.nextInt();

        if(year %400 ==0 || year %4 ==0 && year %100 !=0){
            System.out.println("This year is a leap year");
        }else {
            System.out.println("Unfortunately is not a leap year");
        }
    }
}
