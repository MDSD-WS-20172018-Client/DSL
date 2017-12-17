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
		
public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Md2GridLayoutPane register___ContainerUserName = (Md2GridLayoutPane) findViewById(R.id.Register___ContainerUserName);
        register___ContainerUserName.setWidgetId(R.id.Register___ContainerUserName);
        Md2WidgetRegistry.getInstance().addWidget(register___ContainerUserName);
        Md2TextInput register___ContainerUserName_UserName = (Md2TextInput) findViewById(R.id.Register___ContainerUserName_UserName);
        register___ContainerUserName_UserName.setWidgetId(R.id.Register___ContainerUserName_UserName);
        Md2WidgetRegistry.getInstance().addWidget(register___ContainerUserName_UserName);
        Md2GridLayoutPane register___ContainerEmail = (Md2GridLayoutPane) findViewById(R.id.Register___ContainerEmail);
        register___ContainerEmail.setWidgetId(R.id.Register___ContainerEmail);
        Md2WidgetRegistry.getInstance().addWidget(register___ContainerEmail);
        Md2TextInput register___ContainerEmail_Email = (Md2TextInput) findViewById(R.id.Register___ContainerEmail_Email);
        register___ContainerEmail_Email.setWidgetId(R.id.Register___ContainerEmail_Email);
        Md2WidgetRegistry.getInstance().addWidget(register___ContainerEmail_Email);
        Md2GridLayoutPane register___ContainerPasswort = (Md2GridLayoutPane) findViewById(R.id.Register___ContainerPasswort);
        register___ContainerPasswort.setWidgetId(R.id.Register___ContainerPasswort);
        Md2WidgetRegistry.getInstance().addWidget(register___ContainerPasswort);
        Md2TextInput register___ContainerPasswort_Passwort = (Md2TextInput) findViewById(R.id.Register___ContainerPasswort_Passwort);
        register___ContainerPasswort_Passwort.setWidgetId(R.id.Register___ContainerPasswort_Passwort);
        Md2WidgetRegistry.getInstance().addWidget(register___ContainerPasswort_Passwort);
        Md2Button register_bregistierung = (Md2Button) findViewById(R.id.Register_bregistierung);
        register_bregistierung.setWidgetId(R.id.Register_bregistierung);
        Md2WidgetRegistry.getInstance().addWidget(register_bregistierung);
    }

    @Override
    protected void onStart(){
		super.onStart();
        Md2ViewManager.getInstance().setActiveView(this);
        
        Md2GridLayoutPane register___ContainerUserName = (Md2GridLayoutPane) findViewById(R.id.Register___ContainerUserName);
        Md2WidgetRegistry.getInstance().loadWidget(register___ContainerUserName);
        Md2TextInput register___ContainerUserName_UserName = (Md2TextInput) findViewById(R.id.Register___ContainerUserName_UserName);
        Md2WidgetRegistry.getInstance().loadWidget(register___ContainerUserName_UserName);
        Md2GridLayoutPane register___ContainerEmail = (Md2GridLayoutPane) findViewById(R.id.Register___ContainerEmail);
        Md2WidgetRegistry.getInstance().loadWidget(register___ContainerEmail);
        Md2TextInput register___ContainerEmail_Email = (Md2TextInput) findViewById(R.id.Register___ContainerEmail_Email);
        Md2WidgetRegistry.getInstance().loadWidget(register___ContainerEmail_Email);
        Md2GridLayoutPane register___ContainerPasswort = (Md2GridLayoutPane) findViewById(R.id.Register___ContainerPasswort);
        Md2WidgetRegistry.getInstance().loadWidget(register___ContainerPasswort);
        Md2TextInput register___ContainerPasswort_Passwort = (Md2TextInput) findViewById(R.id.Register___ContainerPasswort_Passwort);
        Md2WidgetRegistry.getInstance().loadWidget(register___ContainerPasswort_Passwort);
        Md2Button register_bregistierung = (Md2Button) findViewById(R.id.Register_bregistierung);
        Md2WidgetRegistry.getInstance().loadWidget(register_bregistierung);
        
        Md2TaskQueue.getInstance().tryExecutePendingTasks();
    }
    
	@Override
    protected void onPause(){
        super.onPause();
        Md2GridLayoutPane register___ContainerUserName = (Md2GridLayoutPane) findViewById(R.id.Register___ContainerUserName);
        Md2WidgetRegistry.getInstance().saveWidget(register___ContainerUserName);
        Md2TextInput register___ContainerUserName_UserName = (Md2TextInput) findViewById(R.id.Register___ContainerUserName_UserName);
        Md2WidgetRegistry.getInstance().saveWidget(register___ContainerUserName_UserName);
        Md2GridLayoutPane register___ContainerEmail = (Md2GridLayoutPane) findViewById(R.id.Register___ContainerEmail);
        Md2WidgetRegistry.getInstance().saveWidget(register___ContainerEmail);
        Md2TextInput register___ContainerEmail_Email = (Md2TextInput) findViewById(R.id.Register___ContainerEmail_Email);
        Md2WidgetRegistry.getInstance().saveWidget(register___ContainerEmail_Email);
        Md2GridLayoutPane register___ContainerPasswort = (Md2GridLayoutPane) findViewById(R.id.Register___ContainerPasswort);
        Md2WidgetRegistry.getInstance().saveWidget(register___ContainerPasswort);
        Md2TextInput register___ContainerPasswort_Passwort = (Md2TextInput) findViewById(R.id.Register___ContainerPasswort_Passwort);
        Md2WidgetRegistry.getInstance().saveWidget(register___ContainerPasswort_Passwort);
        Md2Button register_bregistierung = (Md2Button) findViewById(R.id.Register_bregistierung);
        Md2WidgetRegistry.getInstance().saveWidget(register_bregistierung);
    }
    
    @Override
	public void onBackPressed() {
		// go back to start screen
		Md2ViewManager.getInstance().goTo(getString(R.string.StartActivity));
	}
}
