package com.yun.vo;

public class Test {
    private String aa;

    private String ss;

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa == null ? null : aa.trim();
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss == null ? null : ss.trim();
    }
}