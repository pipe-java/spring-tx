package io.xlkx.dvgd.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public void save(){
        userDao.save();
        String n = null;
        n.toCharArray();
    }
}
