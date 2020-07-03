package tms.lesson36.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tms.lesson36.config.Config;
import tms.lesson36.util.Reader;
import tms.lesson36.util.Writer;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

@Service
public class RunService {
    @Autowired
    CalcService calcAction;
    @Autowired
    Reader read;
    @Autowired
    Writer writ;
    @Autowired
    Config config;

    public void playCalc() {
        writ.write("Entered operation: sum, minus, div, multiply :     ");
        String operation = read.readString();
        List<String> stringList = Arrays.asList("sum", "minus", "div", "multiply");
        if (!stringList.contains(operation) || operation == null) {
            writ.write("Incorrect operation,try again!");
            returnCalc();
        } else {
            writ.write("Entered num1: ");
            double num1 = read.readDouble();
            writ.write("Entered num2:  ");
            double num2 = read.readDouble();
            writ.write("Result = " + calcAction.calculator(num1, num2, operation));
            menu();
        }
    }

    public void showHistory() {
        writ.write("History operation: " + config.operationList());
        menu();
    }

    public void exit() {
    }

    public void returnMenu() {
        menu();
    }

    public void returnCalc() {
        playCalc();
    }

    public void menu() {
        writ.write("Choice operation: 1 - Show history; 2 - exit; 3 - Play Calculator:          ");
        String choice = read.readString();
        if (choice == null) {
            returnMenu();
        } else {
            switch (choice) {
                case ("1"):
                    showHistory();
                    break;
                case ("2"):
                    exit();
                    break;
                case ("3"):
                    playCalc();
                    break;
                case ("4"):
                    writ.write("Reg");
                    break;
                case ("5"):
                    writ.write("Auth");
                    break;
                default:
                    writ.write("Bro, this is bullshit" + choice);
                    returnMenu();
            }
        }
    }
}







