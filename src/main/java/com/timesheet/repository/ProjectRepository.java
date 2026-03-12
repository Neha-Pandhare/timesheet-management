package com.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.timesheet.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}