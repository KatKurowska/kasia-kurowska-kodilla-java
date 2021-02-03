import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest() {
        //Given
        String log = "0dffb_1";
        String log2 = "0dffb_2";
        String log3 = "0dffb_3";
        //When
        Logger.getInstance().log(log);
        Logger.getInstance().log(log2);
        Logger.getInstance().log(log3);
        //Then
        Assert.assertEquals(log3, Logger.getInstance().getLastLog());
    }
}



