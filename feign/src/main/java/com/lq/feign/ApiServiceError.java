package com.lq.feign;

import org.springframework.stereotype.Component;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/5 16:00
 */
@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "服务发生故障！";
    }
}
