package com.java.lcy.video.idwork;

public interface RandomCodeStrategy {
    void init();

    int prefix();

    int next();

    void release();
}
