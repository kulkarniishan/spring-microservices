package com.kulkarniishan.userservice.controller;

import com.kulkarniishan.userservice.VO.ResponseTemplateVO;
import com.kulkarniishan.userservice.entity.User;
import com.kulkarniishan.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public User createUser(@RequestBody User user){
        log.info("Inside saveUser method of UserController!");
        return userService.createUser(user);
    }

    @GetMapping("/{userId}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("userId") Long userId){
        log.info("Inside getUserWithDepartment method of UserController!");
        return userService.getUserWithDepartment(userId);
    }

}
