package cn.edu.gdmec.android.mobileguard.m4appmanager.entity;

import android.graphics.drawable.Drawable;

/**
 * Created by student on 17/11/8.
 */

public class AppInfo {
   /* 应用程序包名*/
    public String packgeName;
    /*应用程序图标*/
    public Drawable icon;
    /*应用程序名称*/
    public String appName;
    /*应用程序路径*/
    private String appPath;
    /*应用程序大小*/
    public long appSize;
    /*是否是手机存储*/
    public boolean isInRoom;
    /*是否是用户应用*/
    public boolean isUsreApp;
    /*是否选中，默认都为false*/
    public boolean isSelected = false;
    /*拿到app位置字符串*/
    public String getApppLocation(boolean isInRoom){
        if (isInRoom){
            return "手机内存";
        }else {
            return "外部内存";
        }
    }
}
