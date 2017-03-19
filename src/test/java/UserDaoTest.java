//import com.muslf.dao.IUserDao;
//import com.freelf.model.MuslfUserEntity;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.transaction.TransactionConfiguration;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.Resource;
//
///**
// * Created by RENQI on 2016/11/13.
// */
//@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-hibernate.xml"})
//@RunWith(SpringJUnit4ClassRunner.class)
//// defaultRollback=true不会改变数据库，false会改变数据库
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//@Transactional
//public class UserDaoTest {
//    @Resource
//    private IUserDao userDao;
//
//    @Test
//    public void testIsExist() {
//        MuslfUserEntity user = new MuslfUserEntity();
//        user.setUsername("zhangsan");
//        user.setUserpwd("123456");
//        boolean result = userDao.isExist(user);
//        System.out.println(result);
//    }
//}
