package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lbackend/workshop/AbstractClientService;", "Lbackend/workshop/ClientService;", "clientRepository", "Lbackend/workshop/ClientRepository;", "clientMapper", "Lbackend/workshop/ClientMapper;", "(Lbackend/workshop/ClientRepository;Lbackend/workshop/ClientMapper;)V", "getClientMapper", "()Lbackend/workshop/ClientMapper;", "getClientRepository", "()Lbackend/workshop/ClientRepository;", "create", "Lbackend/workshop/UserResult;", "userInput", "Lbackend/workshop/UserInput;", "findAll", "", "findById", "id", "", "backend-app-bravo"})
@org.springframework.stereotype.Service()
public class AbstractClientService implements backend.workshop.ClientService {
    @org.jetbrains.annotations.NotNull()
    private final backend.workshop.ClientRepository clientRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final backend.workshop.ClientMapper clientMapper = null;
    
    public AbstractClientService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    backend.workshop.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    backend.workshop.ClientMapper clientMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public backend.workshop.ClientRepository getClientRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public backend.workshop.ClientMapper getClientMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<backend.workshop.UserResult> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public backend.workshop.UserResult findById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public backend.workshop.UserResult create(@org.jetbrains.annotations.NotNull()
    backend.workshop.UserInput userInput) {
        return null;
    }
}