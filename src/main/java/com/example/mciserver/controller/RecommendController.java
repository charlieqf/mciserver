package com.example.mciserver.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mciserver.dto.RecommendRequest;
import com.example.mciserver.model.ApiResponse;
import com.example.mciserver.model.BrandInfo; // Assuming you have a BrandInfo in the model package
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/nouser/api/op/ent/brand/application")
public class RecommendController {

    @PostMapping("/recommend")
    public ResponseEntity<ApiResponse> recommend(@RequestBody RecommendRequest request) {
        String serialNo = request.getSerialNo();
        String partnerMchId = request.getPartnerMchId();
        BrandInfo brandInfo = request.getBrandInfo();

        // Create the response
        ApiResponse response = new ApiResponse();
        response.setCode("0000");
        response.setMessage("result.success:recommend");
        response.setLocalizedMessage("result.success");
        response.setData(new HashMap<>());  // Empty data for now, but you can populate it as needed

        return ResponseEntity.ok(response);
    }

}
