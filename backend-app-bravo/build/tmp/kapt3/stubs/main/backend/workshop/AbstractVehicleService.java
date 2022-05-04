package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lbackend/workshop/AbstractVehicleService;", "Lbackend/workshop/VehicleService;", "vehicleRepository", "Lbackend/workshop/VehicleRepository;", "vehicleMapper", "Lbackend/workshop/VehicleMapper;", "(Lbackend/workshop/VehicleRepository;Lbackend/workshop/VehicleMapper;)V", "getVehicleMapper", "()Lbackend/workshop/VehicleMapper;", "getVehicleRepository", "()Lbackend/workshop/VehicleRepository;", "findAll", "", "Lbackend/workshop/VehicleResult;", "findById", "id", "", "backend-app-bravo"})
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
}