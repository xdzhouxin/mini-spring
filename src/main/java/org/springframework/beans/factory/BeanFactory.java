package org.springframework.beans.factory;

import java.util.HashMap;

/**
 * @author derekyi
 * @date 2020/11/22
 */
public class BeanFactory {
    private final HashMap<String, Object> hashMap = new HashMap<>();

    public void registerBean(String name, Object object) {
        hashMap.put(name, object);
    }

    public Object getBean(String name) {
        return hashMap.get(name);
    }
}
