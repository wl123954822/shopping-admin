package cn.tjmj.serviceadmin.service.serviceImpl;

import cn.tjmj.serviceadmin.dao.TestDao;
import cn.tjmj.serviceadmin.entity.User;
import cn.tjmj.serviceadmin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-19 15:42
 */

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<User> getAll() {
        return testDao.getAll();
    }
}
