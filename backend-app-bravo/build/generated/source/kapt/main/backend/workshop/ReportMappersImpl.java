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
    date = "2022-05-05T14:09:11-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.15 (Amazon.com Inc.)"
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
        User client = null;
        Vehicle vehicle = null;
        User technician = null;

        if ( reportInput.getCreationDate() != null ) {
            creationDate = reportInput.getCreationDate();
        }
        else {
            creationDate = new java.util.Date();
        }
        id = reportInput.getId();
        description = reportInput.getDescription();
        client = reportInput.getClient();
        vehicle = vehicleInputToVehicle( reportInput.getVehicle() );
        technician = technicianDetailsToUser( reportInput.getTechnician() );

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
        User client = null;
        VehicleResult vehicle = null;

        if ( report.getId() != null ) {
            id = report.getId();
        }
        creationDate = report.getCreationDate();
        description = report.getDescription();
        client = report.getClient();
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
            report.setClient( dto.getClient() );
        }
        if ( dto.getVehicle() != null ) {
            if ( report.getVehicle() == null ) {
                report.setVehicle( new Vehicle() );
            }
            vehicleInputToVehicle1( dto.getVehicle(), report.getVehicle() );
        }
        if ( dto.getTechnician() != null ) {
            if ( report.getTechnician() == null ) {
                report.setTechnician( new User() );
            }
            technicianDetailsToUser1( dto.getTechnician(), report.getTechnician() );
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

    protected User technicianDetailsToUser(TechnicianDetails technicianDetails) {
        if ( technicianDetails == null ) {
            return null;
        }

        Long id = null;

        id = technicianDetails.getId();

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

    protected void technicianDetailsToUser1(TechnicianDetails technicianDetails, User mappingTarget) {
        if ( technicianDetails == null ) {
            return;
        }

        if ( technicianDetails.getId() != null ) {
            mappingTarget.setId( technicianDetails.getId() );
        }
    }
}
