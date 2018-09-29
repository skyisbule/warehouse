package com.github.skyisbule.wxpay.vo;

import com.github.skyisbule.wxpay.domain.Warehouse;
import com.github.skyisbule.wxpay.domain.WarehouseUnit;

import java.util.List;

public class WarehouseWithUnitVO{

    public Warehouse warehouse;

    public List<WarehouseUnit> units;

    public List<WarehouseUnit> getUnits() {
        return units;
    }

    public void setUnits(List<WarehouseUnit> units) {
        this.units = units;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
