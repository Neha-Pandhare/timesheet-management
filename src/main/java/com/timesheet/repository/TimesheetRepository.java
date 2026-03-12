package com.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.timesheet.entity.Timesheet;

public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {

}