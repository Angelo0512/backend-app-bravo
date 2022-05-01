package backend.workshop

import java.util.*

data class PrivilegeDetails(
    var id:Long? = null,
    var name:String? = null,
)

data class RoleDetails(
    var id:Long? = null,
    var name:String? = null,
    var privileges: List<PrivilegeDetails>? = null,
)

data class UserLoginInput(
    var email:String,
    var password:String,
)

data class UserInput(
    var id:Long? = null,
    var firstName:String? = null,
    var lastName:String? = null,
    var email:String? = null,
    var password:String? = null,
    var enabled:Boolean? = null,
    var roles:List<RoleDetails>? = null,
)

data class UserResult(
    var id:Long,
    var firstName:String,
    var lastName:String,
    var email:String,
    var password:String,
    var enabled:Boolean?,
    var tokenExpired:Boolean?,
    var createDate:Date,
    var roles:List<RoleDetails>,
)

data class VehicleInput(
    var id:Long? = null,
    var plateNumbre:String? = null,
    var vinNumber:String? = null,
    var brand:String? = null,
    var motorSerial:String? = null,
    var vechicleClass:String? = null,
    var motorType:String? = null,
)

data class VehicleResult(
    var id:Long,
    var plateNumbre:String,
    var vinNumber:String,
    var brand:String,
    var motorSerial:String,
    var vechicleClass:String,
    var motorType:String,
)

data class ClientInput(
    var id:Long? = null,
    var name:String? = null,
    var email:String? = null,
    var telephone:Int? = null,
    var vehicles:List<VehicleInput>? = null,
)

data class ClientResult(
    var id:Long,
    var name:String,
    var email:String,
    var telephone:Int,
    var vehicles:List<VehicleInput>,
)
