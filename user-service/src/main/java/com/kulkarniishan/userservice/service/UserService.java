package com.kulkarniishan.userservice.service;

import com.kulkarniishan.userservice.VO.Department;
import com.kulkarniishan.userservice.VO.ResponseTemplateVO;
import com.kulkarniishan.userservice.entity.User;
import com.kulkarniishan.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User createUser(User user) {
        log.info("Inside saveUser method of UserService!");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment method of UserService!");
        ResponseTemplateVO vo = new ResponseTemplateVO();

        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://localhost:9091/department"+user.getDepartmentId(),Department.class);

        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }
}
