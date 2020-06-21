package com.cmpay.sachzhong.cache;

import com.cmpay.lemon.framework.cache.redis.RedisCacheable;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
public class CacheRedisService {

    @RedisCacheable("redisCache")
    public String getRedisCacheInfo(String value) {
        System.err.println("---i am in redis cache, i am " + value + "---");
        return "this is redis cache:" + value;
    }

}
