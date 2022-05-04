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

    fun userInputToUser(
        userInput: UserInput,
    ): User

    fun userLoginInputToUser(
        userLoginInput: UserLoginInput,
    ): User

    fun userToUserResult(
        user: User,
    ): UserResult

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    fun userInputToUser(dto: UserInput, @MappingTarget user: User)
}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface VehicleMapper {
    fun vehicleInputToVehicle(
        vehicleInput: VehicleInput,
    ): Vehicle

    fun vehicleToVehicleResult(
        vehicle: Vehicle,
    ): VehicleResult

    fun vehicleListToVehicleListResult(
        vehicleList: List<Vehicle>,
    ): List<VehicleResult>

    fun vehicleSearchInputToVehicle(
        vehicleSearchInput: VehicleSearchInput,
    ): Vehicle

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    fun vehicleInputToVehicle(dto: VehicleInput, @MappingTarget vehicle: Vehicle)
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
    ): List<ClientResult>

}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface ServiceMappers {
    fun serviceInputToService(
        serviceInput: ServiceInput,
    ): Service

    fun serviceToServiceResult(
        service: Service,
    ): ServiceResult

    fun serviceListToServiceListResult(
        serviceList: List<Service>,
    ): List<ServiceResult>

}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface TechnicianMappers {
    fun technicianToTechnicianDetails(
        technician: Technician?,
    ): TechnicianDetails
}

@Mapper(
    imports = [LocalDateTime::class],
    componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE
)
interface ReportMappers {

    @Mapping(target = "creationDate", defaultExpression = "java(new java.util.Date())")
    fun reportInputToReport(
        reportInput: ReportInput,
    ): Report

    fun reportToReportResult(
        report: Report,
    ): ReportResult

    fun reportListToReportListResult(
        reportList: List<Report>,
    ): List<ReportResult>

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    fun reportInputToReport(dto: ReportInput, @MappingTarget report: Report)
}