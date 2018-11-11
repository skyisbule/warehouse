package com.github.skyisbule.wxpay.controller;

import com.github.skyisbule.wxpay.dao.MessageDAO;
import com.github.skyisbule.wxpay.domain.Message;
import com.github.skyisbule.wxpay.domain.MessageExample;
import com.github.skyisbule.wxpay.domain.User;
import com.github.skyisbule.wxpay.result.Result;
import com.github.skyisbule.wxpay.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api
@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    MessageDAO messageDAO;
    @Autowired
    UserService userService;

    @ApiOperation("通过用户信息返回这个用户应该接收到的消息")
    @RequestMapping("/get-by-user")
    public List<Map<String,Object>> getByUser(String openId, int page){
        User user = userService.getByOpenId(openId);
        return messageDAO.getByUserAndPage(openId,user.getLocate(),(page-1)*10);
    }

    @ApiOperation("添加消息")
    @RequestMapping("/add")
    public String add(Message message){
        message.setCreateDate(new Date());
        messageDAO.insert(message);
        return "success";
    }

    @ApiOperation("通过mid获取详情信息")
    @RequestMapping("/get-by-mid")
    public Message getByMid(int mid){
        return messageDAO.selectByPrimaryKey(mid);
    }

    @ApiOperation("根据状态页码等参数返回详细的需求数组，注其他4个参数选填，不填则不过滤")
    @RequestMapping("/get-by-page")
    public Result getByPage(@ApiParam("必填：页码号，从1开始") long pageNum,
                            @ApiParam("一页返回多少数据，不填的话默认为10")Integer pageSize,
                            @ApiParam("标题")String title,
                            @ApiParam("内容") String content,
                            @ApiParam("创建时间")String createTime,
                            @ApiParam("消息对象")Integer fromType,
                            @ApiParam("消息类别")Integer classType,
                            @ApiParam("地区") String locate,
                            @ApiParam("openId")String openId) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date createTimeBegin  = sdf.parse("2017-11-11 00:00:00");
        Date createTimeEnd    = new Date();
        if (createTime!=null){
            if(createTime.indexOf("-")>1) {
                String strs[] = createTime.split(" - ");
                createTimeBegin = sdf.parse(strs[0] + " 00:00:00");
                createTimeEnd = sdf.parse(strs[1] + " 00:00:00");
            }
        }

        MessageExample e = new MessageExample();

        e.createCriteria()
                .andTitleLike("%"+title+"%")
                .andContentLike("%"+content+"%")
                .andFromTypeEqualTo(fromType)
                .andClassTypeEqualTo(classType)
                .andCreateDateBetween(createTimeBegin,createTimeEnd)
                .andLocateLike("%"+locate+"%");

        e.setOrderByClause("mid desc");
        e.setOffset(10*(pageNum-1));
        e.setLimit(pageSize);

        List<Message> res = messageDAO.selectByExample(e);

        HashMap<String,Object> map = new HashMap<>();
        Result result = new Result();
        result.setErrorNo(0);
        map.put("list",res);
        map.put("pageNum",pageNum+1);
        map.put("pageSize",pageSize);
        int total = this.doCount();
        map.put("pages",total/pageSize);
        map.put("total",total);
        result.setResults("data",map);
        return result;

    }

    @ApiOperation("条件计数")
    public int doCount(){
        MessageExample e = new MessageExample();
        e.createCriteria()
                .andTitleIsNotNull();
        return (int)messageDAO.countByExample(e);
    }

}
