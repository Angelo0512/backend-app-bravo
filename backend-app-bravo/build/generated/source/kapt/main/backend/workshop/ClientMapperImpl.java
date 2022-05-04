package backend.workshop;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-04T14:58:18-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public Client clientInputToClient(ClientInput clientInput) {
        if ( clientInput == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String email = null;
        int telephone = 0;
        List<Vehicle> vehiclesList = null;

        id = clientInput.getId();
        name = clientInput.getName();
        email = clientInput.getEmail();
        if ( clientInput.getTelephone() != null ) {
            telephone = clientInput.getTelephone();
        }
        vehiclesList = vehicleInputListToVehicleList( clientInput.getVehiclesList() );

        Client client = new Client( id, name, email, telephone, vehiclesList );

        return client;
    }

    @Override
    public ClientResult clientToClientResult(Client client) {
        if ( client == null ) {
            return null;
        }

        long id = 0L;
        String name = null;
        String email = null;
        int telephone = 0;
        List<VehicleResult> vehiclesList = null;

        if ( client.getId() != null ) {
            id = client.getId();
        }
        name = client.getName();
        email = client.getEmail();
        telephone = client.getTelephone();
        vehiclesList = vehicleListToVehicleResultList( client.getVehiclesList() );

        ClientResult clientResult = new ClientResult( id, name, email, telephone, vehiclesList );

        return clientResult;
    }

    @Override
    public List<ClientResult> clientListToClientListResult(List<Client> clientList) {
        if ( clientList == null ) {
            return null;
        }

        List<ClientResult> list = new ArrayList<ClientResult>( clientList.size() );
        for ( Client client : clientList ) {
            list.add( clientToClientResult( client ) );
        }

        return list;
    }

    protected Vehicle vehicleInputToVehicle(VehicleInput vehicleInput) {
        if ( vehicleInput == null ) {
            return null;
        }

        Long id = null;
        String plateNumber = null;
        String vinNumber = null;
        String motorType = null;
        String vehicleClass = null;
        String motorSerial = null;
        String brand = null;

        id = vehicleInput.getId();
        plateNumber = vehicleInput.getPlateNumber();
        vinNumber = vehicleInput.getVinNumber();
        motorType = vehicleInput.getMotorType();
        vehicleClass = vehicleInput.getVehicleClass();
        motorSerial = vehicleInput.getMotorSerial();
        brand = vehicleInput.getBrand();

        Vehicle vehicle = new Vehicle( id, plateNumber, vinNumber, motorType, vehicleClass, motorSerial, brand );

        return vehicle;
    }

    protected List<Vehicle> vehicleInputListToVehicleList(List<VehicleInput> list) {
        if ( list == null ) {
            return null;
        }

        List<Vehicle> list1 = new ArrayList<Vehicle>( list.size() );
        for ( VehicleInput vehicleInput : list ) {
            list1.add( vehicleInputToVehicle( vehicleInput ) );
        }

        return list1;
    }

    protected VehicleResult vehicleToVehicleResult(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }

        long id = 0L;
        String plateNumber = null;
        String vinNumber = null;
        String brand = null;
        String motorSerial = null;
        String vehicleClass = null;
        String motorType = null;

        if ( vehicle.getId() != null ) {
            id = vehicle.getId();
        }
        plateNumber = vehicle.getPlateNumber();
        vinNumber = vehicle.getVinNumber();
        brand = vehicle.getBrand();
        motorSerial = vehicle.getMotorSerial();
        vehicleClass = vehicle.getVehicleClass();
        motorType = vehicle.getMotorType();

        VehicleResult vehicleResult = new VehicleResult( id, plateNumber, vinNumber, brand, motorSerial, vehicleClass, motorType );

        return vehicleResult;
    }

    protected List<VehicleResult> vehicleListToVehicleResultList(List<Vehicle> list) {
        if ( list == null ) {
            return null;
        }

        List<VehicleResult> list1 = new ArrayList<VehicleResult>( list.size() );
        for ( Vehicle vehicle : list ) {
            list1.add( vehicleToVehicleResult( vehicle ) );
        }

        return list1;
    }
}
