package com.horaoen.behavior.cor.middleware;

import java.util.HashMap;
import java.util.Map;

/**
 * @author horaoen
 * ConcreteHandler. Checks whether there are too many failed login requests.
 * 登录节流
 */
public class ThrottlingMiddleware extends Middleware {
    /**
     * 每个用户登录信息
     * key: emil
     * value: 上一分钟请求信息
     */
    private final Map<String, LoginRequestData> userRequest = new HashMap<>();

    /**
     * 每分钟允许请求次数
     */
    private final int requestPerMinute;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
    }

    /**
     * Please, not that checkNext() call can be inserted both in the beginning
     * of this method and in the end.
     * <p>
     * This gives much more flexibility than a simple loop over all middleware
     * objects. For instance, an element of a chain can change the order of
     * checks by running its check after all other checks.
     */
    public boolean check(String email, String password) {
        LoginRequestData loginRequestData = this.userRequest.get(email);

        //没登录过
        if (loginRequestData == null) {
            loginRequestData = new LoginRequestData(1, System.currentTimeMillis());
            this.userRequest.put(email, loginRequestData);
            return checkNext(email, password);
        } else if (loginRequestData.getCurrentTime() + 60_000 < System.currentTimeMillis()) {
            //距离上次被记录的登陆时间超过一分钟。
            loginRequestData.setRequestNo(1);
            return checkNext(email, password);
        } else if (loginRequestData.getRequestNo() < requestPerMinute) {
            //节流次数允许范围内
            loginRequestData.setRequestNo(loginRequestData.getRequestNo() + 1);
            return checkNext(email, password);
        } else {
            System.out.println("Request limit exceeded!");
            return false;
        }
    }
}