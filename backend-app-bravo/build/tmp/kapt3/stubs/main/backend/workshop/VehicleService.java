package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\rH&\u00a8\u0006\u0010"}, d2 = {"Lbackend/workshop/VehicleService;", "", "create", "Lbackend/workshop/VehicleResult;", "vehicleInput", "Lbackend/workshop/VehicleInput;", "findAll", "", "findById", "id", "", "findByPlateNumber", "plateNumber", "", "findByVinNumber", "vinNumber", "backend-app-bravo"})
public abstract interface VehicleService {
    
    /**
     * Find all the Vehicles
     *
     * @return a list of Vehicles
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<backend.workshop.VehicleResult> findAll();
    
    /**
     * Find a specific Vehicle via ID
     *
     * @param id of the Vehicle
     * @return the Vehicle found
     */
    @org.jetbrains.annotations.Nullable()
    public abstract backend.workshop.VehicleResult findById(long id);
    
    /**
     * Find a specific Vehicle via Plate Number
     *
     * @param plate number of the Vehicle
     * @return the Vehicle found
     */
    @org.jetbrains.annotations.Nullable()
    public abstract backend.workshop.VehicleResult findByPlateNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String plateNumber);
    
    /**
     * Find a specific Vehicle via Vin Number
     *
     * @param vinNumber of the Vehicle
     * @return the Vehicle found
     */
    @org.jetbrains.annotations.Nullable()
    public abstract backend.workshop.VehicleResult findByVinNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String vinNumber);
    
    /**
     * Save and Flush a Vehicle entity in the database
     *
     * @param vehicleInput
     * @return the Vehicle created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract backend.workshop.VehicleResult create(@org.jetbrains.annotations.NotNull()
    backend.workshop.VehicleInput vehicleInput);
}