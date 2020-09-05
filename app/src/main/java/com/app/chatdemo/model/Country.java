package com.app.chatdemo.model;

public class Country {
    private String code;
    private String name;
    private String dialCode;
    public Country(String code, String name, String dialCode) {
        this.code = code;
        this.name = name;
        this.dialCode = dialCode;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDialCode() {
        return dialCode;
    }

    public void setDialCode(String dialCode) {
        this.dialCode = dialCode;
    }
}
