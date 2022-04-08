package Test;

import lombok.Data;

/**
 * ClassName:EnumTest
 * Package:Test
 * Description:
 *
 * @Data:2022/3/23 10:03
 * @Author:liujj@qq.com
 */
public class EnumTest {
    public static void main(String[] args) {
        Test test = new Test("test");
        Test.InTest inTest = test.new InTest("inTest");
        Test.Color color = Test.Color.BLACK;
        inTest.write();
        color.write();
        test.write(inTest);
    }
}


