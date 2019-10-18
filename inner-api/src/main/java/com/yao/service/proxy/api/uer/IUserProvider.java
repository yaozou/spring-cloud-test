package com.yao.service.proxy.api.uer;

import com.yao.service.proxy.api.IProxyProvider;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import static com.yao.service.proxy.api.IProxyProvider.USER_FEIGN;

/**
 * @Description:
 * @Auther: yaozou
 * @Date: 2018/8/22 14:38
 */
@FeignClient(name = USER_FEIGN,fallback = UserFeignFallback.class)
public interface IUserProvider extends IProxyProvider{
    @GetMapping
    String test();
}