package com.lzk.user.cduser.controller;

import com.lzk.user.cduser.dao.SysUserMapper;
import com.lzk.user.cduser.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/service/user")
public class UserController {
    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping("/findAll")
    public String findAll(){
        SysUser sysUser=new SysUser();
        sysUser.setName("lizk");
        sysUser.setAge(30);
        sysUser.setBirthday(new Date());
        sysUserMapper.insert(sysUser);
        System.out.println("user服务");
        return "user服务";
    }
}
