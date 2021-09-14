package org.squad3.library.user.ports;

import org.squad3.library.user.User;

/**
 * This interface where will receive request from gateway(delivery: api)
 */
public interface UserRepositoryService {

    User saveUser(User user);

    Boolean doesUserCodeExists(String userCode);
}