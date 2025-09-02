
class Student {
    int roll_no;
    String name;
    int grade;

    public Student(int roll_no,
            String name,
            int grade) {
        this.name = name;
        this.roll_no = roll_no;
        this.grade = grade;

        System.out.println("Name : " + name);
        System.out.println("Roll no : " + roll_no);
        System.out.println("Grade : " + grade);
    }

}

class Document{
    String doc;
    public Document(String doc){
        this.doc = doc;
    }
    
   public Document(Document OldDoc){
    this.doc = OldDoc.doc;
   }

}

class Bank {
    String name;
    int acc_no;
    double open_bal;
    double close_bal;

    public Bank(String name, int acc_no, double open_bal) {
        this.acc_no = acc_no;
        this.name = name;
        this.open_bal = open_bal;
        this.close_bal = open_bal;
    }

    public void deposite(double amt) {
        if (amt > 0) {
            close_bal = close_bal + amt;
            System.out.println("Amount deposited :" + amt);
            System.out.println("Closing balance is : " + close_bal);
        } else {
            System.out.println("Amoun t should be greater than 0 ");
        }

    }

    public void withdraw(double amt) {
        if (close_bal > 0 && amt <= close_bal) {
            System.out.println("Amount Withdrawed :" + amt);
            close_bal = close_bal - amt;
            System.out.println("Closing balance is : " + close_bal);
        } else {
            System.out.println("Insufficeient Balance");
        }
    }

    public void checkbal() {
        System.out.println("Available Balance :" + close_bal);
    }
}

public class Cons {

    public static void main(String[] args) {
        Document d = new Document("Heyy this is Sid");
        Document update = new Document(d);
        update.doc = "Sid was here";

        System.out.println(d.doc);
        System.out.println(update.doc);
    }
}
