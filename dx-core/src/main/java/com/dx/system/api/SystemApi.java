package com.dx.system.api;

import com.dx.system.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dx
 * @version 1.0
 * @date 2020/6/29 0029 13:56
 */
@FeignClient("providersystem")
public interface SystemApi {

    /**
     * 根据用户id查询用户
     * @param userId
     * @return
     */
    @GetMapping(value = "/api/user/getUserById")
    User queryUserById(@RequestParam("userId") String userId);
}
