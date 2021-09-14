package org.squad3.library.user.delivery.converters;

import org.squad3.library.shared.RestDTOConverter;
import org.squad3.library.user.User;
import org.squad3.library.user.delivery.rest.dto.UserDTO;

public class UserRestDTOConverter implements RestDTOConverter<UserDTO, User> {

    @Override
    public UserDTO mapToDTO(User entity) {
        //TODO: convert user to DTO
        return null;
    }

    @Override
    public User mapToEntity(UserDTO reqDTO) {
        //TODO: convert dto to entity
        return null;
    }
}
