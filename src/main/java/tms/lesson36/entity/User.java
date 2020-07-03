package tms.lesson36.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class User {
        private String name;
        private String login;
        private String password;

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

