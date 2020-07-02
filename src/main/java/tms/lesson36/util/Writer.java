package tms.lesson36.util;

import org.springframework.stereotype.Service;

@Service
public class Writer {
    public Object write(Object message) {
        System.out.println(message);
        return message;
    }
}
