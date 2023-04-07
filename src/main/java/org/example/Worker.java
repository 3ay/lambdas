package org.example;

public class Worker {
    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }
    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String errorMessage);
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if ( i == 33)
            {
                errorCallback.onError("Task " + i + " is failed");
            }
            else
            {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
