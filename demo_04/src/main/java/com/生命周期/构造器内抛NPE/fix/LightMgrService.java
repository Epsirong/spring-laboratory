package com.生命周期.构造器内抛NPE.fix;

import org.springframework.stereotype.Component;

@Component
public class LightMgrService {

    private LightService lightService;

    public LightMgrService(LightService lightService) {
        this.lightService = lightService;
        lightService.check();
    }

    //修正方法2
/*    @Autowired
    private LightService lightService;

    @PostConstruct
    public void init() {
        lightService.check();
    }*/

    //修正方法3
/*    @Autowired
    private LightService lightService;

    @Override
    public void afterPropertiesSet() throws Exception {
        lightService.check();
    }*/
}