package com.example.cahe.uitil;

public enum DateFiter {
    ThisWeek("This_Week"),
    LastWeek("Last_Week"),
    ThisMonth("This_Month"),
    LastMonth("Last_Week");
    private String value;

    DateFiter(String value) {
        this.value = value;
    }
}
