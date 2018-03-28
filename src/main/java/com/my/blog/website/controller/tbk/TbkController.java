package com.my.blog.website.controller.tbk;

import com.google.gson.Gson;
import com.my.blog.website.service.ITbkService;
import com.taobao.api.request.TbkDgItemCouponGetRequest;
import com.taobao.api.request.TbkItemGetRequest;
import com.taobao.api.request.TbkShopGetRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TbkController {
    @Autowired
    ITbkService iTbkService;
    @RequestMapping(value = "/getProductList")
    @ResponseBody
    public Map<String,Object> getProductList(TbkItemGetRequest req) {
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            map=iTbkService.getProductList(req);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return map;
    }
    @RequestMapping(value="/getCouponProductList")
    @ResponseBody
    public List<Map<String, Object>> getCouponProductList(TbkDgItemCouponGetRequest req){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        try {
            list=iTbkService.getCouponProductList(req);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return list;
    }
    @RequestMapping(value="/getShopping")
    @ResponseBody
    public Map<String, Object> getShopping( TbkShopGetRequest req){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            map=iTbkService.getShopping(req);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return map;
    }
    @RequestMapping(value="/test")
    @ResponseBody
    public Map<String, Object> test( TbkShopGetRequest req){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            map.put("test", new Gson().toJson(req));
        } catch (Exception e) {
            // TODO: handle exception
        }
        return map;
    }

}
