package backend.workshop

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.data.repository.query.Param
import java.util.*

@Repository
interface ClientRepository: JpaRepository<User, Long>


@Repository
interface PrivilegeRepository: JpaRepository<Privilege, Long>

@Repository
interface ReportRepository: JpaRepository<Report, Long>{
    fun findByClientId (@Param("id") id: Long):  List<Report>
    fun findByVehiclePlateNumber(@Param("plateNumber") plateNumber: String): List<Report>
}

@Repository
interface RoleRepository: JpaRepository<Role, Long>{
    fun findByName (@Param("name") name : String) : Optional<Role>
}

@Repository
interface ServiceRepository: JpaRepository<Service, Long>{
    fun findByState(@Param("state") state: backend.workshop.Status): List<backend.workshop.Service>
}

@Repository
interface TechnicianRepository: JpaRepository<User, Long>

@Repository
interface UserRepository: JpaRepository<User, Long>{
    fun findByEmail(@Param("email") email : String) : Optional<User>
}

@Repository
interface VehicleRepository: JpaRepository<Vehicle, Long>{
    fun findByPlateNumber(@Param("plateNumber") plateNumber : String): Vehicle?
    fun findByVinNumber(@Param("vinNumber") vinNumber : String): Vehicle?
}
