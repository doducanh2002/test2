package org.squad3.library.user.persistance.converters;

import org.squad3.library.shared.RepositoryConverter;
import org.squad3.library.user.User;
import org.squad3.library.user.persistance.entites.UserEntity;

public class UserRepositoryConverter implements RepositoryConverter<UserEntity, User> {
    @Override
    public UserEntity mapToTable(User persistenceObject) {
        //TODO: convert user entity -> user entity mapping (table)
        return null;
    }

    @Override
    public User mapToEntity(UserEntity tableObject) {
        //TODO: convert user entity mapping (table) -> user entity
        return null;
    }
}
