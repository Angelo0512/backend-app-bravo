package backend.workshop;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H&\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lbackend/workshop/ClientMapper;", "", "clientInputToClient", "Lbackend/workshop/User;", "clientInput", "error/NonExistentClass", "(Lerror/NonExistentClass;)Lbackend/workshop/User;", "clientListToClientListResult", "", "clientList", "clientToClientResult", "client", "(Lbackend/workshop/User;)Lerror/NonExistentClass;", "backend-app-bravo"})
public abstract interface ClientMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract backend.workshop.User clientInputToClient(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass clientInput);
    
    @org.jetbrains.annotations.NotNull()
    public abstract error.NonExistentClass clientToClientResult(@org.jetbrains.annotations.NotNull()
    backend.workshop.User client);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<error.NonExistentClass> clientListToClientListResult(@org.jetbrains.annotations.NotNull()
    java.util.List<backend.workshop.User> clientList);
}