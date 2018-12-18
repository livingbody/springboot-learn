package cn.goingtodo.mdblog.controller;


import cn.goingtodo.mdblog.pojo.User;
import cn.goingtodo.mdblog.pojo.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/listUser")
    public String ListUser(Model model) {
        List<User> users = userMapper.findall();
        model.addAttribute("users", users);
        return "listUser";
    }
}
