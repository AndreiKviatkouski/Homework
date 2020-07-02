package tms.lesson36.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tms.lesson36.entity.Operation;
import tms.lesson36.entity.User;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class Config {

    @Bean
    public List<Operation> operationList() {
        return new ArrayList<>();
    }
    @Bean
    public List<User> userListList() {
        return new ArrayList<>();
    }

}
