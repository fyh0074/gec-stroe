package jp.co.store.service;

import org.springframework.stereotype.Service;

import jp.co.store.emtity.UserBean;
@Service
public interface LoginService {

	public UserBean findUser(String username,String password);

}
