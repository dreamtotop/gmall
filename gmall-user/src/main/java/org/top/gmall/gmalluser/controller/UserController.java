package org.top.gmall.gmalluser.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.top.gmall.gmalluser.service.UserService;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

}
