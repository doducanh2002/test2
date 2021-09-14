package org.squad3.library.user.usecase.impl;

import lombok.AllArgsConstructor;
import org.squad3.library.user.User;
import org.squad3.library.user.exception.UserCodeAlreadyExistsException;
import org.squad3.library.user.ports.UserRepositoryService;
import org.squad3.library.user.usecase.CreateUserUseCase;

@AllArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserRepositoryService userRepositoryService;

    @Override
    public User execute(User user) throws UserCodeAlreadyExistsException {
        if (!userRepositoryService.doesUserCodeExists(user.getUserCode())){
            return userRepositoryService.saveUser(user);
        }
        else {
            throw new UserCodeAlreadyExistsException();
        }
    }
}
