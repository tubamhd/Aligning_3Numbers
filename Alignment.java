import java.util.Scanner;

public class Alignment {
    public static void main(String[] args) {
        int no1, no2, no3;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number:  ");
        no1 = input.nextInt();
        System.out.print("Enter 2nd number:  ");
        no2 = input.nextInt();
        System.out.print("Enter 3rd number:  ");
        no3 = input.nextInt();


        if ((no1 < no2) && (no1 < no3)) {
            if ((no2 < no3)) {
                System.out.println(no1 + "<" + no2 + "<" + no3);
            }else{
                System.out.println(no1 + "<" + no3 + "<" + no2);
            }
        }else if((no2 < no1) && (no2 < no3)){
            if(no1 < no3){
                System.out.println(no2 + "<" + no1 + "<" + no3);
            }else{
                System.out.println(no2 + "<" + no3 + "<" + no1);
            }
        }else if((no3 < no2) && (no3 < no1)){
            if(no1 < no2){
                System.out.println(no3 + "<" + no1 + "<" + no2);
            }else{
                System.out.println(no3 + "<" + no2 + "<" + no1);
            }
        }
    }
}

