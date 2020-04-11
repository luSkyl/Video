package com.java.lcy.video.idwork;

public interface WorkerIdStrategy {
    void initialize();

    long availableWorkerId();

    void release();
}
