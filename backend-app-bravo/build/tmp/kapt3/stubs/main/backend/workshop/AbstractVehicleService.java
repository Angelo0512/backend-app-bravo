package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lbackend/workshop/AbstractVehicleService;", "Lbackend/workshop/VehicleService;", "vehicleRepository", "Lbackend/workshop/VehicleRepository;", "vehicleMapper", "Lbackend/workshop/VehicleMapper;", "(Lbackend/workshop/VehicleRepository;Lbackend/workshop/VehicleMapper;)V", "getVehicleMapper", "()Lbackend/workshop/VehicleMapper;", "getVehicleRepository", "()Lbackend/workshop/VehicleRepository;", "create", "Lbackend/workshop/VehicleResult;", "vehicleInput", "Lbackend/workshop/VehicleInput;", "findAll", "", "findById", "id", "", "findByOwner", "", "findByPlateNumber", "plateNumber", "findByVinNumber", "vinNumber", "backend-app-bravo"})
@org.springframework.stereotype.Service()
public class AbstractVehicleService implements backend.workshop.VehicleService {
    @org.jetbrains.annotations.NotNull()
    private final backend.workshop.VehicleRepository vehicleRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final backend.workshop.VehicleMapper vehicleMapper = null;
    
    public AbstractVehicleService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    backend.workshop.VehicleRepository vehicleRepository, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    backend.workshop.VehicleMapper vehicleMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public backend.workshop.VehicleRepository getVehicleRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public backend.workshop.VehicleMapper getVehicleMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<backend.workshop.VehicleResult> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public backend.workshop.VehicleResult findById(long id) throws java.util.NoSuchElementException {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public backend.workshop.VehicleResult findByPlateNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String plateNumber) throws java.util.NoSuchElementException {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public backend.workshop.VehicleResult findByVinNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String vinNumber) throws java.util.NoSuchElementException {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public backend.workshop.VehicleResult findByOwner(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public backend.workshop.VehicleResult create(@org.jetbrains.annotations.NotNull()
    backend.workshop.VehicleInput vehicleInput) {
        return null;
    }
}