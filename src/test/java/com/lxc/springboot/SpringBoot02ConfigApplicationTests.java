package com.lxc.springboot;
import com.lxc.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public  class SpringBoot02ConfigApplicationTests {
    @Autowired
public Person person;
    @Test
  public    void contextLoads() {
        System.out.println(person);
    }

}
