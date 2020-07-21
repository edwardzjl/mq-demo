package org.zjl.mq.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

/**
 * @author Junlin Zhou
 */
@Component
public class MessageListener {

    @Bean
    public Consumer<String> listen() {
        return msg -> System.out.println("message received! content: " + msg);
    }

}
