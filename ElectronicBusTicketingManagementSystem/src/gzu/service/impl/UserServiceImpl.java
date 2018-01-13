package gzu.service.impl;

import gzu.mapper.UserMapper;
import gzu.pojo.User;
import gzu.service.UserService;
import gzu.util.SecurityUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

		user.setPassword(SecurityUtil.strToMD5(user.getPassword()));
		user.setNickName(user.getUserName());
		user.setPayPassword(user.getPassword());
		userMapper.addUser(user);
	}

}
