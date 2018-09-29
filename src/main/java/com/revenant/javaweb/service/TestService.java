package com.revenant.javaweb.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestService {
    /*
     *
     * token的使用
     * */

//    public Body login(String phone, String password, String code) {
//        if (StringUtils.isEmpty(code)) {
//            UserInfo user = userInfoMapper.findByPhone(phone);
//            if (user == null) {
//                return Body.newInstance(453, "用户不存在");
//            }
//            if (!MD5Util.MD5EncodeUtf8(password).equals(user.getPwd())) {
//                return Body.newInstance(454, "密码错误");
//            }
//            UserVo userVo = handleObj(user);
//            logger.info("====>用户:{} 登录成功", userVo.getPhone());
//            return Body.newInstance(userVo);
//        }
//        return Body.BODY_200;
//    }
//
//    /**
//     * 封装登录对象
//     *
//     * @param user
//     * @return
//     */
//    public UserVo handleObj(UserInfo user) {
//        UserVo temp = new UserVo();
//        temp.setUid(user.getUid());
//        temp.setName(user.getName());
//        temp.setAvatar(user.getAvatar());
//        temp.setLevel(user.getLevel());
//        temp.setPhone(user.getPhone());
//        temp.setInvitation(user.getInvitation());
//        temp.setFromInvitation(user.getFrominvitation());
//        // token 加密算法 id+用户名
//        temp.setToken(TokenUtils.makeToken(user.getUid(), user.getPhone()));
//        return temp;
//    }

}
