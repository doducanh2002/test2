package org.squad3.library.user.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.squad3.library.user.delivery.converters.UserRestDTOConverter;
import org.squad3.library.user.persistance.converters.UserRepositoryConverter;
import org.squad3.library.user.persistance.impl.UserRepositoryServiceImpl;
import org.squad3.library.user.persistance.repositories.UserRepository;
import org.squad3.library.user.usecase.CreateUserUseCase;
import org.squad3.library.user.usecase.impl.CreateUserUseCaseImpl;

@Configuration
@RequiredArgsConstructor
public class UserServiceConfiguration {

    private final UserRepository userRepository;

    @Bean
    public UserRestDTOConverter createUserRestDTOConverter(){
        return new UserRestDTOConverter();
    }

    @Bean
    public UserRepositoryConverter createUserRepositoryConverter(){
        return new UserRepositoryConverter();
    }

    @Bean
    public UserRepositoryServiceImpl createUserService(){
        return new UserRepositoryServiceImpl(userRepository, createUserRepositoryConverter());
    }

    @Bean
    public CreateUserUseCase createCreateUserUseCase(){
        return new CreateUserUseCaseImpl(createUserService());
    }
    


}
