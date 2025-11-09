import java.util.Random;
import java.util.Scanner;

public class game {
    public static char user() {
        Scanner scanner = new Scanner(System.in);
        String users = scanner.nextLine();
        char u = users.charAt(0);

        scanner.close();

        return u;
    }

    public static char computerC() {
        Random rand = new Random();

        int a = rand.nextInt(3);
        char computer;

        if (a == 0) {
            computer = 'r';
        } else if (a == 1) {
            computer = 'p';
        } else {
            computer = 'c';
        }

        return computer;
    }

   
    public static void main(String[] args) {
        System.out.println("rock - r; paper - p; caesar - c;");
        
        
        char com = computerC();
        
        
        System.out.print("user = ");
        char you = user();
        
        if(you == com){
            System.out.println("Game draw");
        }else if(you == 'r' && com == 'c'){
            System.out.println("You win");
        }else if(you == 'p' && com == 'r'){
            System.out.println("You win");
        }else if(you == 'c' && com == 'p'){
            System.out.println("You win");
        }else{
            System.out.println("Computer win");
        }
        System.out.println("computer = " + com);
    }
}
