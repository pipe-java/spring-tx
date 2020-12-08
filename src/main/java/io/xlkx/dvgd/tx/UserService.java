package io.xlkx.dvgd.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public void save(){
        userDao.save("111@qq.com","save");
        save2();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void save2(){
        userDao.save("234@qq.com","save2");
        String n = null;
        n.toCharArray();
    }
}
