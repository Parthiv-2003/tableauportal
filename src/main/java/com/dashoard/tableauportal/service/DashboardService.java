package com.dashoard.tableauportal.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dashoard.tableauportal.model.Dashboard;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.List;

@Service
public class DashboardService {

    public List<Dashboard> getDashboards() {

        try {
            String jsonUrl = "https://raw.githubusercontent.com/Parthiv-2003/tableau-dashboard-config/refs/heads/main/dashboards.json";
            ObjectMapper mapper = new ObjectMapper();
        
            return mapper.readValue(
                new URL(jsonUrl), 
                new TypeReference<List<Dashboard>>(){}
            );

        } catch (Exception e) {
             e.printStackTrace();

            return List.of();
        }
       }

}
