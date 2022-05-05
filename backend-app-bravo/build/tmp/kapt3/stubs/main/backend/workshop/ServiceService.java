package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lbackend/workshop/ServiceService;", "", "create", "Lbackend/workshop/ServiceResult;", "serviceInput", "Lbackend/workshop/ServiceInput;", "findAll", "", "findById", "id", "", "findByState", "s", "", "backend-app-bravo"})
public abstract interface ServiceService {
    
    @org.jetbrains.annotations.Nullable()
    public abstract backend.workshop.ServiceResult findById(long id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<backend.workshop.ServiceResult> findAll();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<backend.workshop.ServiceResult> findByState(@org.jetbrains.annotations.NotNull()
    java.lang.String s);
    
    @org.jetbrains.annotations.Nullable()
    public abstract backend.workshop.ServiceResult create(@org.jetbrains.annotations.NotNull()
    backend.workshop.ServiceInput serviceInput);
}