package backend.workshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-05T13:27:26-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public User clientInputToClient(ClientInput clientInput) {
        if ( clientInput == null ) {
            return null;
        }

        Long id = null;
        String email = null;

        id = clientInput.getId();
        email = clientInput.getEmail();

        String firstName = null;
        String lastName = null;
        String password = null;
        Date createDate = null;
        Boolean enabled = null;
        Boolean tokenExpired = null;
        Set<Role> roleList = null;

        User user = new User( id, firstName, lastName, password, email, createDate, enabled, tokenExpired, roleList );

        return user;
    }

    @Override
    public ClientResult clientToClientResult(User client) {
        if ( client == null ) {
            return null;
        }

        long id = 0L;
        String email = null;

        if ( client.getId() != null ) {
            id = client.getId();
        }
        email = client.getEmail();

        String name = null;
        int telephone = 0;
        List<VehicleResult> vehiclesList = null;

        ClientResult clientResult = new ClientResult( id, name, email, telephone, vehiclesList );

        return clientResult;
    }

    @Override
    public List<ClientResult> clientListToClientListResult(List<User> clientList) {
        if ( clientList == null ) {
            return null;
        }

        List<ClientResult> list = new ArrayList<ClientResult>( clientList.size() );
        for ( User user : clientList ) {
            list.add( clientToClientResult( user ) );
        }

        return list;
    }
}
