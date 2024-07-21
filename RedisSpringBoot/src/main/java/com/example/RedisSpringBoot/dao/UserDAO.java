package com.example.RedisSpringBoot.dao;

import com.example.RedisSpringBoot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserDAO {

    @Autowired
    public RedisTemplate<String, Object> redisTemplate;

    private static final String KEY = "USER";

    //save
    public User saveUser(User user) {
        redisTemplate.opsForHash().put(KEY, user.getUserId(), user);
        return user;
    }

    //fetch
    public User getUser(String userId) {
        return (User) redisTemplate.opsForHash().get(KEY, userId);
    }

    //fetch-all
    public Map<Object, Object> getAllUsers() {
        return redisTemplate.opsForHash().entries(KEY);
    }

    //delete
    public Long deleteUser(String userId) {
        return redisTemplate.opsForHash().delete(KEY, userId);
    }
}
