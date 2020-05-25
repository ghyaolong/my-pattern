package com.yao.pattern.adapter.classAdapter;

public class PowerAdapter extends AC220 implements DC5 {
    public int output5V() {
        int i = output220V();

        return i/44;
    }
}
