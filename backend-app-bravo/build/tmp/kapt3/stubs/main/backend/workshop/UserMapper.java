package backend.workshop;

import java.lang.System;

@org.mapstruct.Mapper(imports = {java.time.LocalDateTime.class}, componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0003H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lbackend/workshop/UserMapper;", "", "userInputToUser", "Lbackend/workshop/User;", "userInput", "Lbackend/workshop/UserInput;", "", "dto", "user", "userLoginInputToUser", "userLoginInput", "Lbackend/workshop/UserLoginInput;", "userToUserResult", "Lbackend/workshop/UserResult;", "backend-app-bravo"})
public abstract interface UserMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract backend.workshop.User userInputToUser(@org.jetbrains.annotations.NotNull()
    backend.workshop.UserInput userInput);
    
    @org.jetbrains.annotations.NotNull()
    public abstract backend.workshop.User userLoginInputToUser(@org.jetbrains.annotations.NotNull()
    backend.workshop.UserLoginInput userLoginInput);
    
    @org.jetbrains.annotations.NotNull()
    public abstract backend.workshop.UserResult userToUserResult(@org.jetbrains.annotations.NotNull()
    backend.workshop.User user);
    
    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
    public abstract void userInputToUser(@org.jetbrains.annotations.NotNull()
    backend.workshop.UserInput dto, @org.jetbrains.annotations.NotNull()
    @org.mapstruct.MappingTarget()
    backend.workshop.User user);
}