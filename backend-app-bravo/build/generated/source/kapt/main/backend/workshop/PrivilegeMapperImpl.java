package backend.workshop;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-05T12:06:57-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class PrivilegeMapperImpl implements PrivilegeMapper {

    @Override
    public PrivilegeDetails privilegeToPrivilegeDetails(Privilege privilege) {
        if ( privilege == null ) {
            return null;
        }

        PrivilegeDetails privilegeDetails = new PrivilegeDetails();

        privilegeDetails.setId( privilege.getId() );
        privilegeDetails.setName( privilege.getName() );

        return privilegeDetails;
    }
}
