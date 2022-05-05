package backend.workshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-05T14:09:12-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.15 (Amazon.com Inc.)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public User clientInputToClient(UserInput userInput) {
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
    public UserResult clientToClientResult(User client) {
        if ( client == null ) {
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

        if ( client.getId() != null ) {
            id = client.getId();
        }
        firstName = client.getFirstName();
        lastName = client.getLastName();
        email = client.getEmail();
        password = client.getPassword();
        enabled = client.getEnabled();
        tokenExpired = client.getTokenExpired();
        createDate = client.getCreateDate();

        List<RoleDetails> roles = null;

        UserResult userResult = new UserResult( id, firstName, lastName, email, password, enabled, tokenExpired, createDate, roles );

        return userResult;
    }

    @Override
    public List<UserResult> clientListToClientListResult(List<User> clientList) {
        if ( clientList == null ) {
            return null;
        }

        List<UserResult> list = new ArrayList<UserResult>( clientList.size() );
        for ( User user : clientList ) {
            list.add( clientToClientResult( user ) );
        }

        return list;
    }
}
