/**
 * @author: ArnoldG6
 * This file contains the required entities data classes for workshop's app server.
 */
package backend.workshop

@Entity
@Table (name = "VEHICLE")
data class Vehicle(
    /*
    *Vehicle class contains the most specific vehicle information that is required
    *for the workshop's logic.
    */
    @Id //Numeric PK for faster indexing.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PK_ID")
    var id Long ? = null,
    @Column(name = "PLATE_NUMBER")
    var plateNumber: String? = null,
    @Column(name = "VIN_NUMBER")
    var vinNumber: String ? = null,
    @Column(name = "MOTOR_TYPE")
    var motorType: String ? = null,
    @Column(name = "VEHICLE_CLASS")
    var vehicleClass: String ? = null,
){

}