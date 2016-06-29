package com.qbit.Consts;

/**
 * User: chuck
 */
public enum InstanceStatusConst {

    PENDING("pending", 0),
    RUNNING("running", 16),
    STOPPED("stopped", 80),
    STOPPING("stopping", 64)
    ;

    private String name;
    private int code;

    InstanceStatusConst(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public static InstanceStatusConst getConstByName(String name) {
        for (InstanceStatusConst value : values()) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        return STOPPED;
    }
}
