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
@Table(name = "vehicle")
data class Vehicle(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?,
    @Column(name = "plate_number")
    var plateNumber: String,
    @Column(name = "vin_number")
    var vinNumber: String,
    @Column(name = "motor_type")
    var motorType: String,
    @Column(name = "vehicle_class")
    var vehicleClass: String,
    @Column(name = "motor_serial")
    var motorSerial: String,
    var brand: String,
    /*@ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    var client: Client,*/
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


enum class Status {
    ACTIVO, COMPLETO, INCOMPLETO, RETIRO_PENDIENTE
}

@Entity
@Table(name = "service")
data class Service(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?,
    var name: String,
    var observations: String?,
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
        return "Service(id=$id, name='$name', observations='$observations', state='$state')"
    }
}

@Entity
@Table(name = "service_data")
data class ServiceData(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?,
    var name: String,
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
        return "Service(id=$id, name='$name')"
    }
}

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    @Column(name = "first_name")
    var firstName: String,
    @Column(name = "last_name")
    var lastName: String,
    var password: String?,
    var email: String,
    @Column(name = "create_date")
    var createDate: Date,
    var enabled: Boolean,
    @Column(name = "token_expired")
    var tokenExpired: Boolean?,
    // Entity Relationship
    @ManyToMany
    @JoinTable(
        name = "USER_ROLE",
        joinColumns = [JoinColumn(name = "USER_ID", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "ROLE_ID", referencedColumnName = "id")]
    )
    var roleList: Set<Role>?,

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
@Table(name = "role")
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
    var privilegeList: Set<Privilege>?,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Role) return false
        other as Role
        if (name == other.name) return false

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
@Table(name = "privilege")
data class Privilege(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    var name: String,
    // Entity Relationship
    @ManyToMany(mappedBy = "roleList", fetch = FetchType.LAZY)
    var userList: Set<User>,
    @ManyToMany(mappedBy = "privilegeList", fetch = FetchType.LAZY)
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
@Table(name = "report")
data class Report(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?,
    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date")
    var creationDate: Date,
    var description: String,
    @ManyToMany
    @JoinTable(
        name = "report_services",
        joinColumns = [JoinColumn(name = "report_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "service_id", referencedColumnName = "id")]
    )
    var servicesList: List<Service>?,
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    var client: User,
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    var vehicle: Vehicle,
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    var technician: User,
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
