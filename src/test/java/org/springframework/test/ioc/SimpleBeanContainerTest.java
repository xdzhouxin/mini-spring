package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author derekyi
 * @date 2020/11/24
 */
public class SimpleBeanContainerTest {

    @org.junit.Test
    public void test() {
        BeanFactory beanFactory = new BeanFactory();

        beanFactory.registerBean("test", new Test());
        Test test = (Test) beanFactory.getBean("test");
        test.test();
    }

    class Test {
        void test() {
            System.out.println("test");
        }
    }
}
