package com.dashboard.tableauportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dashboard.tableauportal.service.DashboardService;

@Controller
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/")
    public String home(Model model){

        model.addAttribute(
            "dashboards",
            dashboardService.getDashboards()
        );
        return "index";
    }
}
