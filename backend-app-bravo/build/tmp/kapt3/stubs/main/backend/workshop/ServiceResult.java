package backend.workshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lbackend/workshop/ServiceResult;", "", "id", "", "observations", "", "state", "Lbackend/workshop/Status;", "(ILjava/lang/String;Lbackend/workshop/Status;)V", "getId", "()I", "setId", "(I)V", "getObservations", "()Ljava/lang/String;", "setObservations", "(Ljava/lang/String;)V", "getState", "()Lbackend/workshop/Status;", "setState", "(Lbackend/workshop/Status;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "backend-app-bravo"})
public final class ServiceResult {
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String observations;
    @org.jetbrains.annotations.NotNull()
    private backend.workshop.Status state;
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.ServiceResult copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String observations, @org.jetbrains.annotations.NotNull()
    backend.workshop.Status state) {
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
    
    public ServiceResult(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String observations, @org.jetbrains.annotations.NotNull()
    backend.workshop.Status state) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getObservations() {
        return null;
    }
    
    public final void setObservations(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.Status component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final backend.workshop.Status getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    backend.workshop.Status p0) {
    }
}