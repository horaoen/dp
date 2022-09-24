package com.horaoen.behavior.cor.middleware;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author horaoen
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestData {
    /** 某一分钟请求次数 */
    private int requestNo;
    
    /** 大于一分钟前的登陆请求时间 */
    private long currentTime;
}
