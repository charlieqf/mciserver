package com.example.mciserver.dto;

import com.example.mciserver.model.BrandInfo;
import com.example.mciserver.model.StoreListInfo;

public class RecommendRequest {
    private String serialNo;
    private String partnerMchId;
    private BrandInfo brandInfo;
    private StoreListInfo[] storeListInfo;

    // Default constructor
    public RecommendRequest() {}

    // Parameterized constructor
    public RecommendRequest(String serialNo, String partnerMchId, BrandInfo brandInfo, StoreListInfo[] storeListInfo) {
        this.serialNo = serialNo;
        this.partnerMchId = partnerMchId;
        this.brandInfo = brandInfo;
        this.storeListInfo = storeListInfo;
    }

    // Getters and Setters
    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getPartnerMchId() {
        return partnerMchId;
    }

    public void setPartnerMchId(String partnerMchId) {
        this.partnerMchId = partnerMchId;
    }

    public BrandInfo getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(BrandInfo brandInfo) {
        this.brandInfo = brandInfo;
    }

    public StoreListInfo[] getStoreListInfo() {
        return storeListInfo;
    }

    public void setStoreListInfo(StoreListInfo[] storeListInfo) {
        this.storeListInfo = storeListInfo;
    }
}
