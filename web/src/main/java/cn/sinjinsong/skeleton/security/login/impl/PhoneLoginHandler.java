package cn.sinjinsong.skeleton.security.login.impl;

import cn.sinjinsong.skeleton.domain.dto.LoginDTO;
import cn.sinjinsong.skeleton.domain.entity.UserDO;
import cn.sinjinsong.skeleton.security.login.LoginHandler;
import cn.sinjinsong.skeleton.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by SinjinSong on 2017/4/27.
 */
@Component("LoginHandler.phone")
public class PhoneLoginHandler implements LoginHandler {
    @Autowired
    private UserService service;
    
    @Override
    public UserDO handle(LoginDTO loginDTO) {
        return service.findByPhone(loginDTO.getPhone());
    }
}
