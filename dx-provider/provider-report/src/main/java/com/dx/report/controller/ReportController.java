package com.dx.report.controller;

import com.dx.system.api.SystemApi;
import com.dx.system.model.ResponseResult;
import com.dx.system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dx
 * @version 1.0
 * @date 2020/6/29 0029 14:40
 */
@RequestMapping("/report")
@RestController
public class ReportController {

    @Autowired
    SystemApi systemApi;

    @GetMapping("/getUser")
    public ResponseResult<User> getUser(){
       return ResponseResult.SUCCESS(systemApi.queryUserById("1"));
    }

}
