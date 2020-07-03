package tms.lesson36;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tms.lesson36.service.RunService;
import tms.lesson36.service.UserService;
import tms.lesson36.util.Writer;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {
    @Autowired
    Writer writer;
    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.menuStart();
    }
}

