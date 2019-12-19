package com.lzk.user.cduser;

import com.lzk.user.cduser.dao.SysUserMapper;
import com.lzk.user.cduser.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CdUserApplicationTests {

	@Autowired
	private SysUserMapper sysUserMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void insert(){
		SysUser sysUser=new SysUser();
		sysUser.setName("lizk");
		sysUser.setAge(20);
		sysUser.setBirthday(new Date());
		sysUserMapper.insert(sysUser);
	}

}
