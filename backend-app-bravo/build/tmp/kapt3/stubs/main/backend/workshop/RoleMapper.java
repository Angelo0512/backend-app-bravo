package backend.workshop;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lbackend/workshop/RoleMapper;", "", "roleToRoleDetails", "Lbackend/workshop/RoleDetails;", "role", "Lbackend/workshop/Role;", "backend-app-bravo"})
public abstract interface RoleMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract backend.workshop.RoleDetails roleToRoleDetails(@org.jetbrains.annotations.Nullable()
    backend.workshop.Role role);
}