package com.example3.fixxed;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/8
 **/
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ServiceImpl {

}
