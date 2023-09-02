package com.core.im.tenant.dto.request;

import java.util.Map;

public class OptionParams {
    private Map<String, Object> map;

    public Object getObject(String paramName) {
        return map.get(paramName);
    }

    public Object getOrDefault(String paramName, Object defaultObject) {
        return map.getOrDefault(paramName, defaultObject);
    }

    public void setObject(String paramName, Object paramValue) {
        map.put(paramName, paramValue);
    }
}
