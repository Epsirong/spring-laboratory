package com.生命周期.构造器内抛NPE.error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LightMgrService {

    @Autowired
    private LightService lightService;

    // 期待是在 LightMgrService 初始化过程中，执行检测操作
    public LightMgrService() {
        lightService.check();
    }
}