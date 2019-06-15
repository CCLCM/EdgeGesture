package com.omarea.gesture;

import android.accessibilityservice.AccessibilityService;

public class SpfConfig {
    public static final String ConfigFile = "main";

    // 悬停时间
    public static final String CONFIG_HOVER_TIME = "CONFIG_HOVER_TIME";
    public static final Long CONFIG_HOVER_TIME_DEFAULT = 180L;

    // 左侧手势区域
    public static final String CONFIG_LEFT_ALLOW = "CONFIG_LEFT_ALLOW";
    public static final boolean CONFIG_LEFT_ALLOW_DEFAULT = true;
    public static final String CONFIG_LEFT_HEIGHT = "CONFIG_LEFT_HEIGHT";
    public static final int CONFIG_LEFT_HEIGHT_DEFAULT = 65; // 高度百分比
    public static final String CONFIG_LEFT_COLOR = "CONFIG_LEFT_COLOR";
    public static final int CONFIG_LEFT_COLOR_DEFAULT =0xee101010;
    public static final String CONFIG_LEFT_EVBET = "CONFIG_LEFT_EVBET";
    public static final int CONFIG_LEFT_EVBET_DEFAULT = AccessibilityService.GLOBAL_ACTION_BACK;
    public static final String CONFIG_LEFT_EVBET_HOVER = "CONFIG_LEFT_EVBET_HOVER";
    public static final int CONFIG_LEFT_EVBET_HOVER_DEFAULT = AccessibilityService.GLOBAL_ACTION_RECENTS;

    // 右侧手势区域
    public static final String CONFIG_RIGHT_ALLOW = "CONFIG_RIGHT_ALLOW";
    public static final boolean CONFIG_RIGHT_ALLOW_DEFAULT = true;
    public static final String CONFIG_RIGHT_HEIGHT = "CONFIG_RIGHT_HEIGHT";
    public static final int CONFIG_RIGHT_HEIGHT_DEFAULT = 65; // 高度百分比
    public static final String CONFIG_RIGHT_COLOR = "CONFIG_RIGHT_COLOR";
    public static final int CONFIG_RIGHT_COLOR_DEFAULT =0xee101010;
    public static final String CONFIG_RIGHT_EVBET = "CONFIG_RIGHT_EVBET";
    public static final int CONFIG_RIGHT_EVBET_DEFAULT = AccessibilityService.GLOBAL_ACTION_BACK;
    public static final String CONFIG_RIGHT_EVBET_HOVER = "CONFIG_RIGHT_EVBET_HOVER";
    public static final int CONFIG_RIGHT_EVBET_HOVER_DEFAULT = AccessibilityService.GLOBAL_ACTION_RECENTS;

    // 底部手势区域
    public static final String CONFIG_BOTTOM_ALLOW = "CONFIG_BOTTOM_ALLOW";
    public static final boolean CONFIG_BOTTOM_ALLOW_DEFAULT = true;
    public static final String CONFIG_BOTTOM_HEIGHT = "CONFIG_BOTTOM_HEIGHT";
    public static final int CONFIG_BOTTOM_HEIGHT_DEFAULT = -1;
    public static final String CONFIG_BOTTOM_COLOR = "CONFIG_BOTTOM_COLOR";
    public static final int CONFIG_BOTTOM_COLOR_DEFAULT = 0xee101010;
    public static final String CONFIG_BOTTOM_EVBET = "CONFIG_BOTTOM_EVBET";
    public static final int CONFIG_BOTTOM_EVBET_DEFAULT = AccessibilityService.GLOBAL_ACTION_HOME;
    public static final String CONFIG_BOTTOM_EVBET_HOVER = "CONFIG_BOTTOM_EVBET_HOVER";
    public static final int CONFIG_BOTTOM_EVBET_HOVER_DEFAULT = AccessibilityService.GLOBAL_ACTION_RECENTS;
}
