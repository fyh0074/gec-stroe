package jp.co.store.mapper;

import org.apache.ibatis.annotations.Mapper;

import jp.co.store.emtity.UserBean;

@Mapper
public interface LoginMapper {
	
	UserBean selectUser(String username,String password);

}
