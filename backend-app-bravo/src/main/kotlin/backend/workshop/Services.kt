package backend.workshop
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*



interface VehicleService {
    fun findAll(): List<VehicleResult>?
    fun findById(id: Long): VehicleResult?
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
            ?: throw NoSuchElementException(String.format("The Priority with the id: %s not found!", id))
        return vehicleMapper.vehicleToVehicleResult(priority)
    }
}

