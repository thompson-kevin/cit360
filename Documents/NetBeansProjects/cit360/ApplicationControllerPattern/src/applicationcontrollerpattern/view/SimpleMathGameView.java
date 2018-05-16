
package applicationcontrollerpattern.view;

import applicationcontrollerpattern.controller.SimpleMathGameController;
import java.util.Scanner;

/**
 *
 * @author Kevin's Account
 */
public class SimpleMathGameView {
    Scanner reader = new Scanner(System.in);
    String answerString = "{0} + {1} = {2}";
    int firstNumber;
    int secondNumber;

    public void start() {
        showIntro();
        addNumbers();
        end();
    }
    
    private void end() {
        reader.close();
    }
    
    private void showIntro() {
        System.out.println("Welcome to the simple Math Game!\n\n");
    }
    
    private void addNumbers() {
        System.out.println("Please input the first number to add:");
        firstNumber = reader.nextInt();
        System.out.println("Please input the second number to add:");
        secondNumber = reader.nextInt();
        
        System.out.println(answerString.replace("{0}", Integer.toString(firstNumber))
        .replace("{1}", Integer.toString(secondNumber))
        .replace("{2}", Integer.toString(new SimpleMathGameController().handleRequest("add", new int[] {firstNumber, secondNumber}))));
    }
}
