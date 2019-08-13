package com.xfsk.util;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;

/**
 * 上传OSS
 *
 * @version: 1.0
 * @Author: lhm
 * @Create Date: 2019-8-2
 */
public class OSSutil {
    private  static String  endpoint = "http://oss-cn-beijing.aliyuncs.com";
    private static String accessKeyId = "LTAISvkgvPrjdziS";//accesskey
    private static String accessKeySecret = "n0VEVEiTs8NgK3kIbFUrCu6D8cCc5B";//accessKeysercret
    private static String mpsRegionId = "cn-beijing"; //阿里云地区
    private static String pipelineId = "1c741096ba504bf5b9fd000bb8c5ec75";//管道ip
    //    private static String templateId = "S00000001-200010";
    private static String ossLocation = "oss-cn-beijing";//阿里云oss地区
    private static String ossBucket = "res-haima";//Bucket名字

    public static String getAccessKeyId() {
        return accessKeyId;
    }

    public static void setAccessKeyId(String accessKeyId) {
        OSSutil.accessKeyId = accessKeyId;
    }

    public static String getAccessKeySecret() {
        return accessKeySecret;
    }

    public static void setAccessKeySecret(String accessKeySecret) {
        OSSutil.accessKeySecret = accessKeySecret;
    }

    public static String getMpsRegionId() {
        return mpsRegionId;
    }

    public static void setMpsRegionId(String mpsRegionId) {
        OSSutil.mpsRegionId = mpsRegionId;
    }

    public static String getPipelineId() {
        return pipelineId;
    }

    public static void setPipelineId(String pipelineId) {
        OSSutil.pipelineId = pipelineId;
    }

    public static String getOssLocation() {
        return ossLocation;
    }

    public static void setOssLocation(String ossLocation) {
        OSSutil.ossLocation = ossLocation;
    }

    public static String getOssBucket() {
        return ossBucket;
    }

    public static void setOssBucket(String ossBucket) {
        OSSutil.ossBucket = ossBucket;
    }

    public  static boolean OssTF(String videoUrl){
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        return ossClient.doesObjectExist("res-haima", videoUrl);
    }
    public  static boolean  delectOSSV(String vidVideo){

            OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
            ossClient.deleteObject("res-haima",vidVideo);

            // 关闭OSSClient。
            ossClient.shutdown();
            return true;

    }

}
