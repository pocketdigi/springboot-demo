package com.pocketdigi.client;

import com.pocketdigi.client.dto.ConfigDTO;

/**
 * Created by Exception on 2017/8/2.
 */
public interface ConfigService {
    ConfigDTO getConfig(Integer configId);
}
