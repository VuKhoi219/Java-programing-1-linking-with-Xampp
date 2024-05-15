import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    }
    public void choice(){
        boolean flag = true;
        while(flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your selection");
            System.out.println("1.Insert");
            System.out.println("2.Search");
            System.out.println("3.Delete");
            System.out.println("4.SHow");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }

        }


    }
}