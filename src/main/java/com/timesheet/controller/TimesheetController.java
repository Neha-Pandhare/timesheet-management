package com.timesheet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.timesheet.entity.Timesheet;
import com.timesheet.service.TimesheetService;
import java.util.List;

@RestController
@RequestMapping("/timesheets")
public class TimesheetController {

    @Autowired
    private TimesheetService timesheetService;

    @PostMapping("/add")
    public Timesheet addTimesheet(@RequestBody Timesheet timesheet) {
        return timesheetService.saveTimesheet(timesheet);
    }

    @GetMapping("/all")
    public List<Timesheet> getAllTimesheets() {
        return timesheetService.getAllTimesheets();
    }
}