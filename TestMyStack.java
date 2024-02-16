import java.util.*;


public class TestMyStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<Integer>();
        int choice = 0;

        while (choice != 7){

            System.out.println("\n--------MAIN MENU-------\n" +
                    "1 – Push element\n" +
                    "2 – Pop element\n" +
                    "3 – Get top element\n" +
                    "4 – Get stack size\n" +
                    "5 – Is empty stack?\n" +
                    "6 - Print stack\n" +
                    "7 - Exit program\n" +
                    "Enter option number:");
            choice = sc.nextInt();

            switch (choice){
                case 1: //calls push(e)
                    System.out.println("\nWhat number would you like to push to the Stack?");
                    int pushNum = sc.nextInt();
                    System.out.println("\nThis is your stack prior to the push: ");
                    stk.printStack();
                    stk.push(pushNum);
                    System.out.println("\nThis is your updated stack: ");
                    stk.printStack();
                    System.out.println(" ");
                    break;
                case 2: //calls pop()
                    if (!stk.isEmpty()){
                        System.out.println("\nThis is your stack prior to the pop: ");
                        stk.printStack();
                        System.out.println("\n\nThe following was popped off the stack: ");
                        stk.top();
                        stk.pop();
                        System.out.println("\nThe following is now the new top: ");
                        stk.top();
                        System.out.println("\nThis is your updated stack: ");
                        stk.printStack();
                        System.out.println(" ");
                    } else {
                        System.out.println("\nStack is empty");
                    }
                    break;
                case 3: //calls top()
                    System.out.println("\nThis is your updated stack: ");
                    stk.printStack();
                    System.out.println("\n\nThe following is the top of your stack: "); stk.top();
                    break;
                case 4: //calls size()
                    System.out.println("This is your updated stack: ");
                    stk.printStack();
                    System.out.println("Your stack is " + stk.size() + " elements tall.");
                    break;
                case 5: //calls isEmpty()
                    if (!stk.isEmpty()){
                        System.out.println("Your stack is empty :(");
                    } else {
                        System.out.println("This is your updated stack: ");
                        stk.printStack();
                        System.out.println("Your stack is not empty :)");
                    }
                    break;
                case 6: //calls printStack()
                    System.out.println("This is now your stack: ");
                    stk.printStack();
                    break;
                case 7: //Exits the program
                    System.out.println("Goodbye!");
                    break;
            }

        }



    }

}
