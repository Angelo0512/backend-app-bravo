package backend.workshop

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("\${url.vehicles}")
class VehicleController(private val vehicleService: VehicleService) {

    @GetMapping
    @ResponseBody
    fun findAll() = vehicleService.findAll()

    @GetMapping("/id/{id}")
    @ResponseBody
    fun findById(@PathVariable id: Long) = vehicleService.findById(id)

    @GetMapping("/plate/{plate}")
    @ResponseBody
    fun findByPlateNumber(@PathVariable plate: String) = vehicleService.findByPlateNumber(plate)

    @GetMapping("/vin/{vin}")
    @ResponseBody
    fun findByVinNumber(@PathVariable vin: String) = vehicleService.findByVinNumber(vin)

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun create(@RequestBody vehicleInput: VehicleInput): VehicleResult? {
        return vehicleService.create(vehicleInput)
    }
}