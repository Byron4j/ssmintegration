package org.byron4j.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.byron4j.model.User;

@Mapper
public interface UserMapper {
    User queryById(Long id);
}
