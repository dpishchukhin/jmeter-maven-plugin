package com.lazerycode.jmeter.threadhandling;

public class ExitException extends SecurityException {

    public int status;

    public ExitException(int status) {
        super("System Exit Captured!");
        this.status = status;
        Thread.currentThread().getThreadGroup().interrupt();
    }

    public int getCode() {
        return status;
    }
}
