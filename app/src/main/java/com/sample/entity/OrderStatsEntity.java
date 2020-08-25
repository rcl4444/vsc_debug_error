package com.sample.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("order_stats_final")
public class OrderStatsEntity extends BaseEntity<Long>{

    @TableField("half_year_order_count")
    private int halfYearOrderCount;

    @TableField("half_year_order_monthly_growth")
    private float halfYearOrderMonthlyGrowth;

    @TableField("last_month_order_count")
    private int lastMonthOrderCount;

    @TableField("half_year_order_amount_monthly_growth")
    private float halfYearOrderAmountMonthlyGrowth;

    @TableField("half_year_order_amount")
    private double halfYearOrderAmount;

    @TableField("last_month_order_amount")
    private double lastMonthOrderAmount;

    @TableField("order_amount_total")
    private double orderAmountTotal;

    @TableField("purchase_amount_total_growth")
    private float purchaseAmountTotalGrowth;

    @TableField("avg_purchase_period")
    private int avgPurchasePeriod;

    @TableField("last_year_purchase_amount")
    private double lastYearPurchaseAmount;

    @TableField("order_amount_total_cxs")
    private double orderAmountTotalCxs;

    @TableField("order_amount_total_eos")
    private double orderAmountTotalEos;

    @TableField("eos_half_year_tenant_id_eos")
    private long eosHalfYearTenantIdEos;

    @TableField("eos_half_year_tenant_name_eos")
    private String eosHalfYearTenantNameEos;

    @TableField("eos_one_month_tenant_id_eos")
    private long eosOneMonthTenantIdEos;

    @TableField("eos_one_month_tenant_name_eos")
    private String eosOneMonthTenantNameEos;

    @TableField("cxs_total_tenant_id_cxs")
    private long cxsTotalTenantIdCxs;

    @TableField("cxs_total_tenant_name_cxs")
    private String cxsTotalTenantNameCxs;

    @TableField("cxs_last_year_tenant_id_cxs")
    private long cxsLastYearTenantIdCxs;

    @TableField("cxs_last_year_tenant_name_cxs")
    private String cxsLastYearTenantNameCxs;

    @TableField("cxs_order_detail_tenant_id")
    private long cxsOrderDetailTenantId;

    @TableField("cxs_order_detail_tenant_name")
    private String cxsOrderDetailTenantName;

    @Override
    public String toString() {
        return "OrderStatsEntity{" +
                "halfYearOrderCount=" + halfYearOrderCount +
                ", halfYearOrderMonthlyGrowth=" + halfYearOrderMonthlyGrowth +
                ", lastMonthOrderCount=" + lastMonthOrderCount +
                ", halfYearOrderAmountMonthlyGrowth=" + halfYearOrderAmountMonthlyGrowth +
                ", halfYearOrderAmount=" + halfYearOrderAmount +
                ", lastMonthOrderAmount=" + lastMonthOrderAmount +
                ", orderAmountTotal=" + orderAmountTotal +
                ", purchaseAmountTotalGrowth=" + purchaseAmountTotalGrowth +
                ", avgPurchasePeriod=" + avgPurchasePeriod +
                ", lastYearPurchaseAmount=" + lastYearPurchaseAmount +
                ", orderAmountTotalCxs=" + orderAmountTotalCxs +
                ", orderAmountTotalEos=" + orderAmountTotalEos +
                ", eosHalfYearTenantIdEos=" + eosHalfYearTenantIdEos +
                ", eosHalfYearTenantNameEos='" + eosHalfYearTenantNameEos + '\'' +
                ", eosOneMonthTenantIdEos=" + eosOneMonthTenantIdEos +
                ", eosOneMonthTenantNameEos='" + eosOneMonthTenantNameEos + '\'' +
                ", cxsTotalTenantIdCxs=" + cxsTotalTenantIdCxs +
                ", cxsTotalTenantNameCxs='" + cxsTotalTenantNameCxs + '\'' +
                ", cxsLastYearTenantIdCxs=" + cxsLastYearTenantIdCxs +
                ", cxsLastYearTenantNameCxs='" + cxsLastYearTenantNameCxs + '\'' +
                ", cxsOrderDetailTenantId=" + cxsOrderDetailTenantId +
                ", cxsOrderDetailTenantName='" + cxsOrderDetailTenantName + '\'' +
                ", id=" + id +
                '}';
    }
}
