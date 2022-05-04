package backend.workshop;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lbackend/workshop/ServiceMappers;", "", "serviceInputToService", "Lbackend/workshop/Service;", "serviceInput", "Lbackend/workshop/ServiceInput;", "serviceListToServiceListResult", "", "Lbackend/workshop/ServiceResult;", "serviceList", "serviceToServiceResult", "service", "backend-app-bravo"})
public abstract interface ServiceMappers {
    
    @org.jetbrains.annotations.NotNull()
    public abstract backend.workshop.Service serviceInputToService(@org.jetbrains.annotations.NotNull()
    backend.workshop.ServiceInput serviceInput);
    
    @org.jetbrains.annotations.NotNull()
    public abstract backend.workshop.ServiceResult serviceToServiceResult(@org.jetbrains.annotations.NotNull()
    backend.workshop.Service service);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<backend.workshop.ServiceResult> serviceListToServiceListResult(@org.jetbrains.annotations.NotNull()
    java.util.List<backend.workshop.Service> serviceList);
}