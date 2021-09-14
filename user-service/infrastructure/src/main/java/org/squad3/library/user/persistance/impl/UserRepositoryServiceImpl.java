package org.squad3.library.user.persistance.impl;

import org.squad3.library.shared.RepositoryConverter;
import org.squad3.library.user.User;
import org.squad3.library.user.persistance.entites.UserEntity;
import org.squad3.library.user.persistance.repositories.UserRepository;
import org.squad3.library.user.ports.UserRepositoryService;

public class UserRepositoryServiceImpl implements UserRepositoryService {

    private final UserRepository userRepository;

    private final RepositoryConverter<UserEntity, User> userRepositoryConverter;

    @Override
    public Boolean doesUserCodeExists(String userCode) {
        return userRepository.findByUserCode(userCode)
                .map(studentEntity -> {
                    return true;
                })
                .orElse(false);
    }

    @Override
    public User saveUser(User user) {
        UserEntity userEntityReq = userRepositoryConverter.mapToTable(user);
        userEntityReq.setId(null);
        return userRepositoryConverter.mapToEntity(userRepository.save(userEntityReq));
    }
}
