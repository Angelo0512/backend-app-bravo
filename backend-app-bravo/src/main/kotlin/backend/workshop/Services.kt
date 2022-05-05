package backend.workshop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


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
    fun findByVinNumber(vinNumber: String): VehicleResult?
    /**
     * Find a specific Vehicle via Owner ID
     *
     * @param id of the Owner
     * @return the Vehicle found
     */
    fun findByOwner(id: String): VehicleResult?

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
            ?: throw NoSuchElementException(String.format("The Priority with the id: %s not found!", id))
        return vehicleMapper.vehicleToVehicleResult(priority)
    }

    @Throws(NoSuchElementException::class)
    override fun findByPlateNumber(plateNumber: String): VehicleResult? {
        val priority: Vehicle = vehicleRepository.findByPlateNumber(plateNumber).orElse(null)
            ?: throw NoSuchElementException(String.format("The plate number %s was not found!", plateNumber))
        return vehicleMapper.vehicleToVehicleResult(priority)
    }

    @Throws(NoSuchElementException::class)
    override fun findByVinNumber(vinNumber: String): VehicleResult? {
        val priority: Vehicle = vehicleRepository.findByVinNumber(vinNumber).orElse(null)
            ?: throw NoSuchElementException(String.format("The VIN Number %s was not found!", vinNumber))
        return vehicleMapper.vehicleToVehicleResult(priority)
    }
    override fun findByOwner(id: String): VehicleResult? {
        TODO("Not yet implemented")
    }

    override fun create(vehicleInput: VehicleInput): VehicleResult? {
        val vehicle: Vehicle = vehicleMapper.vehicleInputToVehicle(vehicleInput)
        return vehicleMapper.vehicleToVehicleResult(
            vehicleRepository.save(vehicle)
        )
    }
}

interface ClientService {
    /**
     * Find all the Vehicles
     *
     * @return a list of Vehicles
     */
    fun findAll(): List<ClientResult>?

    /**
     * Find a specific Vehicle via ID
     *
     * @param id of the Vehicle
     * @return the Vehicle found
     */
    fun findById(id: Long): ClientResult?

    /**
     * Save and Flush a Vehicle entity in the database
     *
     * @param vehicleInput
     * @return the Vehicle created
     */
    fun create(clientInput: ClientInput): ClientResult?
}

@Service
class AbstractClientService(
    @Autowired
    val clientRepository: ClientRepository,

    @Autowired
    val clientMapper: ClientMapper,

    ) : ClientService {

    override fun findAll(): List<ClientResult>? {
        return clientMapper.clientListToClientListResult(
            clientRepository.findAll()
        )
    }

    override fun findById(id: Long): ClientResult? {
        TODO("Not yet implemented")
    }

    override fun create(clientInput: ClientInput): ClientResult? {
        TODO("Not yet implemented")
    }

}