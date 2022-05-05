package backend.workshop;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-05T11:34:20-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.15 (Amazon.com Inc.)"
)
@Component
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public Service serviceInputToService(ServiceInput serviceInput) {
        if ( serviceInput == null ) {
            return null;
        }

        Integer id = null;
        String observations = null;
        Status state = null;

        id = serviceInput.getId();
        observations = serviceInput.getObservations();
        state = serviceInput.getState();

        Service service = new Service( id, observations, state );

        return service;
    }

    @Override
    public ServiceResult serviceToServiceResult(Service service) {
        if ( service == null ) {
            return null;
        }

        int id = 0;
        String observations = null;
        Status state = null;

        if ( service.getId() != null ) {
            id = service.getId();
        }
        observations = service.getObservations();
        state = service.getState();

        ServiceResult serviceResult = new ServiceResult( id, observations, state );

        return serviceResult;
    }

    @Override
    public List<ServiceResult> serviceListToServiceListResult(List<Service> serviceList) {
        if ( serviceList == null ) {
            return null;
        }

        List<ServiceResult> list = new ArrayList<ServiceResult>( serviceList.size() );
        for ( Service service : serviceList ) {
            list.add( serviceToServiceResult( service ) );
        }

        return list;
    }
}
