package backend.workshop;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-05T14:01:25-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.15 (Amazon.com Inc.)"
)
@Component
public class VehicleMapperImpl implements VehicleMapper {

    @Override
    public Vehicle vehicleInputToVehicle(VehicleInput vehicleInput) {
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

    @Override
    public VehicleResult vehicleToVehicleResult(Vehicle vehicle) {
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

    @Override
    public List<VehicleResult> vehicleListToVehicleListResult(List<Vehicle> vehicleList) {
        if ( vehicleList == null ) {
            return null;
        }

        List<VehicleResult> list = new ArrayList<VehicleResult>( vehicleList.size() );
        for ( Vehicle vehicle : vehicleList ) {
            list.add( vehicleToVehicleResult( vehicle ) );
        }

        return list;
    }

    @Override
    public Vehicle vehicleSearchInputToVehicle(VehicleSearchInput vehicleSearchInput) {
        if ( vehicleSearchInput == null ) {
            return null;
        }

        String plateNumber = null;
        String vinNumber = null;

        plateNumber = vehicleSearchInput.getPlateNumber();
        vinNumber = vehicleSearchInput.getVinNumber();

        Long id = null;
        String motorType = null;
        String vehicleClass = null;
        String motorSerial = null;
        String brand = null;

        Vehicle vehicle = new Vehicle( id, plateNumber, vinNumber, motorType, vehicleClass, motorSerial, brand );

        return vehicle;
    }

    @Override
    public void vehicleInputToVehicle(VehicleInput dto, Vehicle vehicle) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            vehicle.setId( dto.getId() );
        }
        if ( dto.getPlateNumber() != null ) {
            vehicle.setPlateNumber( dto.getPlateNumber() );
        }
        if ( dto.getVinNumber() != null ) {
            vehicle.setVinNumber( dto.getVinNumber() );
        }
        if ( dto.getMotorType() != null ) {
            vehicle.setMotorType( dto.getMotorType() );
        }
        if ( dto.getVehicleClass() != null ) {
            vehicle.setVehicleClass( dto.getVehicleClass() );
        }
        if ( dto.getMotorSerial() != null ) {
            vehicle.setMotorSerial( dto.getMotorSerial() );
        }
        if ( dto.getBrand() != null ) {
            vehicle.setBrand( dto.getBrand() );
        }
    }
}
