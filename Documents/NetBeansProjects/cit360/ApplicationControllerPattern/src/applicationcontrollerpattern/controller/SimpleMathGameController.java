
package applicationcontrollerpattern.controller;

import java.util.HashMap;

/**
 *
 * @author Kevin's Account
 */
public class SimpleMathGameController {
    private HashMap<String, SimpleMathHandler> handlerMap = new HashMap();
    
    public SimpleMathGameController() {
        mapCommand("add", new SimpleMathHandler());
    }
    
    public int handleRequest(String command, int[] data) {
        SimpleMathHandler commandHandler = handlerMap.get(command);
        if (commandHandler != null) {
            return commandHandler.handleIt(data);
        } else {
            return -1;
        }
    }
    
    public void mapCommand(String command, SimpleMathHandler commandHandler) {
        handlerMap.put(command, commandHandler);
    }
}
