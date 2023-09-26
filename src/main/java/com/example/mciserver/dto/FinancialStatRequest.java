package com.example.mciserver.dto;

import com.example.mciserver.model.HistoryIncomeSummarys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinancialStatRequest {

    private String batchNo; // 批次号
    private String partnerMchId; // 平台方商户号
    private String brandName; // 品牌方名称
    private Date batchDatetime; // 批次时间
    private Integer totalCount; // 总记录数
    private Double totalTurnover; // 总营业额
    private Double totalActualAmount; // 总实收金额
    private String remark; // 备注
    private List<HistoryIncomeSummarys> historyIncomeSummarys; // 日度收入明细
}
