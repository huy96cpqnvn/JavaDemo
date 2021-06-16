package com.demo.datasource;

import com.demo.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private static List<User> listUser;

    public static List<User> getListUser() {
        if (listUser == null) {
            List<User> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                User model = new User("demo"+i, "address"+i);
                list.add(model);
            }
            listUser = list;
        }
        return listUser;
    }
}
