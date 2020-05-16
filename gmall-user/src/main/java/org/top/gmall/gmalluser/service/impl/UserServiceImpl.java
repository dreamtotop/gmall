package org.top.gmall.gmalluser.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.top.gmall.gmalluser.mapper.UmsMemberMapper;
import org.top.gmall.gmalluser.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UmsMemberMapper userMapper;


}
