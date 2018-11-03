package com.github.skyisbule.wxpay.service;

import com.github.skyisbule.wxpay.dao.WarehouseDao;
import com.github.skyisbule.wxpay.dao.WarehouseMapper;
import com.github.skyisbule.wxpay.dao.WarehouseUnitMapper;
import com.github.skyisbule.wxpay.domain.User;
import com.github.skyisbule.wxpay.domain.Warehouse;
import com.github.skyisbule.wxpay.domain.WarehouseUnit;
import com.github.skyisbule.wxpay.domain.WarehouseUnitExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class WarehouseService {

    @Autowired
    WarehouseMapper warehouseMapper;
    @Autowired
    WarehouseUnitMapper warehouseUnitMapper;
    @Autowired
    WarehouseDao warehouseDao;
    @Autowired
    UserService userService;

    @Transactional(propagation = Propagation.REQUIRED)
    public String doCopy(String openId,int wid){
        User user = userService.getByOpenId(openId);
        Warehouse warehouse = warehouseMapper.selectByPrimaryKey(wid);
        WarehouseUnitExample e = new WarehouseUnitExample();
        e.createCriteria().andWarehouseIdEqualTo(wid);
        List<WarehouseUnit> units = warehouseUnitMapper.selectByExample(e);
        if (user == null || warehouse ==null)
            return "null";
        warehouse.setSourceWid(wid);
        warehouse.setShopId(user.getUid());
        warehouse.setCreateTime(new Date());
        warehouse.setStatus(2);
        warehouse.setWid(null);
        warehouse.setOpenId(user.getOpenId());
        warehouseMapper.insert(warehouse);
        int warehouseId = warehouseDao.getMaxIdFromWarehouse();
        units.forEach(u -> u.setWarehouseId(warehouseId));
        for (WarehouseUnit unit : units) {
            unit.setWuid(null);
            warehouseUnitMapper.insert(unit);
        }
        return "success";
    }



}
