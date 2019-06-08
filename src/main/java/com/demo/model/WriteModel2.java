package com.demo.model;

import java.time.LocalDateTime;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WriteModel2 extends BaseRowModel {

    @ExcelProperty(value = "订单号", index = 0)
    private String orderNo;

    @ExcelProperty(value = "创建人", index = 1)
    private String name;

    @ExcelProperty(value = "创建时间", index = 2)
    private LocalDateTime createTime;
}
