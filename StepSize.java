package com.kejiang.yuandl.view;

/**
 * Created by yuandl on 2016/8/2 0002.
 */
public enum StepSize {
    Half(0), Full(1);
    int step;

    StepSize(int step) {
        this.step = step;
    }

    static StepSize fromStep(int step) {
        for (StepSize f : values()) {
            if (f.step == step) {
                return f;
            }
        }
        throw new IllegalArgumentException();
    }
}
