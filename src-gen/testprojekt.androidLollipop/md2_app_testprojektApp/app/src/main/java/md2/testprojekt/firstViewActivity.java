// generated in de.wwu.md2.framework.generator.android.lollipop.controller.Activity.generateActivity()
package md2.testprojekt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import md2.testprojekt.md2.controller.Controller;
import de.uni_muenster.wi.md2library.view.management.implementation.Md2ViewManager;
import de.uni_muenster.wi.md2library.view.management.implementation.Md2WidgetRegistry;
import de.uni_muenster.wi.md2library.controller.action.implementation.customCode.Md2TaskQueue;
import de.uni_muenster.wi.md2library.view.widgets.implementation.Md2GridLayoutPane;
import de.uni_muenster.wi.md2library.view.widgets.implementation.Md2FlowLayoutPane;
import de.uni_muenster.wi.md2library.view.widgets.implementation.Md2Label;
import de.uni_muenster.wi.md2library.view.widgets.implementation.Md2Button;
import de.uni_muenster.wi.md2library.view.widgets.implementation.Md2TextInput;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Boolean;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Date;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2DateTime;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Float;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Integer;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2String;
import de.uni_muenster.wi.md2library.model.type.implementation.Md2Time;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2ContentProviderEventTypes;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnAttributeChangedHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnChangedHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnClickHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnLeftSwipeHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2OnRightSwipeHandler;
import de.uni_muenster.wi.md2library.controller.eventhandler.implementation.Md2WidgetEventType;
		
public class firstViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstview);
    }

    @Override
    protected void onStart(){
		super.onStart();
        Md2ViewManager.getInstance().setActiveView(this);
        
        
        Md2TaskQueue.getInstance().tryExecutePendingTasks();
    }
    
	@Override
    protected void onPause(){
        super.onPause();
    }
    
    @Override
	public void onBackPressed() {
		// go back to start screen
		Md2ViewManager.getInstance().goTo(getString(R.string.StartActivity));
	}
}
