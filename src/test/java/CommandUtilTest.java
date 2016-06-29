import com.qbit.Command.CommandUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: chuck
 */
public class CommandUtilTest {

    @Test
    public void testProcess() throws Exception {
        String inputCommand = "cmd.exe /c echo Hello";
        String output = "Hello";

        assertEquals(output, CommandUtil.Process(inputCommand));
    }
}