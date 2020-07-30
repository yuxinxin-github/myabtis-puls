package com.example.mp.demo;

import com.example.mp.demo.domain.user.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    /**
     * function:
     */
    @Test
    public void test1(){

        User user = new User();
        user.setId(1L);

        User user1 = user.selectById();

    }

//
//    @Autowired
//    UserMapper userMapper;
//
//    /**
//     * function:
//     */
//    @Test
//    public void test2(){
//
//        User user = new User();
//        user.setAge(20);
//        user.setEmail("testxy@qq.cn");
//        user.setRealName("小袁");
//        user.setUserName("xiaoyuan");
//        user.setPassword("123456");
//
//
//        int insert = userMapper.insert(user);
//
//        System.out.println(user.getId());
//
//
//
//    }
//
//    /**
//     * function:
//     */
//    @Test
//    public void test34(){
//        User user = new User();
//        user.setAge(20);
//
//        userMapper.update(user,null);
//    }
//    /**
//     * function:
//     */
//    @Test
//    public void test(){
//
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.eq("name","张三")
//                .lt("age",20);
//
//        if (true){
//            wrapper.eq("password","123456");
//        }
//
//
//        List<User> users = userMapper.selectList(wrapper);
//        users.forEach(System.out::println);
//    }
//
//    @Test
//    void contextLoads() {
//    }

}
