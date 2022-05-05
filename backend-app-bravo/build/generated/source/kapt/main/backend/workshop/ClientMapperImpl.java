package backend.workshop;

import error.NonExistentClass;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-05T14:01:23-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.15 (Amazon.com Inc.)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public User clientInputToClient(NonExistentClass clientInput) {
        if ( clientInput == null ) {
            return null;
        }

        Long id = null;
        String firstName = null;
        String lastName = null;
        String password = null;
        String email = null;
        Date createDate = null;
        Boolean enabled = null;
        Boolean tokenExpired = null;
        Set<Role> roleList = null;

        User user = new User( id, firstName, lastName, password, email, createDate, enabled, tokenExpired, roleList );

        return user;
    }

    @Override
    public NonExistentClass clientToClientResult(User client) {
        if ( client == null ) {
            return null;
        }

        NonExistentClass nonExistentClass = new NonExistentClass();

        return nonExistentClass;
    }

    @Override
    public List<NonExistentClass> clientListToClientListResult(List<User> clientList) {
        if ( clientList == null ) {
            return null;
        }

        List<NonExistentClass> list = new ArrayList<NonExistentClass>( clientList.size() );
        for ( User user : clientList ) {
            list.add( clientToClientResult( user ) );
        }

        return list;
    }
}
