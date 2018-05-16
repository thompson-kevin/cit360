
package applicationcontrollerpattern;

import applicationcontrollerpattern.view.SimpleMathGameView;


/**
 *
 * @author Kevin's Account
 */
public class ApplicationControllerPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleMathGameView smgv = new SimpleMathGameView();
        smgv.start();
    }

}
