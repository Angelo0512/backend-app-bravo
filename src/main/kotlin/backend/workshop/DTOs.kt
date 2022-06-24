package backend.workshop

import java.util.*

data class PrivilegeDetails(
    var id: Long? = null,
    var name: String? = null,
)

data class RoleDetails(
    var id: Long? = null,
    var name: String? = null,
    var privileges: List<PrivilegeDetails>? = null,
)

data class UserLoginInput(
    var email: String ="",
    var password: String ="",
)

data class UserInput(
    var id: Long? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var email: String? = null,
    var password: String? = null,
    var enabled: Boolean? = null,
    var roles: List<RoleDetails>? = null,
)

data class UserResult(
    var id: Long?,
    var firstName: String?,
    var lastName: String?,
    var email: String?,
    var password: String?,
    var enabled: Boolean?,
    var tokenExpired: Boolean?,
    var createDate: Date?,
    var roles: List<RoleDetails>?,
)

data class UserBasic(
    var id: Long?,
    var firstName: String?,
    var lastName: String?,
    var email: String?,
    var createDate: Date?,
)


data class VehicleSearchInput(
    var plateNumber: String? = null,
    var vinNumber: String? = null
)

data class VehicleInput(
    var id: Long? = null,
    var plateNumber: String? = null,
    var vinNumber: String? = null,
    var brand: String? = null,
    var motorSerial: String? = null,
    var vehicleClass: String? = null,
    var motorType: String? = null,
)

data class VehicleResult(
    var id: Long?,
    var plateNumber: String?,
    var vinNumber: String?,
    var brand: String?,
    var motorSerial: String?,
    var vehicleClass: String?,
    var motorType: String?,
)

data class ServiceInput(
    var id: Long? = null,
    var name: String? = null,
    var observations: String? = null,
    var state: Status? = null,
)

data class ServiceResult(
    var id: Long,
    var name: String,
    var observations: String?,
    var state: Status,
)

data class ServiceDataResult(
    var id: Long,
    var name: String,
)

data class TechnicianDetails(
    var id: Long? = null,
    var user: UserInput? = null,
)

data class ReportInput(
    var id: Long? = null,
    var creationDate: Date? = null,
    var description: String? = null,
    var services: List<ServiceInput>? = null,
    var client: UserBasic? = null,
    var vehicle: VehicleInput? = null,
    var technician: UserBasic? = null,
)

data class ReportResult(
    var id: Long?,
    var creationDate: Date?,
    var description: String?,
    var services: List<Service>?,
    var client: UserBasic?,
    var vehicle: VehicleResult?,
    var technician: UserBasic?
)
