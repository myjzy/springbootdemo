package cn.xhy.controller;

import cn.xhy.domain.User;
import cn.xhy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String hello(User user){
        userService.save(user);
        return "xxx aaaa kkkk";
    }

    @RequestMapping("{id}")
    @ResponseBody
    public User get(@PathVariable("id") Integer id){
        User user = userService.get(id);
        return user;
    }
}
