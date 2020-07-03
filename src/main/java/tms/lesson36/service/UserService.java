package tms.lesson36.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tms.lesson36.entity.User;
import tms.lesson36.util.Reader;
import tms.lesson36.util.Writer;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private List<User> userList;
    @Autowired
    Writer writ;
    @Autowired
    Reader read;
    @Autowired
    RunService runService;


    public void returnMenu() {
        menuStart();
    }

    public void exit() {
    }

    public void reg(String name, String login, String password) {
        User user = new User(name, login, password);
        userList.add(user);
        writ.write("User added");
        returnMenu();
    }


    public void auth(String login, String password) {
        for (User user : userList) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                runService.menu();
            } else {

                returnMenu();
            }
        }
    }


    public void menuStart() {
        writ.write("Choice operation: 1 - Registration; 2 - Authorization; 3 - exit:          ");
        String choice1 = read.readString();
        if (choice1 == null) {
            returnMenu();
        } else {
            switch (choice1) {
                case ("1"):
                    reg(writ.write("Entered name") + read.readString(),  writ.write("Entered login") + read.readString(), writ.write("Entered password") + read.readString());
                    break;
                case ("2"):
                    auth(writ.write("Entered login") +read.readString(),writ.write("Entered password") + read.readString());
                    break;
                case ("3"):
                    exit();
                    break;
                default:
                    writ.write("Bro, this is bullshit" + choice1);
                    returnMenu();
            }
        }
    }
}

