package cn.edu.gdmec.android.mobileguard.m4appmanager.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdmec.android.mobileguard.m4appmanager.entity.AppInfo;

/**
 * Created by student on 17/11/8.
 */

public class AppInfoParser {
   /**获取手机里面的所有的应用程序
    *@param context 上下文
    *@return
    */

   public static List<AppInfo> getAppInfos(Context context){
       //获取包管理器
       PackageManager pm = context.getPackageManager();
       List<PackageInfo> packageInfos = pm.getInstalledPackages(0);
       List<AppInfo> appInfos = new ArrayList<AppInfo>();
       for (PackageInfo packInfo:packageInfos){
           AppInfo appinfo = new AppInfo();
       }

   }
}
