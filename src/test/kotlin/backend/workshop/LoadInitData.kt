package backend.workshop

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.jdbc.Sql

@SpringBootTest
@Sql("/import-database.sql")
/**
 * This class will load the initial data into the database
 */
class LoadInitData (
    @Autowired
    val userRepository: UserRepository,

    @Autowired
    val vehicleRepository: VehicleRepository,

    @Autowired
    val serviceRepository: ServiceRepository,

    @Autowired
    val reportRepository: ReportRepository,

    ) {

    @Test
    fun testFindAll() {
        val userList: List<User> = userRepository.findAll()
        val vehicleList: List<Vehicle> = vehicleRepository.findAll()
        val serviceList: List<Service> = serviceRepository.findAll()
        val reportList: List<Report> = reportRepository.findAll()

        Assertions.assertAll("Import database test",
            { Assertions.assertTrue(userList.size == 6) },
            { Assertions.assertTrue(vehicleList.size == 2) },
            { Assertions.assertTrue(serviceList.size == 3) },
            { Assertions.assertTrue(reportList.size == 2) }
        )
    }
}