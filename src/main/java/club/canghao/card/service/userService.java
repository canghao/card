package club.canghao.card.service;

import java.util.Map;

import club.canghao.card.dto.user;


public interface userService {
	public user getUserByOpenId(String openId);
	
	public user getUserByStuNumber(String stuNumber);
	
	public user getWxuserInfo(String encryptedData, String iv, String code,user user);
	
	public String getWxuserOpenId(String code);
	
	public Map<String,Object> addUser(user user);
	
	public Map<String,Object> updateUser(user user);
	
	public Map<String,Object> deleteUser(user user);
}
