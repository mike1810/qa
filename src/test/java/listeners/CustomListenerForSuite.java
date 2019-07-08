package listeners;
import org.testng.*;

public class CustomListenerForSuite {
    public void onStart(ISuite iSuite){
        System.out.println( "On Start actions\n" );
    }

    public void onFinish(ISuite iSuite){
        System.out.println( "On Finish actions\n" );
    }
}
