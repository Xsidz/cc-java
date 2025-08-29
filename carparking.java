import java.util.Scanner;
public class carparking{
    static int slots = 10;
public static void carenter(){
    slots --;
    System.out.println("Car Parked");
}
public static void carexit(){
    slots++;
    System.out.println("Car is Out ");
}
public static void occupied(){
    System.out.println("No slots available, please wait!!");
}
public static void main(String[] args) {
    int choice;
    Scanner sc = new Scanner(System.in);
   
    do{
        System.out.println(" 1. Add car \n 2. Car exit \n 3. Available slots \n 4. Exit System");
         System.out.print("Please enter the choice : ");
         choice = sc.nextInt();

         if(choice == 1){
            if(slots != 0){
                carenter();
                System.out.println();
            }
         }else if(choice == 2){
            if(slots <10){
                carexit();
            }else{
                System.out.println("Parking is empty");
            }
              System.out.println();
         }else if(choice == 3){
            System.out.println("Total slots available are : " + slots);
         }
    }while(choice != 4);
}
}