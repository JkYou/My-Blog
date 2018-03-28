package com.my.blog.website.service;

import com.taobao.api.request.TbkDgItemCouponGetRequest;
import com.taobao.api.request.TbkItemGetRequest;
import com.taobao.api.request.TbkShopGetRequest;

import java.util.List;
import java.util.Map;

public interface ITbkService {
    /**
     * 淘宝客商品搜索查询接口
     * 淘宝客商品查询接口。可以根据关键字、类目、价格范围、佣金范围、销量范围等过滤条件查询淘宝客商品
     * @return
     * @throws Exception
     */
    public Map<String, Object> getProductList(TbkItemGetRequest req) throws Exception;
    /**
     * 好券清单API【导购】
     * 带优惠券产品
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> getCouponProductList(TbkDgItemCouponGetRequest req) throws Exception;
    /**
     * 淘宝客店铺查询
     * @return
     * @throws Exception
     */
    public Map<String, Object> getShopping(TbkShopGetRequest req) throws Exception;
}
