package tms.lesson36.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tms.lesson36.config.Config;
import tms.lesson36.entity.User;

import java.util.List;

@Service
public class RegAuth {
    @Autowired
    private List<User>userList;

}
