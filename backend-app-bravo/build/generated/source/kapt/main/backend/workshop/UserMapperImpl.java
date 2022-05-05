package backend.workshop;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-05T14:11:03-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userInputToUser(UserInput userInput) {
        if ( userInput == null ) {
            return null;
        }

        Long id = null;
        String firstName = null;
        String lastName = null;
        String password = null;
        String email = null;
        Boolean enabled = null;

        id = userInput.getId();
        firstName = userInput.getFirstName();
        lastName = userInput.getLastName();
        password = userInput.getPassword();
        email = userInput.getEmail();
        enabled = userInput.getEnabled();

        Date createDate = null;
        Boolean tokenExpired = null;
        Set<Role> roleList = null;

        User user = new User( id, firstName, lastName, password, email, createDate, enabled, tokenExpired, roleList );

        return user;
    }

    @Override
    public User userLoginInputToUser(UserLoginInput userLoginInput) {
        if ( userLoginInput == null ) {
            return null;
        }

        String password = null;
        String email = null;

        password = userLoginInput.getPassword();
        email = userLoginInput.getEmail();

        Long id = null;
        String firstName = null;
        String lastName = null;
        Date createDate = null;
        Boolean enabled = null;
        Boolean tokenExpired = null;
        Set<Role> roleList = null;

        User user = new User( id, firstName, lastName, password, email, createDate, enabled, tokenExpired, roleList );

        return user;
    }

    @Override
    public UserResult userToUserResult(User user) {
        if ( user == null ) {
            return null;
        }

        long id = 0L;
        String firstName = null;
        String lastName = null;
        String email = null;
        String password = null;
        Boolean enabled = null;
        Boolean tokenExpired = null;
        Date createDate = null;

        if ( user.getId() != null ) {
            id = user.getId();
        }
        firstName = user.getFirstName();
        lastName = user.getLastName();
        email = user.getEmail();
        password = user.getPassword();
        enabled = user.getEnabled();
        tokenExpired = user.getTokenExpired();
        createDate = user.getCreateDate();

        List<RoleDetails> roles = null;

        UserResult userResult = new UserResult( id, firstName, lastName, email, password, enabled, tokenExpired, createDate, roles );

        return userResult;
    }

    @Override
    public void userInputToUser(UserInput dto, User user) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            user.setId( dto.getId() );
        }
        if ( dto.getFirstName() != null ) {
            user.setFirstName( dto.getFirstName() );
        }
        if ( dto.getLastName() != null ) {
            user.setLastName( dto.getLastName() );
        }
        if ( dto.getPassword() != null ) {
            user.setPassword( dto.getPassword() );
        }
        if ( dto.getEmail() != null ) {
            user.setEmail( dto.getEmail() );
        }
        if ( dto.getEnabled() != null ) {
            user.setEnabled( dto.getEnabled() );
        }
    }
}
