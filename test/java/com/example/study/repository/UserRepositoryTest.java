package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import com.example.study.model.entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        User user = new User();
        user.setAccount(":TestUser01");
        user.setEmail("kuk@naver.com");
        user.setPhoneNumber("010-1112-2423");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

        User newUser = userRepository.save(user);
        System.out.println("newUser :" +newUser);
    }
    @Test
    @Transactional
    public void read(){
        Optional<User> user = userRepository.findByAccount("TestUser01");

        user.ifPresent(selectUser ->{

            selectUser.getOrderDetailList().stream().forEach(detail->{
                Item item = detail.getItem();
                System.out.println(item);
            });
        });

    }
    @Test
    public void update(){
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser ->{
            selectUser.setAccount("PPPP");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("updated method()");

            userRepository.save(selectUser);
        });
    }
    @Test
    @Transactional
    public void delete(){
        Optional<User> user = userRepository.findById(1L);

        Assert.assertTrue(user.isPresent()); //true

        user.ifPresent(selectUser->{
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser = userRepository.findById(1L);

        Assert.assertFalse(deleteUser.isPresent()); //false
    }
}
