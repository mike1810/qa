package listeners;
import org.testng.*;

public class CustomListenerForSuite implements ISuiteListener {
    public void onStart(ISuite iSuite){
        System.out.println( "Suite start\n" );
    }

    public void onFinish(ISuite iSuite){
        System.out.println( "Suite finish\n" );
    }
}
