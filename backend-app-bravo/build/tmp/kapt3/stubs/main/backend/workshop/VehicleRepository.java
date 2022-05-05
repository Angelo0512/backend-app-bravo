package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u0006H&\u00a8\u0006\t"}, d2 = {"Lbackend/workshop/VehicleRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lbackend/workshop/Vehicle;", "", "findByPlateNumber", "plateNumber", "", "findByVinNumber", "vinNumber", "backend-app-bravo"})
@org.springframework.stereotype.Repository()
public abstract interface VehicleRepository extends org.springframework.data.jpa.repository.JpaRepository<backend.workshop.Vehicle, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract backend.workshop.Vehicle findByPlateNumber(@org.jetbrains.annotations.NotNull()
    @org.springframework.data.repository.query.Param(value = "plateNumber")
    java.lang.String plateNumber);
    
    @org.jetbrains.annotations.Nullable()
    public abstract backend.workshop.Vehicle findByVinNumber(@org.jetbrains.annotations.NotNull()
    @org.springframework.data.repository.query.Param(value = "vinNumber")
    java.lang.String vinNumber);
}