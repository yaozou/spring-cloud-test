package com.yao.service.proxy.api.uer;

import com.yao.service.proxy.api.IProxyProvider;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Description:
 * @Auther: yaozou
 * @Date: 2018/8/22 14:38
 */
@FeignClient
public interface IUserProvider extends IProxyProvider{

}