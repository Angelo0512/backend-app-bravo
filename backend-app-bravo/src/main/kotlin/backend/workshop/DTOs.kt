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
