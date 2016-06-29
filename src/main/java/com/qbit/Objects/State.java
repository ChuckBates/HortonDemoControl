package com.qbit.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * User: cbates
 */
public class State {

    @SerializedName("Code")
    private int code;

    @SerializedName("Name")
    private String name;

    public State(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
