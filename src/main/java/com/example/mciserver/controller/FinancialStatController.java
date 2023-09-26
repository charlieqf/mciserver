package com.example.mciserver.controller;

import java.util.HashMap;

//import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mciserver.dto.FinancialStatRequest;
import com.example.mciserver.model.ApiResponse;

@RestController
@RequestMapping("/nouser/api/oms/order/history")
public class FinancialStatController {

    //@Operation(summary = "Upload financial statistics", description = "Endpoint for uploading store financial statistics.")
    @PostMapping("/financial-stat")
    //@PostMapping("/nouser/api/oms/order/history/financial-stat")
    public ResponseEntity<ApiResponse> postFinancialStat(@RequestBody FinancialStatRequest request) {
        // Implement the logic to process the request and store data.
        // Return an appropriate response.
        // Create the response
        ApiResponse response = new ApiResponse();
        response.setCode("0000");
        response.setMessage("result.success:postFinancialStat");
        response.setLocalizedMessage("result.success");
        response.setData(new HashMap<>());  // Empty data for now, but you can populate it as needed

        return ResponseEntity.ok(response);
    }
}
