// generated in de.wwu.md2.framework.generator.android.lollipop.model.Md2Entity.generateEntity()
package md2.testprojekt.md2.model;

import java.util.HashMap;

import de.uni_muenster.wi.md2library.model.type.implementation.AbstractMd2Entity;
import de.uni_muenster.wi.md2library.model.type.interfaces.Md2Type;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Boolean;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Date;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2DateTime;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Float;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Integer;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2String;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Time;

public class __ProcessChainControllerState extends AbstractMd2Entity {

    public __ProcessChainControllerState() {
        super("__ProcessChainControllerState");
    }

    public __ProcessChainControllerState(HashMap attributes) {
        super("__ProcessChainControllerState", attributes);
    }
    
	@Override
    public void set(String attribute, Md2Type value){
        if(checkAttribute(attribute, value))
            super.set(attribute, value);
    }

    private boolean checkAttribute(String attribute, Md2Type value){
    	if(value == null)
    		return true;
    		
        switch (attribute){
        	case "currentProcessChainStep": return (value instanceof Md2String);
        	case "lastEventFired": return (value instanceof Md2String);
            default: return false;
        }
    }

    @Override
    public Md2Type clone() {
        __ProcessChainControllerState newEntity = new __ProcessChainControllerState(this.getAttributes());
        return newEntity;
    }
}
