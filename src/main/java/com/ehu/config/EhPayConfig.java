package com.ehu.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 * EhPay配置
 *
 * @author AlanSun
 */
public class EhPayConfig {

    private static final EhPayConfig INSTANCE = new EhPayConfig();

    private EhPayConfig() {
    }

    public static EhPayConfig getInstance() {
        return INSTANCE;
    }

    private static String readKeyFile(String path) {
        StringBuffer key = new StringBuffer();
        File file = new File(path);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                key.append(tempString);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }

        return key.toString();
    }

    // ↓↓↓↓↓↓↓↓↓↓支付宝配置开始↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    /**
     * 合作身份者ID，以2088开头由16位纯数字组成的字符串
     */
    private String alipay_partner;
    /**
     * 收款时的支付宝账号，需要与partner对应的支付宝账号为同一个，也就是说收款支付宝账号必须是签约时的支付宝账号
     */
    private String alipay_seller;
    /**
     * 商户的私钥
     */
    private String alipay_private_key;
    /**
     * 支付宝的公钥，无需修改该值
     */
    private String alipay_public_key;
    /**
     * 字符编码格式 目前支持 GBK 或 UTF-8
     */
    private String alipay_input_charset;
    /**
     * 签名方式 不需修改
     */
    private String alipay_sign_type;
    /**
     * 设置未付款交易的超时时间 默认30分钟，一旦超时，该笔交易就会自动被关闭。 <br>
     * 取值范围：1m～15d。<br>
     * m-分钟，h-小时，d-天，1c-当天（无论交易何时创建，都在0点关闭）。 <br>
     * 该参数数值不接受小数点，如1.5h，可转换为90m。<br>
     */
    private String alipay_time_out;
    /**
     * 支付宝提供给商户的服务接入网关URL(新)
     */
    private String alipay_gateway_url;
    /**
     * 支付宝消息验证地址
     */
    private String alipay_verify_url;
    /**
     * 批量转账接口名称
     */
    private String alipay_service;
    /**
     * 付款账号名
     */
    private String alipay_account_name;
    /**
     * 应用appid
     */
    private String alipay_app_id;
    /**
     * md5key
     */
    private String alipay_md5_key;
    /**
     * openapi地址
     */
    private String alipay_open_api;
    /**
     * 开放平台支付宝公钥
     */
    private String alipay_open_public_key;

    // ↑↑↑↑↑↑↑↑↑↑支付宝配置结束↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑


    // ↓↓↓↓↓↓↓↓↓↓微信开始↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    /**
     * 微信唯一标示
     */
    private String wxPay_appid;
    private String wxPay_app_key;
    private String wxPay_spbill_create_ip;
    private String wxPay_mch_id;
    private String wxPay_ca;
    private String wxPay_code;
    private String wxxcx_appid;
    // ↑↑↑↑↑↑↑↑↑↑微信结束↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    public String getAlipay_partner() {
        return alipay_partner;
    }

    public void setAlipay_partner(String alipay_partner) {
        INSTANCE.alipay_partner = alipay_partner;
    }

    public String getAlipay_seller() {
        return alipay_seller;
    }

    public void setAlipay_seller(String alipay_seller) {
        INSTANCE.alipay_seller = alipay_seller;
    }

    public String getAlipay_private_key() {
        return alipay_private_key;
    }

    public void setAlipay_private_key(String alipay_private_key) {
        INSTANCE.alipay_private_key = EhPayConfig.readKeyFile(alipay_private_key);
    }

    public String getAlipay_public_key() {
        return alipay_public_key;
    }

    public void setAlipay_public_key(String alipay_public_key) {
        INSTANCE.alipay_public_key = EhPayConfig.readKeyFile(alipay_public_key);
    }

    public String getAlipay_open_public_key() {
        return alipay_open_public_key;
    }

    public void setAlipay_open_public_key(String alipay_open_public_key) {
        INSTANCE.alipay_open_public_key = EhPayConfig.readKeyFile(alipay_open_public_key);
    }

    public String getAlipay_input_charset() {
        return alipay_input_charset;
    }

    public void setAlipay_input_charset(String alipay_input_charset) {
        INSTANCE.alipay_input_charset = alipay_input_charset;
    }

    public String getAlipay_sign_type() {
        return alipay_sign_type;
    }

    public void setAlipay_sign_type(String alipay_sign_type) {
        INSTANCE.alipay_sign_type = alipay_sign_type;
    }

    public String getAlipay_time_out() {
        return alipay_time_out;
    }

    public void setAlipay_time_out(String alipay_time_out) {
        INSTANCE.alipay_time_out = alipay_time_out;
    }

    public String getAlipay_gateway_url() {
        return alipay_gateway_url;
    }

    public void setAlipay_gateway_url(String alipay_gateway_url) {
        INSTANCE.alipay_gateway_url = alipay_gateway_url;
    }

    public String getAlipay_verify_url() {
        return alipay_verify_url;
    }

    public void setAlipay_verify_url(String alipay_verify_url) {
        INSTANCE.alipay_verify_url = alipay_verify_url;
    }

    public String getAlipay_service() {
        return INSTANCE.alipay_service;
    }

    public void setAlipay_service(String alipay_service) {
        INSTANCE.alipay_service = alipay_service;
    }

    public String getAlipay_account_name() {
        return INSTANCE.alipay_account_name;
    }

    public void setAlipay_account_name(String alipay_account_name) {
        INSTANCE.alipay_account_name = alipay_account_name;
    }

    public String getAlipay_app_id() {
        return alipay_app_id;
    }

    public void setAlipay_app_id(String alipay_app_id) {
        INSTANCE.alipay_app_id = alipay_app_id;
    }

    public String getWxPay_appid() {
        return INSTANCE.wxPay_appid;
    }

    public String getAlipay_md5_key() {
        return alipay_md5_key;
    }

    public void setAlipay_md5_key(String alipay_md5_key) {
        INSTANCE.alipay_md5_key = EhPayConfig.readKeyFile(alipay_md5_key);
    }

    public void setWxPay_appid(String wxPay_appid) {
        INSTANCE.wxPay_appid = wxPay_appid;
    }

    public String getWxPay_mch_id() {
        return INSTANCE.wxPay_mch_id;
    }

    public void setWxPay_mch_id(String wxPay_mch_id) {
        INSTANCE.wxPay_mch_id = wxPay_mch_id;
    }

    public String getWxPay_app_key() {
        return INSTANCE.wxPay_app_key;
    }

    public String getWxPay_spbill_create_ip() {
        return INSTANCE.wxPay_spbill_create_ip;
    }

    public void setWxPay_spbill_create_ip(String wxPay_spbill_create_ip) {
        INSTANCE.wxPay_spbill_create_ip = wxPay_spbill_create_ip;
    }

    public void setWxPay_app_key(String wxPay_app_key) {
        INSTANCE.wxPay_app_key = EhPayConfig.readKeyFile(wxPay_app_key);
    }

    public String getWxPay_ca() {
        return INSTANCE.wxPay_ca;
    }

    public void setWxPay_ca(String wxPay_ca) {
        INSTANCE.wxPay_ca = wxPay_ca;
    }

    public String getWxPay_code() {
        return wxPay_code;
    }

    public void setWxPay_code(String wxPay_code) {
        INSTANCE.wxPay_code = EhPayConfig.readKeyFile(wxPay_code);
    }

    public String getAlipay_open_api() {
        return alipay_open_api;
    }

    public void setAlipay_open_api(String alipay_open_api) {
        INSTANCE.alipay_open_api = alipay_open_api;
    }

    public String getWxxcx_appid() {
        return wxxcx_appid;
    }

    public void setWxxcx_appid(String wxxcx_appid) {
        INSTANCE.wxxcx_appid = wxxcx_appid;
    }
}