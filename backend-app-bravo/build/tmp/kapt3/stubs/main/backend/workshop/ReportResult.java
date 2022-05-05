package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010,\u001a\u00020\fH\u00c6\u0003J\t\u0010-\u001a\u00020\u000eH\u00c6\u0003JK\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u000203H\u00d6\u0001J\t\u00104\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00065"}, d2 = {"Lbackend/workshop/ReportResult;", "", "id", "", "creationDate", "Ljava/util/Date;", "description", "", "services", "", "Lbackend/workshop/ServiceResult;", "client", "Lbackend/workshop/User;", "vehicle", "Lbackend/workshop/VehicleResult;", "(JLjava/util/Date;Ljava/lang/String;Ljava/util/List;Lbackend/workshop/User;Lbackend/workshop/VehicleResult;)V", "getClient", "()Lbackend/workshop/User;", "setClient", "(Lbackend/workshop/User;)V", "getCreationDate", "()Ljava/util/Date;", "setCreationDate", "(Ljava/util/Date;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getServices", "()Ljava/util/List;", "setServices", "(Ljava/util/List;)V", "getVehicle", "()Lbackend/workshop/VehicleResult;", "setVehicle", "(Lbackend/workshop/VehicleResult;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "backend-app-bravo"})
public final class ReportResult {
    private long id;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date creationDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<backend.workshop.ServiceResult> services;
    @org.jetbrains.annotations.NotNull()
    private backend.workshop.User client;
    @org.jetbrains.annotations.NotNull()
    private backend.workshop.VehicleResult vehicle;
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.ReportResult copy(long id, @org.jetbrains.annotations.NotNull()
    java.util.Date creationDate, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.util.List<backend.workshop.ServiceResult> services, @org.jetbrains.annotations.NotNull()
    backend.workshop.User client, @org.jetbrains.annotations.NotNull()
    backend.workshop.VehicleResult vehicle) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ReportResult(long id, @org.jetbrains.annotations.NotNull()
    java.util.Date creationDate, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.util.List<backend.workshop.ServiceResult> services, @org.jetbrains.annotations.NotNull()
    backend.workshop.User client, @org.jetbrains.annotations.NotNull()
    backend.workshop.VehicleResult vehicle) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getCreationDate() {
        return null;
    }
    
    public final void setCreationDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<backend.workshop.ServiceResult> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<backend.workshop.ServiceResult> getServices() {
        return null;
    }
    
    public final void setServices(@org.jetbrains.annotations.NotNull()
    java.util.List<backend.workshop.ServiceResult> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.User component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.User getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    backend.workshop.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.VehicleResult component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.VehicleResult getVehicle() {
        return null;
    }
    
    public final void setVehicle(@org.jetbrains.annotations.NotNull()
    backend.workshop.VehicleResult p0) {
    }
}