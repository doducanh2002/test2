package org.squad3.library.user.usecase;

import org.squad3.library.user.User;
import org.squad3.library.user.exception.UserCodeAlreadyExistsException;

public interface CreateUserUseCase {

    User execute(User user) throws UserCodeAlreadyExistsException;
}
