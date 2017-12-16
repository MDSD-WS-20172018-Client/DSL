// generated in de.wwu.md2.framework.generator.android.lollipop.model.SQLite.generateDataContract()
package md2.testprojekt.md2.model.sqlite;

import android.provider.BaseColumns;

public class Md2DataContract {

    public Md2DataContract() {
    }

public static abstract class __ReturnStepStackEntry implements BaseColumns {
	public static final String TABLE_NAME = "__returnstepstack";
	public static final String COLUMN_NAME_RETURNSTEP = "returnStep";
	public static final String COLUMN_NAME_RETURNANDREVERSESTEP = "returnAndReverseStep";
	public static final String COLUMN_NAME_RETURNANDPROCEEDSTEP = "returnAndProceedStep";
	public static final String COLUMN_NAME_TAIL = "tail";
}
public static abstract class __ProcessChainControllerStateEntry implements BaseColumns {
	public static final String TABLE_NAME = "__processchaincontrollerstate";
	public static final String COLUMN_NAME_CURRENTPROCESSCHAINSTEP = "currentProcessChainStep";
	public static final String COLUMN_NAME_LASTEVENTFIRED = "lastEventFired";
}
}
