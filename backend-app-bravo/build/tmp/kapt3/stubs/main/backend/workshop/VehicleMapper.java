package backend.workshop;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0003H\'J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\u0011"}, d2 = {"Lbackend/workshop/VehicleMapper;", "", "vehicleInputToVehicle", "Lbackend/workshop/Vehicle;", "vehicleInput", "Lbackend/workshop/VehicleInput;", "", "dto", "vehicle", "vehicleListToVehicleListResult", "", "Lbackend/workshop/VehicleResult;", "vehicleList", "vehicleSearchInputToVehicle", "vehicleSearchInput", "Lbackend/workshop/VehicleSearchInput;", "vehicleToVehicleResult", "backend-app-bravo"})
public abstract interface VehicleMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract backend.workshop.Vehicle vehicleInputToVehicle(@org.jetbrains.annotations.NotNull()
    backend.workshop.VehicleInput vehicleInput);
    
    @org.jetbrains.annotations.NotNull()
    public abstract backend.workshop.VehicleResult vehicleToVehicleResult(@org.jetbrains.annotations.NotNull()
    backend.workshop.Vehicle vehicle);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<backend.workshop.VehicleResult> vehicleListToVehicleListResult(@org.jetbrains.annotations.NotNull()
    java.util.List<backend.workshop.Vehicle> vehicleList);
    
    @org.jetbrains.annotations.NotNull()
    public abstract backend.workshop.Vehicle vehicleSearchInputToVehicle(@org.jetbrains.annotations.NotNull()
    backend.workshop.VehicleSearchInput vehicleSearchInput);
    
    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
    public abstract void vehicleInputToVehicle(@org.jetbrains.annotations.NotNull()
    backend.workshop.VehicleInput dto, @org.jetbrains.annotations.NotNull()
    @org.mapstruct.MappingTarget()
    backend.workshop.Vehicle vehicle);
}