package hello.core.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulservice1 = ac.getBean(StatefulService.class);
        StatefulService statefulservice2 = ac.getBean(StatefulService.class);

        //ThreadA: A사용자 10000원 주문
        statefulservice1.order("userA", 10000);
        //ThreadB: B사용자 20000원 주문
        statefulservice2.order("userB", 20000);

        int price = statefulservice1.getPrice();
        System.out.println("price = " + price);
    }

    static class TestConfig{

        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }

}