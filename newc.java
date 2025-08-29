import java.util.Scanner;

public class newc {

    public static void zeroToEnd(int nums[]){
         int nonZero = 0;

        for(int i =0 ; i< nums.length;i++){
            if(nums[i]!= 0){
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }

        while(nonZero < nums.length){
            nums[nonZero] = 0;
            nonZero++;
        }
    }
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);

        String str5 = "Programming in Java";
        System.out.println(str5.length());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you email :");
        String email = sc.nextLine();
        StringBuilder finalStr = new StringBuilder(email.toLowerCase());

        for (int i = 0; i < finalStr.length(); i++) {
           if(finalStr.charAt(i) == 'a' || finalStr.charAt(i) == 'e' || finalStr.charAt(i) == 'i' || finalStr.charAt(i) == 'o' || finalStr.charAt(i) == 'u'){
            finalStr.setCharAt(i, '#');
           }
        }
        sc.close();
        System.out.println(finalStr);

        int size;
        System.err.println("Give size :");
        size = sc.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter your number at: " + i);
        }
    }
}
