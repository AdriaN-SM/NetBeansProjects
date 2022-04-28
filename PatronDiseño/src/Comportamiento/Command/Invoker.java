
package Comportamiento.Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    
    private List <Command> invokeList = new ArrayList();
    
    public void addCommand(Command command){
        invokeList.add(command);
    }
    
    public void removeCommand(Command command){
        invokeList.remove(command);
    }
    
    public void execute(){
        for(Command command : invokeList){
            command.execute();
        }
    }
}
