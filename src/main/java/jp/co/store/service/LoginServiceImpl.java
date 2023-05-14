package jp.co.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jp.co.store.emtity.UserBean;
import jp.co.store.mapper.LoginMapper;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginMapper mapper;

	@Override
	public UserBean findUser(String username, String password) {
		// TODO 自動生成されたメソッド・スタブ
		//UserBean bean = loginMapper.selectUser(username, password);

		return null;
	}
}
