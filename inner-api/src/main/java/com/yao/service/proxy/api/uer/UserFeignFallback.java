package com.yao.service.proxy.api.uer;

/**
 * @Description:
 * @author: yaozou
 * @Date: 2019/7/30 17:14
 */
public class UserFeignFallback implements IUserProvider  {

    @Override
    public String test() {
        return "error";
    }
}
