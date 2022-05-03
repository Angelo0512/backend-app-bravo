package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003Jh\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020<H\u00d6\u0001J\t\u0010=\u001a\u00020\u0007H\u00d6\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006>"}, d2 = {"Lbackend/workshop/ReportInput;", "", "id", "", "creationDate", "Ljava/util/Date;", "description", "", "services", "", "Lbackend/workshop/ServiceInput;", "client", "Lbackend/workshop/ClientInput;", "vehicle", "Lbackend/workshop/VehicleInput;", "technician", "Lbackend/workshop/technicianDetails;", "(Ljava/lang/Long;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lbackend/workshop/ClientInput;Lbackend/workshop/VehicleInput;Lbackend/workshop/technicianDetails;)V", "getClient", "()Lbackend/workshop/ClientInput;", "setClient", "(Lbackend/workshop/ClientInput;)V", "getCreationDate", "()Ljava/util/Date;", "setCreationDate", "(Ljava/util/Date;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getServices", "()Ljava/util/List;", "setServices", "(Ljava/util/List;)V", "getTechnician", "()Lbackend/workshop/technicianDetails;", "setTechnician", "(Lbackend/workshop/technicianDetails;)V", "getVehicle", "()Lbackend/workshop/VehicleInput;", "setVehicle", "(Lbackend/workshop/VehicleInput;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lbackend/workshop/ClientInput;Lbackend/workshop/VehicleInput;Lbackend/workshop/technicianDetails;)Lbackend/workshop/ReportInput;", "equals", "", "other", "hashCode", "", "toString", "backend-app-bravo"})
public final class ReportInput {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date creationDate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<backend.workshop.ServiceInput> services;
    @org.jetbrains.annotations.Nullable()
    private backend.workshop.ClientInput client;
    @org.jetbrains.annotations.Nullable()
    private backend.workshop.VehicleInput vehicle;
    @org.jetbrains.annotations.Nullable()
    private backend.workshop.technicianDetails technician;
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.ReportInput copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.util.Date creationDate, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.util.List<backend.workshop.ServiceInput> services, @org.jetbrains.annotations.Nullable()
    backend.workshop.ClientInput client, @org.jetbrains.annotations.Nullable()
    backend.workshop.VehicleInput vehicle, @org.jetbrains.annotations.Nullable()
    backend.workshop.technicianDetails technician) {
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
    
    public ReportInput() {
        super();
    }
    
    public ReportInput(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.util.Date creationDate, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.util.List<backend.workshop.ServiceInput> services, @org.jetbrains.annotations.Nullable()
    backend.workshop.ClientInput client, @org.jetbrains.annotations.Nullable()
    backend.workshop.VehicleInput vehicle, @org.jetbrains.annotations.Nullable()
    backend.workshop.technicianDetails technician) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCreationDate() {
        return null;
    }
    
    public final void setCreationDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<backend.workshop.ServiceInput> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<backend.workshop.ServiceInput> getServices() {
        return null;
    }
    
    public final void setServices(@org.jetbrains.annotations.Nullable()
    java.util.List<backend.workshop.ServiceInput> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final backend.workshop.ClientInput component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final backend.workshop.ClientInput getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.Nullable()
    backend.workshop.ClientInput p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final backend.workshop.VehicleInput component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final backend.workshop.VehicleInput getVehicle() {
        return null;
    }
    
    public final void setVehicle(@org.jetbrains.annotations.Nullable()
    backend.workshop.VehicleInput p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final backend.workshop.technicianDetails component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final backend.workshop.technicianDetails getTechnician() {
        return null;
    }
    
    public final void setTechnician(@org.jetbrains.annotations.Nullable()
    backend.workshop.technicianDetails p0) {
    }
}