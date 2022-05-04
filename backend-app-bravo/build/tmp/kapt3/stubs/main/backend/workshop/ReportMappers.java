package backend.workshop;

import java.lang.System;

@org.mapstruct.Mapper(imports = {java.time.LocalDateTime.class}, componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001a\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0003H\'J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lbackend/workshop/ReportMappers;", "", "reportInputToReport", "Lbackend/workshop/Report;", "reportInput", "Lbackend/workshop/ReportInput;", "", "dto", "report", "reportListToReportListResult", "", "Lbackend/workshop/ReportResult;", "reportList", "reportToReportResult", "backend-app-bravo"})
public abstract interface ReportMappers {
    
    @org.jetbrains.annotations.NotNull()
    @org.mapstruct.Mapping(target = "creationDate", defaultExpression = "java(new java.util.Date())")
    public abstract backend.workshop.Report reportInputToReport(@org.jetbrains.annotations.NotNull()
    backend.workshop.ReportInput reportInput);
    
    @org.jetbrains.annotations.NotNull()
    public abstract backend.workshop.ReportResult reportToReportResult(@org.jetbrains.annotations.NotNull()
    backend.workshop.Report report);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<backend.workshop.ReportResult> reportListToReportListResult(@org.jetbrains.annotations.NotNull()
    java.util.List<backend.workshop.Report> reportList);
    
    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
    public abstract void reportInputToReport(@org.jetbrains.annotations.NotNull()
    backend.workshop.ReportInput dto, @org.jetbrains.annotations.NotNull()
    @org.mapstruct.MappingTarget()
    backend.workshop.Report report);
}