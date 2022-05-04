package backend.workshop;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-04T14:58:18-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class TechnicianMappersImpl implements TechnicianMappers {

    @Override
    public TechnicianDetails technicianToTechnicianDetails(Technician technician) {
        if ( technician == null ) {
            return null;
        }

        TechnicianDetails technicianDetails = new TechnicianDetails();

        technicianDetails.setId( technician.getId() );
        technicianDetails.setUser( userToUserInput( technician.getUser() ) );

        return technicianDetails;
    }

    protected UserInput userToUserInput(User user) {
        if ( user == null ) {
            return null;
        }

        UserInput userInput = new UserInput();

        userInput.setId( user.getId() );
        userInput.setFirstName( user.getFirstName() );
        userInput.setLastName( user.getLastName() );
        userInput.setEmail( user.getEmail() );
        userInput.setPassword( user.getPassword() );
        userInput.setEnabled( user.getEnabled() );

        return userInput;
    }
}
