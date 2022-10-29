/*
 * @ Author: Felix
 * @ Date: 2022/10/29 11:22
 * @ Description:
 */


import com.trifond.pattern.Singleton;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class SingletonTest {

    @Test
    public void TestSingletonAddress() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        Assertions.assertSame(singleton1, singleton2);
    }


}
