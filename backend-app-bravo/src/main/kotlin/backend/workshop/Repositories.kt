package backend.workshop

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository: JpaRepository<Client, Long>

@Repository
interface PrivilegeRepository: JpaRepository<Privilege, Long>

@Repository
interface ReportRepository: JpaRepository<Report, Long>

@Repository
interface RoleRepository: JpaRepository<Role, Long>

@Repository
interface ServiceRepository: JpaRepository<Service, Long>

@Repository
interface TechnicianRepository: JpaRepository<Technician, Long>

@Repository
interface UserRepository: JpaRepository<User, Long>

@Repository
interface VehicleRepository: JpaRepository<Vehicle, Long>{
    fun findByPlateNumber(@Param("plateNumber") plateNumber : String)
    fun findByVinNumber(@Param("vinNumber") vinNumber : String)
}
