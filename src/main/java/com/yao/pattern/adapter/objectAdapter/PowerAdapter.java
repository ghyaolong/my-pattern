package com.yao.pattern.adapter.objectAdapter;

import com.yao.pattern.adapter.classAdapter.AC220;
import com.yao.pattern.adapter.classAdapter.DC5;

public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int output5V() {
        int output = 0;
        if (ac220 != null) {
            output = ac220.output220V() / 44;
        }
        return output;
    }
}
