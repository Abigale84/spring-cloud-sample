package com.lq.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/5 15:43
 */
@FeignClient(value = "eurekaclient",fallback = ApiServiceError.class)
@Repository
public interface ApiService {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();
}
