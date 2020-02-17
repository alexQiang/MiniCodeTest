import org.junit.Test;

/**
 * @author: GuiQiang
 * @date: 2020-2-17
 **/
public class CodeTestTest {

    @Test
    public void test(){

        CodeTest codeTest = new CodeTest();
        System.out.println(codeTest.getResult(new String[]{"2","3"}));
    }
}
