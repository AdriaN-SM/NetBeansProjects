/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacion.Prototype;

import java.util.HashMap;

/**
 *
 * @author ChimoB
 */
public class Client {

    private static HashMap<String, Prototype> prototypeMap = new HashMap<String, Prototype>();

    public static Prototype getPrototype(String type) {   
        Prototype cachedPrototype = prototypeMap.get(type);
        return (Prototype) cachedPrototype.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes
    public static void loadCache() {
        SpecificPrototype1 t1 = new SpecificPrototype1();
        prototypeMap.put(t1.type, t1);

        SpecificPrototype2 t2 = new SpecificPrototype2();
        prototypeMap.put(t2.type, t2);
        
      

    }

}
