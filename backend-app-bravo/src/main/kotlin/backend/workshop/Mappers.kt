package backend.workshop

import org.mapstruct.*
import java.time.LocalDateTime

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface RoleMapper {
    fun roleToRoleDetails(
        role: Role?,
    ): RoleDetails
}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface PrivilegeMapper {
    fun privilegeToPrivilegeDetails(
        privilege: Privilege?,
    ): PrivilegeDetails
}

@Mapper(
    imports = [LocalDateTime::class],
    componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE
)
interface UserMapper {

}
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface VehicleMapper {
    fun vehicleInputToVehicle(
        vehicleInput : VehicleInput,
    ) : Vehicle

    fun vehicleToVehicleResult(
        vehicle: Vehicle,
    ): VehicleResult

    fun vehicleListToVehicleListResult(
        vehicleList: List<Vehicle>,
    ):List<VehicleResult>

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    fun vehicleInputToVehicle(dto: VehicleInput, @MappingTarget vehicle: Vehicle )
}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface ClientMapper {
    fun clientInputToClient(
        clientInput: ClientInput,
    ): Client

    fun clientToClientResult(
        client: Client,
    ): ClientResult

    fun clientListToClientListResult(
        clientList: List<Client>,
    ):List<ClientResult>

}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface ServiceMappers{
    fun serviceInputToService(
        serviceInput: ServiceInput,
    ): Service

    fun clientToClientResult(
        service: Service,
    ): ServiceResult

    fun clientListToClientListResult(
        serviceList: List<Service>,
    ):List<ServiceResult>

}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface TechnicianMappers{
    fun technicianToTechnicianDetails(
        technician: Technician?,
    ): TechnicianDetails
}
