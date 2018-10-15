package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.RecordMapper;
import com.github.skyisbule.wxpay.domain.Record;
import com.github.skyisbule.wxpay.domain.RecordExample;
import com.qiniu.storage.Recorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/record")
public class RecordController {

    @Autowired
    RecordMapper recordMapper;

    @RequestMapping("/get")
    public String get(int sourceId,String type){
        RecordExample e = new RecordExample();
        e.createCriteria()
                .andSourceIdEqualTo(sourceId)
                .andTypeEqualTo(type);
        List<Record> list =  recordMapper.selectByExample(e);
        String result = "";
        if (list!=null) {
            if (list.size() > 0)
                result = list.get(0).getContent();
        }
        return result;
    }

    @RequestMapping("/set")
    public String set(Record record){
        RecordExample e = new RecordExample();
        e.createCriteria()
                .andTypeEqualTo(record.getType())
                .andSourceIdEqualTo(record.getSourceId());
        List<Record> listTemp = recordMapper.selectByExample(e);
        if (listTemp.size()>0){//执行更新
            record.setRecordId(listTemp.get(0).getRecordId());
            recordMapper.updateByPrimaryKey(record);
        }else{
            recordMapper.insert(record);
        }
        return "success";
    }

}
