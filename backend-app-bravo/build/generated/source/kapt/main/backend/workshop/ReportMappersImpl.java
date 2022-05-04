package backend.workshop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-04T14:58:18-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class ReportMappersImpl implements ReportMappers {

    @Override
    public Report reportInputToReport(ReportInput reportInput) {
        if ( reportInput == null ) {
            return null;
        }

        Date creationDate = null;
        Long id = null;
        String description = null;
        Client client = null;
        Vehicle vehicle = null;
        Technician technician = null;

        if ( reportInput.getCreationDate() != null ) {
            creationDate = reportInput.getCreationDate();
        }
        else {
            creationDate = new java.util.Date();
        }
        id = reportInput.getId();
        description = reportInput.getDescription();
        client = clientInputToClient( reportInput.getClient() );
        vehicle = vehicleInputToVehicle( reportInput.getVehicle() );
        technician = technicianDetailsToTechnician( reportInput.getTechnician() );

        List<Service> servicesList = null;

        Report report = new Report( id, creationDate, description, servicesList, client, vehicle, technician );

        return report;
    }

    @Override
    public ReportResult reportToReportResult(Report report) {
        if ( report == null ) {
            return null;
        }

        long id = 0L;
        Date creationDate = null;
        String description = null;
        ClientResult client = null;
        VehicleResult vehicle = null;

        if ( report.getId() != null ) {
            id = report.getId();
        }
        creationDate = report.getCreationDate();
        description = report.getDescription();
        client = clientToClientResult( report.getClient() );
        vehicle = vehicleToVehicleResult( report.getVehicle() );

        List<ServiceResult> services = null;

        ReportResult reportResult = new ReportResult( id, creationDate, description, services, client, vehicle );

        return reportResult;
    }

    @Override
    public List<ReportResult> reportListToReportListResult(List<Report> reportList) {
        if ( reportList == null ) {
            return null;
        }

        List<ReportResult> list = new ArrayList<ReportResult>( reportList.size() );
        for ( Report report : reportList ) {
            list.add( reportToReportResult( report ) );
        }

        return list;
    }

    @Override
    public void reportInputToReport(ReportInput dto, Report report) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            report.setId( dto.getId() );
        }
        if ( dto.getCreationDate() != null ) {
            report.setCreationDate( dto.getCreationDate() );
        }
        if ( dto.getDescription() != null ) {
            report.setDescription( dto.getDescription() );
        }
        if ( dto.getClient() != null ) {
            if ( report.getClient() == null ) {
                report.setClient( new Client() );
            }
            clientInputToClient1( dto.getClient(), report.getClient() );
        }
        if ( dto.getVehicle() != null ) {
            if ( report.getVehicle() == null ) {
                report.setVehicle( new Vehicle() );
            }
            vehicleInputToVehicle1( dto.getVehicle(), report.getVehicle() );
        }
        if ( dto.getTechnician() != null ) {
            if ( report.getTechnician() == null ) {
                report.setTechnician( new Technician() );
            }
            technicianDetailsToTechnician1( dto.getTechnician(), report.getTechnician() );
        }
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

    protected Client clientInputToClient(ClientInput clientInput) {
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

    protected User userInputToUser(UserInput userInput) {
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

    protected Technician technicianDetailsToTechnician(TechnicianDetails technicianDetails) {
        if ( technicianDetails == null ) {
            return null;
        }

        Long id = null;
        User user = null;

        id = technicianDetails.getId();
        user = userInputToUser( technicianDetails.getUser() );

        Technician technician = new Technician( id, user );

        return technician;
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

    protected ClientResult clientToClientResult(Client client) {
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

    protected void clientInputToClient1(ClientInput clientInput, Client mappingTarget) {
        if ( clientInput == null ) {
            return;
        }

        if ( clientInput.getId() != null ) {
            mappingTarget.setId( clientInput.getId() );
        }
        if ( clientInput.getName() != null ) {
            mappingTarget.setName( clientInput.getName() );
        }
        if ( clientInput.getEmail() != null ) {
            mappingTarget.setEmail( clientInput.getEmail() );
        }
        if ( clientInput.getTelephone() != null ) {
            mappingTarget.setTelephone( clientInput.getTelephone() );
        }
        if ( mappingTarget.getVehiclesList() != null ) {
            List<Vehicle> list = vehicleInputListToVehicleList( clientInput.getVehiclesList() );
            if ( list != null ) {
                mappingTarget.getVehiclesList().clear();
                mappingTarget.getVehiclesList().addAll( list );
            }
        }
        else {
            List<Vehicle> list = vehicleInputListToVehicleList( clientInput.getVehiclesList() );
            if ( list != null ) {
                mappingTarget.setVehiclesList( list );
            }
        }
    }

    protected void vehicleInputToVehicle1(VehicleInput vehicleInput, Vehicle mappingTarget) {
        if ( vehicleInput == null ) {
            return;
        }

        if ( vehicleInput.getId() != null ) {
            mappingTarget.setId( vehicleInput.getId() );
        }
        if ( vehicleInput.getPlateNumber() != null ) {
            mappingTarget.setPlateNumber( vehicleInput.getPlateNumber() );
        }
        if ( vehicleInput.getVinNumber() != null ) {
            mappingTarget.setVinNumber( vehicleInput.getVinNumber() );
        }
        if ( vehicleInput.getMotorType() != null ) {
            mappingTarget.setMotorType( vehicleInput.getMotorType() );
        }
        if ( vehicleInput.getVehicleClass() != null ) {
            mappingTarget.setVehicleClass( vehicleInput.getVehicleClass() );
        }
        if ( vehicleInput.getMotorSerial() != null ) {
            mappingTarget.setMotorSerial( vehicleInput.getMotorSerial() );
        }
        if ( vehicleInput.getBrand() != null ) {
            mappingTarget.setBrand( vehicleInput.getBrand() );
        }
    }

    protected void userInputToUser1(UserInput userInput, User mappingTarget) {
        if ( userInput == null ) {
            return;
        }

        if ( userInput.getId() != null ) {
            mappingTarget.setId( userInput.getId() );
        }
        if ( userInput.getFirstName() != null ) {
            mappingTarget.setFirstName( userInput.getFirstName() );
        }
        if ( userInput.getLastName() != null ) {
            mappingTarget.setLastName( userInput.getLastName() );
        }
        if ( userInput.getPassword() != null ) {
            mappingTarget.setPassword( userInput.getPassword() );
        }
        if ( userInput.getEmail() != null ) {
            mappingTarget.setEmail( userInput.getEmail() );
        }
        if ( userInput.getEnabled() != null ) {
            mappingTarget.setEnabled( userInput.getEnabled() );
        }
    }

    protected void technicianDetailsToTechnician1(TechnicianDetails technicianDetails, Technician mappingTarget) {
        if ( technicianDetails == null ) {
            return;
        }

        if ( technicianDetails.getId() != null ) {
            mappingTarget.setId( technicianDetails.getId() );
        }
        if ( technicianDetails.getUser() != null ) {
            if ( mappingTarget.getUser() == null ) {
                mappingTarget.setUser( new User() );
            }
            userInputToUser1( technicianDetails.getUser(), mappingTarget.getUser() );
        }
    }
}
