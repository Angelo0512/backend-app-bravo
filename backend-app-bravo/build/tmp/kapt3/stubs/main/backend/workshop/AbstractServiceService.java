package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lbackend/workshop/AbstractServiceService;", "Lbackend/workshop/ServiceService;", "serviceRepository", "Lbackend/workshop/ServiceRepository;", "serviceMapper", "Lbackend/workshop/ServiceMapper;", "(Lbackend/workshop/ServiceRepository;Lbackend/workshop/ServiceMapper;)V", "getServiceMapper", "()Lbackend/workshop/ServiceMapper;", "getServiceRepository", "()Lbackend/workshop/ServiceRepository;", "findAll", "", "Lbackend/workshop/ServiceResult;", "findById", "id", "", "findByState", "s", "", "backend-app-bravo"})
@org.springframework.stereotype.Service()
public class AbstractServiceService implements backend.workshop.ServiceService {
    @org.jetbrains.annotations.NotNull()
    private final backend.workshop.ServiceRepository serviceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final backend.workshop.ServiceMapper serviceMapper = null;
    
    public AbstractServiceService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    backend.workshop.ServiceRepository serviceRepository, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    backend.workshop.ServiceMapper serviceMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public backend.workshop.ServiceRepository getServiceRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public backend.workshop.ServiceMapper getServiceMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<backend.workshop.ServiceResult> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public backend.workshop.ServiceResult findById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<backend.workshop.ServiceResult> findByState(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
}