package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003J\t\u00104\u001a\u00020\u000eH\u00c6\u0003J\t\u00105\u001a\u00020\u0010H\u00c6\u0003J\\\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\u0007H\u0016R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006>"}, d2 = {"Lbackend/workshop/Report;", "", "id", "", "creationDate", "Ljava/util/Date;", "description", "", "servicesList", "", "Lbackend/workshop/Service;", "client", "Lbackend/workshop/Client;", "vehicle", "Lbackend/workshop/Vehicle;", "technician", "Lbackend/workshop/Technician;", "(Ljava/lang/Long;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lbackend/workshop/Client;Lbackend/workshop/Vehicle;Lbackend/workshop/Technician;)V", "getClient", "()Lbackend/workshop/Client;", "setClient", "(Lbackend/workshop/Client;)V", "getCreationDate", "()Ljava/util/Date;", "setCreationDate", "(Ljava/util/Date;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getServicesList", "()Ljava/util/List;", "setServicesList", "(Ljava/util/List;)V", "getTechnician", "()Lbackend/workshop/Technician;", "setTechnician", "(Lbackend/workshop/Technician;)V", "getVehicle", "()Lbackend/workshop/Vehicle;", "setVehicle", "(Lbackend/workshop/Vehicle;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lbackend/workshop/Client;Lbackend/workshop/Vehicle;Lbackend/workshop/Technician;)Lbackend/workshop/Report;", "equals", "", "other", "hashCode", "", "toString", "backend-app-bravo"})
@javax.persistence.Table(name = "report")
@javax.persistence.Entity()
public final class Report {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(name = "creation_date")
    @javax.persistence.Temporal(value = javax.persistence.TemporalType.DATE)
    private java.util.Date creationDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinTable(name = "report_services", joinColumns = {@javax.persistence.JoinColumn(referencedColumnName = "id", name = "report_id")}, inverseJoinColumns = {@javax.persistence.JoinColumn(referencedColumnName = "id", name = "service_id")})
    @javax.persistence.ManyToMany()
    private java.util.List<backend.workshop.Service> servicesList;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(referencedColumnName = "id", nullable = false)
    @javax.persistence.ManyToOne()
    private backend.workshop.Client client;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(referencedColumnName = "id", nullable = false)
    @javax.persistence.ManyToOne()
    private backend.workshop.Vehicle vehicle;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.JoinColumn(referencedColumnName = "id", nullable = false)
    @javax.persistence.ManyToOne()
    private backend.workshop.Technician technician;
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.Report copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.util.Date creationDate, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.util.List<backend.workshop.Service> servicesList, @org.jetbrains.annotations.NotNull()
    backend.workshop.Client client, @org.jetbrains.annotations.NotNull()
    backend.workshop.Vehicle vehicle, @org.jetbrains.annotations.NotNull()
    backend.workshop.Technician technician) {
        return null;
    }
    
    public Report(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.util.Date creationDate, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.util.List<backend.workshop.Service> servicesList, @org.jetbrains.annotations.NotNull()
    backend.workshop.Client client, @org.jetbrains.annotations.NotNull()
    backend.workshop.Vehicle vehicle, @org.jetbrains.annotations.NotNull()
    backend.workshop.Technician technician) {
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
    public final java.util.List<backend.workshop.Service> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<backend.workshop.Service> getServicesList() {
        return null;
    }
    
    public final void setServicesList(@org.jetbrains.annotations.NotNull()
    java.util.List<backend.workshop.Service> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.Client component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.Client getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    backend.workshop.Client p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.Vehicle component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.Vehicle getVehicle() {
        return null;
    }
    
    public final void setVehicle(@org.jetbrains.annotations.NotNull()
    backend.workshop.Vehicle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.Technician component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.Technician getTechnician() {
        return null;
    }
    
    public final void setTechnician(@org.jetbrains.annotations.NotNull()
    backend.workshop.Technician p0) {
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
}