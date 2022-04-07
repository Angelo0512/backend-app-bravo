/**
 * @author: ArnoldG6
 * This file contains the required entities data classes for workshop's app server.
 */
package backend.workshop

@Entity
@Table (name = "VEHICLES")
data class Vehicle(
    /*
    *Vehicle class contains the most specific vehicle information that is required
    *for the workshop's logic.
    */
    @Id //Numeric PK for faster indexing.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PK_ID")
    var id: Long,
    @Column(name = "PLATE_NUMBER")
    var plateNumber: String? = null,
    @Column(name = "VIN_NUMBER")
    var vinNumber: String ? = null,
    @Column(name = "MOTOR_TYPE")
    var motorType: String ? = null,
    @Column(name = "VEHICLE_CLASS")
    var vehicleClass: String ? = null,
    @Column(name = "MOTOR_SERIAL")
    var motorSerial: String ? = null,
    @Column(name = "BRAND")
    var brand: String ? = null,
    /*@OneToOne(fetch = FetchType.LAZY)
    @MapsId
    var report: Report ? = null,
    @ManyToOne
    @JoinColumn(name="CLIENT_ID", nullable = false, referencedColumnName = "PK_ID")
    var client: Client,*/
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Task) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Vehicle(id=$id, plate Number='$plateNumber', vin number='$vinNumber', " +
                "motor type=$motorType, vehicle class=$vehicleClass, motor serial=$motorSerial," +
                " brand=$brand)"
    }
}

@Entity
@Table(name = "CLIENTS")
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column("PK_ID")
    var id: Long,
    @Column("NAME")
    var name: String? = null,
    @Column("EMAIL")
    var email: String? = null,
    @Column("TELEPHONE")
    var telephone: Int = null,
    /*@OneToMany(mappedBy = "CLIENTS")
    var vehiclesList: List<Vehicle>,*/
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Task) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Client(id=$id, name='$name', email='$email', ", "telephone=$telephone)"
    }
}
@Entity
@Table(name= "SERVICES")
data class Service(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column("PK_ID")
    var id: Int? = null,
    @Column("OBSERVATION")
    var observation: String? = null,
    @Column("STATE")
    var state: String? = null,
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Task) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Service(id=$id, observation='$observation', state='$state')"
    }
}
@Entity
@Table(name = "USERS")
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
        return "User(id=$id, firstName='$firstName', lastName='$lastName', password='$password', email='$email', createDate=$createDate, enabled=$enabled, tokenExpired=$tokenExpired, taskList=$taskList, roleList=$roleList)"
    }
    @Entity
    @Table(name = "ROLE")
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
}

@Entity
@Table(name = "PRIVILEGE")
data class Privilege(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Long? = null,
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