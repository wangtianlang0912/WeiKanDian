package me.anany.weikandian;

/**
 * Created by anany on 16/1/6.
 * <p>
 * Email:zhujun2730@gmail.com
 */
public class NetWorkConfig {

    public static final String BASE_URL = "http://www.weixinkd.com/";

    //access=WIFI&action=register&app_version=2.0.4&channel=c1005&
    // device_model=Nexus+4&device_platform=android&iid=6416405&
    // mobile=18607000538&openudid=7f08bcd287cc5096&os_api=22&os_version=mk_mako-userdebug+5.1.1+LVY48F+a8f06c66ed+test-keys
    // &phone_sim=2&request_time=1452061415&uid=9279697
    // &uuid=355136051237892&version_code=204&sign=a0e8eb0e0d96864792354f62deca5a24
    /**
     * 注册获取验证码
     */
    public static final String GET_YZM = "v3/user/mobile/sms_send.json";

    /**
     * 首页 【新闻列表数据】
     */
    public static final String HOME_NEWS_DATA = "/v3/article/lists2.json";

    /**
     * 首页 【title数据】
     */
    public static final String HOME_TITLE = "v3/User/getinfo.json";

    /**
     * 订阅 【我的订阅数据】
     */
    public static final String SUBSCRIBE_FRAGMENT_ME = "v1/focus/info/get.json";


    /**
     * 排行榜 【列表数据】
     */
    public static final String BILLBOARD_DATA = "v3/article/top/get.json";


    /**
     * 发现 【实时热点】
     */
    public static final String DISCOVER_TOP_NEWS = "v1/Search/suggest.json";
}
