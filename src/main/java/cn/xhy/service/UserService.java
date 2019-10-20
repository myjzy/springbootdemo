package cn.xhy.service;

import cn.xhy.domain.User;
import cn.xhy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("us")
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    public void save(User user){
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        userMapper.insert(user);
    }

    void xx(){

    }
    public User get(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
