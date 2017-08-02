package com.pocketdigi.biz.config;

import com.pocketdigi.client.ConfigService;
import com.pocketdigi.client.dto.ConfigDTO;
import com.alibaba.dubbo.config.annotation.Service;
import com.pocketdigi.dal.mapper.ConfigPOMapper;
import com.pocketdigi.dal.po.ConfigPO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Exception on 2017/8/2.
 */
@Service(interfaceClass = ConfigService.class)
@Component
public class ConfigServiceImpl implements ConfigService {
    @Autowired
    ConfigPOMapper configPOMapper;

    @Override
    public ConfigDTO getConfig(Integer configId) {
        ConfigPO configPO = configPOMapper.selectByPrimaryKey(configId);
        ConfigDTO configDTO = new ConfigDTO();
        BeanUtils.copyProperties(configPO,configDTO);
        return configDTO;
    }
}
