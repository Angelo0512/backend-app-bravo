package backend.workshop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*
import kotlin.NoSuchElementException
import kotlin.collections.ArrayList


interface VehicleService {
    /**
     * Find all the Vehicles
     *
     * @return a list of Vehicles
     */
    fun findAll(): List<VehicleResult>?

    /**
     * Find a specific Vehicle via ID
     *
     * @param id of the Vehicle
     * @return the Vehicle found
     */
    fun findById(id: Long): VehicleResult?

    /**
     * Find a specific Vehicle via Plate Number
     *
     * @param plate number of the Vehicle
     * @return the Vehicle found
     */
    fun findByPlateNumber(plateNumber: String): VehicleResult?

    /**
     * Find a specific Vehicle via Vin Number
     *
     * @param vinNumber of the Vehicle
     * @return the Vehicle found
     */
    fun findByVinNumber(vinNumber: String): VehicleResult?

    /**
     * Save and Flush a Vehicle entity in the database
     *
     * @param vehicleInput
     * @return the Vehicle created
     */
    fun create(vehicleInput: VehicleInput): VehicleResult?
}

@Service
class AbstractVehicleService(
    @Autowired
    val vehicleRepository: VehicleRepository,

    @Autowired
    val vehicleMapper: VehicleMapper,

    ) : VehicleService {

    override fun findAll(): List<VehicleResult>? {
        return vehicleMapper.vehicleListToVehicleListResult(
            vehicleRepository.findAll()
        )
    }

    @Throws(NoSuchElementException::class)
    override fun findById(id: Long): VehicleResult? {
        val priority: Vehicle = vehicleRepository.findById(id).orElse(null)
            ?: throw NoSuchElementException(String.format("The Priority with the id: %s was not found!", id))
        return vehicleMapper.vehicleToVehicleResult(priority)
    }

    @Throws(NoSuchElementException::class)
    override fun findByPlateNumber(plateNumber: String): VehicleResult? {
        val priority: Vehicle = vehicleRepository.findByPlateNumber(plateNumber)
            ?: throw NoSuchElementException(
                String.format(
                    "The Vehicle with the plate number: %s was not found!",
                    plateNumber
                )
            )
        return vehicleMapper.vehicleToVehicleResult(priority)
    }

    @Throws(NoSuchElementException::class)
    override fun findByVinNumber(vinNumber: String): VehicleResult? {
        val priority: Vehicle = vehicleRepository.findByVinNumber(vinNumber)
            ?: throw NoSuchElementException(
                String.format(
                    "The Vehicle with the vin number: %s was not found!",
                    vinNumber
                )
            )
        return vehicleMapper.vehicleToVehicleResult(priority)
    }

    override fun create(vehicleInput: VehicleInput): VehicleResult? {
        val vehicle: Vehicle = vehicleMapper.vehicleInputToVehicle(vehicleInput)
        return vehicleMapper.vehicleToVehicleResult(
            vehicleRepository.save(vehicle)
        )
    }
}

interface TechnicianService {
    fun findAll(): List<UserResult>?
    fun findById(id: Long): UserResult?
    fun create(userInput: UserInput): UserResult?
}

@Service
class AbstractTechnicianService(
    @Autowired
    val technicianRepository: TechnicianRepository,

    @Autowired
    val technicianMapper: TechnicianMapper,

    ) : TechnicianService {

    override fun findAll(): List<UserResult>? {
        return technicianMapper.technicianListToTechnicianListResult(technicianRepository.findAll())
    }

    override fun findById(id: Long): UserResult? {
        TODO("Not yet implemented")
    }

    override fun create(userInput: UserInput): UserResult? {
        TODO("Not yet implemented")
    }
}

interface ClientService {
    /**
     * Find all the Vehicles
     *
     * @return a list of Vehicles
     */
    fun findAll(): List<UserResult>?

    /**
     * Find a specific Vehicle via ID
     *
     * @param id of the Vehicle
     * @return the Vehicle found
     */
    fun findById(id: Long): UserResult?

    /**
     * Save and Flush a Vehicle entity in the database
     *
     * @param vehicleInput
     * @return the Vehicle created
     */
    fun create(userInput: UserInput): UserResult?
}

@Service
class AbstractClientService(
    @Autowired
    val clientRepository: ClientRepository,

    @Autowired
    val clientMapper: ClientMapper,

    ) : ClientService {

    override fun findAll(): List<UserResult>? {
        return clientMapper.clientListToClientListResult(clientRepository.findAll())
    }

    override fun findById(id: Long): UserResult? {
        TODO("Not yet implemented")
    }

    override fun create(userInput: UserInput): UserResult? {
        TODO("Not yet implemented")
    }
}

interface ServiceService {
    fun findById(id: Long): ServiceResult?
    fun findAll(): List<ServiceResult>?
    fun findByState(s: String): List<ServiceResult>?
    fun create(serviceInput: ServiceInput): ServiceResult?

}

@Service
class AbstractServiceService(
    @Autowired
    val serviceRepository: ServiceRepository,

    @Autowired
    val serviceMapper: ServiceMapper,
) : ServiceService {
    override fun findAll(): List<ServiceResult>? {
        return serviceMapper.serviceListToServiceListResult(serviceRepository.findAll())
    }

    override fun findById(id: Long): ServiceResult? {
        val serv: backend.workshop.Service = serviceRepository.findById(id).orElse(null)
            ?: throw NoSuchElementException(String.format("The service with the id: %s was not found!", id))
        return serviceMapper.serviceToServiceResult(serv)
    }

    override fun findByState(s: String): List<ServiceResult>? {
        if (!backend.workshop.Status.values().contains(backend.workshop.Status.valueOf(s)))
            throw NoSuchElementException(String.format("The status with the value: %s was not found!", s))
        val serv: List<backend.workshop.Service> = serviceRepository.findByState(backend.workshop.Status.valueOf(s))
        return serviceMapper.serviceListToServiceListResult(serv)
    }

    override fun create(serviceInput: ServiceInput): ServiceResult? {
        val service: backend.workshop.Service = serviceMapper.serviceInputToService(serviceInput)
        return serviceMapper.serviceToServiceResult(
            serviceRepository.save(service)
        )
    }
}

interface ReportService {
    fun findById(id: Long): ReportResult?
    fun findAll(): List<ReportResult>?
    fun findByClientId(id: Long): List<ReportResult>
    fun findByVehicleNumberPlate(numberPlate: String): List<ReportResult>
    //fun findByTechnician(s: String): List<ReportResult>?
    //fun findByVehicle(plateNumber: String): List<ReportResult>?
    fun create(reportInput: ReportInput): ReportResult?
}

@Service
class AbstractReportService(
    @Autowired
    val reportRepository: ReportRepository,

    @Autowired
    val reportMapper: ReportMappers,
) : ReportService {
    override fun findById(id: Long): ReportResult? {
        val report: Report = reportRepository.findById(id).orElse(null)
            ?: throw NoSuchElementException(String.format("The Report with the id: %s was not found!", id))
        return reportMapper.reportToReportResult(report)
    }

    override fun findAll(): List<ReportResult>? {
        return reportMapper.reportListToReportListResult(reportRepository.findAll())
    }

    override fun findByClientId(id: Long): List<ReportResult> {
        return reportMapper.reportListToReportListResult(reportRepository.findByClientId(id))
    }

    override fun findByVehicleNumberPlate(numberPlate: String): List<ReportResult> {
        return reportMapper.reportListToReportListResult(reportRepository.findByVehiclePlateNumber(numberPlate))
    }
    override fun create(reportInput: ReportInput): ReportResult? {
        val report : backend.workshop.Report = reportMapper.reportInputToReport(reportInput)
        return reportMapper.reportToReportResult(
            reportRepository.save(report)
        )
    }
}

@Service
@Transactional
class AppUserDetailsService(
    @Autowired
    val userRepository: UserRepository,
    @Autowired
    val roleRepository: RoleRepository,
    @Autowired
    val roleMapper: RoleMapper,
) : UserDetailsService {

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(username: String): UserDetails {
        var userAuth: org.springframework.security.core.userdetails.User
        val user: User = userRepository.findByEmail(username).orElse(null)
            ?: return org.springframework.security.core.userdetails.User(
                "", "", true, true, true, true,
                getAuthorities(Arrays.asList(
                    roleRepository.findByName("ROLE_USER").get())))

        userAuth = org.springframework.security.core.userdetails.User(
            user.email, user.password, user.enabled, true, true,
            true, getAuthorities(user.roleList.toMutableList()))

        return userAuth
    }

    private fun getAuthorities(
        roles: MutableList<Role>,
    ): Collection<GrantedAuthority?>? {
        return getGrantedAuthorities(getPrivileges(roles))
    }

    private fun getPrivileges(roles: MutableList<Role>?): List<String> {
        val privileges: MutableList<String> = ArrayList()
        val collection: MutableList<Privilege> = ArrayList()
        if (roles != null) {
            for (role in roles) {
                collection.addAll(role.privilegeList)
            }
        }
        for (item in collection) {
            privileges.add(item.name)
        }
        return privileges
    }

    private fun getGrantedAuthorities(privileges: List<String>): List<GrantedAuthority?>? {
        val authorities: MutableList<GrantedAuthority?> = ArrayList()
        for (privilege in privileges) {
            authorities.add(SimpleGrantedAuthority(privilege))
        }
        return authorities
    }

}
