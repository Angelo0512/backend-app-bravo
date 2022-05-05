package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lbackend/workshop/ClientService;", "", "create", "Lbackend/workshop/ClientResult;", "clientInput", "Lbackend/workshop/ClientInput;", "findAll", "", "findById", "id", "", "backend-app-bravo"})
public abstract interface ClientService {
    
    /**
     * Find all the Vehicles
     *
     * @return a list of Vehicles
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<backend.workshop.ClientResult> findAll();
    
    /**
     * Find a specific Vehicle via ID
     *
     * @param id of the Vehicle
     * @return the Vehicle found
     */
    @org.jetbrains.annotations.Nullable()
    public abstract backend.workshop.ClientResult findById(long id);
    
    /**
     * Save and Flush a Vehicle entity in the database
     *
     * @param vehicleInput
     * @return the Vehicle created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract backend.workshop.ClientResult create(@org.jetbrains.annotations.NotNull()
    backend.workshop.ClientInput clientInput);
}