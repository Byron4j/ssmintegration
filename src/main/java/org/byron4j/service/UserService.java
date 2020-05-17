package org.byron4j.service;

import org.byron4j.model.User;

public interface UserService {
    User queryById(Long id);
}
