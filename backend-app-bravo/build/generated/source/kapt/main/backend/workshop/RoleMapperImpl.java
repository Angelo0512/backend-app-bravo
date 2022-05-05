package backend.workshop;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-05T14:11:02-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDetails roleToRoleDetails(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDetails roleDetails = new RoleDetails();

        roleDetails.setId( role.getId() );
        roleDetails.setName( role.getName() );

        return roleDetails;
    }
}
