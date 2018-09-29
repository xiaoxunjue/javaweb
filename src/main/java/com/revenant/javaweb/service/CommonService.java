package com.revenant.javaweb.service;


import com.revenant.javaweb.common.token.TokenUtils;
import com.revenant.javaweb.common.utils.DesUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

	private static final Logger logger = LoggerFactory.getLogger(CommonService.class);
//	@Autowired
//	private UserMapper userMapper;

	private String moddles = TokenUtils.moddle;

	/**
	 * 验证token 是否有效
	 * 
	 * @param token
	 * @return
	 */
	public Boolean checkToken(String token) {
		try {
			String str = DesUtils.decrypt(token);
			// 解密id
			String id = str.substring(str.indexOf(moddles) + moddles.length(), str.length());
			// 解密用户名
			String username = str.substring(0, str.indexOf(moddles));
			// 解析字符 生成token
			String sourceToken = TokenUtils.makeToken(Long.parseLong(id), username);
			if (!token.equals(sourceToken)) {
				return false;
			}
//			User user = userMapper.selectByPrimaryKey(Long.parseLong(id));
//			if (user == null) {
//				return false;
//			}
			// 截取用户名和id
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("{}解析异常!" + token);
			return false;
		}
		return true;
	}
}
