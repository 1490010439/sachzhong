package com.cmpay.sachzhong.cache;

import com.cmpay.lemon.framework.cache.jcache.JCacheCacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheEhcacheService {

    @JCacheCacheable("ehcache")
    public String getEhcacheInfo(String value) {
        System.err.println("---i am in ehcache, i am " + value + "---");
        return "this is ehcache:" + value;
    }

}
