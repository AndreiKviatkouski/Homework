package tms.lesson36.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Service
public class Reader {
    @Autowired
    Writer write;


    public String readString() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.isEmpty()) {
            write.write("Empty string,try again!");
            return null;
        }
        return line;
    }


    public double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(readString());
            } catch (NullPointerException | NumberFormatException e) {
                write.write("Incorrect value! Try again!");
            }
        }
    }
}

