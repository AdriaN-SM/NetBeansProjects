
package Comun;

/**
 *
 */
public class VariableGlobal {
    
    public static Integer MAX_LOOP = 10;
    
    
    private class SetVariableGlobal {
        
        public void setVariableGlobalMAX_LOOP(Integer max){
            VariableGlobal.MAX_LOOP = max;
        }
    }
    
    private class GetVariableGlobal {
        
        public Integer getVariableGlobalMAX_LOOP(){
            return VariableGlobal.MAX_LOOP;
        }
    }
}
