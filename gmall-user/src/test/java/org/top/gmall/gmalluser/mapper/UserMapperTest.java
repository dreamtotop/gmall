package org.top.gmall.gmalluser.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.top.gmall.gmalluser.model.UmsMember;

import java.util.Date;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UmsMemberMapper userMapper;

    @Test
    void saveUser() {
        UmsMember umsMember = new UmsMember();
        umsMember.setMemberLevelId(1);
        umsMember.setUsername("admin01");
        umsMember.setPassword("123456");
        umsMember.setNickname("风清扬");
        umsMember.setPhone("18768113915");
        umsMember.setStatus(1);
        umsMember.setCreateTime(new Date());
        umsMember.setIcon("https://picsum.photos/id/1005/200/300");
        umsMember.setGender(1);
        umsMember.setBirthday(new Date());
        umsMember.setCity("杭州");
        umsMember.setJob("IT");
        umsMember.setPersonalizedSignature("勇闯天涯");
        umsMember.setSourceType(0);
        umsMember.setIntegration(0);
        umsMember.setGrowth(50);
        umsMember.setLuckeyCount(0);
        umsMember.setHistoryIntegration(100);
        userMapper.saveUser(umsMember);
    }

    @Test
    void selectUser() {
        UmsMember umsMember = userMapper.selectUser(11);
        System.out.println(umsMember);
    }

    @Test
    void selectAll() {
    }

    @Test
    void updateUser() {
        UmsMember umsMember = userMapper.selectUser(14);
        umsMember.setUsername("admin0001");
        userMapper.updateUser(umsMember);
    }

    @Test
    void deleteUser() {
        userMapper.deleteUser(14);
    }


}