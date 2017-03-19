//import com.muslf.model.MuslfUserEntity;
//import com.freelf.service.IUserService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//
///**
// * Created by RENQI on 2016/11/13.
// */
//@ContextConfiguration(locations= {"classpath:spring.xml","classpath:spring-hibernate.xml"})
//@RunWith(SpringJUnit4ClassRunner.class)
//public class UserServiceTest {
//    @Resource
//    private IUserService userService;
//
//    @Test
//    public void testIsExist(){
//        MuslfUserEntity user = new MuslfUserEntity();
//        user.setUsername("zhangsan");
//        user.setUserpwd("123456");
//        boolean result = userService.isExist(user);
//        System.out.println(result);
//    }
//}
