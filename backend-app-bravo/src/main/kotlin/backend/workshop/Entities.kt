/**
 * @author: ArnoldG6
 * @author: Angelo0512
 * @author: AraR11
 * @author: Haxiz
 * @version 1.0
 * This file contains the required entities' data classes for workshop's app server.
 */

package backend.workshop

import java.util.*
import javax.persistence.*

/*
*Vehicle class contains the most specific vehicle information that is required
*for the workshop's logic.
*/
@Entity
data class Vehicle(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?,
    var plateNumber: String,
    var vinNumber: String,
    var motorType: String,
    var vehicleClass: String,
    var motorSerial: String,
    var brand: String,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vehicle) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Vehicle(id=$id, plate Number='$plateNumber', vin number='$vinNumber', " +
                "motor type='$motorType', vehicle class='$vehicleClass', motor serial='$motorSerial'," +
                " brand='$brand')"
    }
}

@Entity
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?,
    var name: String,
    var email: String,
    var telephone: Int,
    @OneToMany
    @JoinColumn(referencedColumnName = "id")
    var vehiclesList: List<Vehicle>,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Client) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Client(id=$id, name='$name', email='$email', telephone=$telephone, vehiclesList=$vehiclesList)"
    }
}

enum class Status {
    ACTIVO, COMPLETO, INCOMPLETO, RETIRO_PENDIENTE
}

@Entity
data class Service(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int?,
    var observations: String,
    var state: Status,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Service) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Service(id=$id, observations='$observations', state='$state')"
    }
}

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    var firstName: String,
    var lastName: String,
    var password: String,
    var email: String,
    var createDate: Date,
    var enabled: Boolean?,
    var tokenExpired: Boolean?,
    // Entity Relationship
    @ManyToMany
    @JoinTable(
        name = "USER_ROLE",
        joinColumns = [JoinColumn(name = "USER_ID", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "ROLE_ID", referencedColumnName = "id")]
    )
    var roleList: Set<Role>,

    ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is User) return false

        if (id != other.id) return false
        if (email != other.email) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + email.hashCode()
        return result
    }

    override fun toString(): String {
        return "User(id=$id, firstName='$firstName', lastName='$lastName', password='$password', email='$email', createDate=$createDate, enabled=$enabled, tokenExpired=$tokenExpired, roleList=$roleList)"
    }
}

@Entity
data class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    var name: String,
    // Entity Relationship
    @ManyToMany
    @JoinTable(
        name = "ROLE_PRIVILEGE",
        joinColumns = [JoinColumn(name = "ROLE_ID", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "PRIVILEGE_ID", referencedColumnName = "id")]
    )
    var privilegeList: Set<Privilege>,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Role) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Role(id=$id, name='$name', privilegeList=$privilegeList)"
    }

}

@Entity
data class Privilege(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    var name: String,
    // Entity Relationship
    @ManyToMany(mappedBy = "ROLELIST", fetch = FetchType.LAZY)
    var userList: Set<User>,
    @ManyToMany(mappedBy = "PRIVILEGELIST", fetch = FetchType.LAZY)
    var roleList: Set<Role>,

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Privilege) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Privilege(id=$id, name='$name', userList=$userList, roleList=$roleList)"
    }
}

/*
* Report class contains information about the Client, Vehicle and Service(s) in order to relate them for future
consulting about Service(s) current states, and other important actions that need to be done with the related classes.
*/
@Entity
data class Report(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?,
    @Temporal(TemporalType.DATE)
    var creationDate: Date,
    var description: String,
    @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    var servicesList: List<Service>,
    @OneToOne(cascade = [(CascadeType.ALL)], optional = false)
    @JoinColumn(referencedColumnName = "id")
    var client: Client,
    @OneToOne(cascade = [(CascadeType.ALL)], optional = false)
    @JoinColumn(referencedColumnName = "id")
    var vehicle: Vehicle,
    @OneToOne(cascade = [(CascadeType.ALL)], optional = false)
    @JoinColumn(referencedColumnName = "id")
    var technician: Technician,
    ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Report) return false
        if (id != other.id) return false
        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Report(id=$id, creationDate=$creationDate, description='$description', servicesList=$servicesList, client=$client, vehicle=$vehicle, technician=$technician)"
    }

}

@Entity
class Technician (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?,
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    var user: User,
    private var password: String,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Technician) return false
        if (id != other.id) return false
        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Technician(id=$id, user=$user, password='$password')"
    }
}
