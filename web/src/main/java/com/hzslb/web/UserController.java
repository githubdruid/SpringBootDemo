package com.hzslb.web;

import com.hzslb.model.User;
import com.hzslb.model.common.R;
import com.hzslb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("用户信息管理")
@RestController
@RequestMapping("/user/*")
public class UserController {
    @Autowired
    UserService userServicce;
    @ApiOperation("获取列表")
    @GetMapping("list")
    public R list() {
        try {
            return R.isOK().data(userServicce.list());
        } catch (Exception e) {
            return R.isFail(e);
        }
    }
    @ApiOperation("新增用户")
    @PostMapping("save")
    public boolean save(User user){
        return userServicce.add(user);
    }
    @ApiOperation("更新用户")
    @ApiImplicitParam(name = "user", value = "单个用户信息", dataType = "User")
    @PutMapping("update")
    public boolean update(User user) {
        return userServicce.remove(user) && userServicce.add(user);
    }
}
