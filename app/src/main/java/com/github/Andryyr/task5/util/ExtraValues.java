package com.github.Andryyr.task5.util;

public enum ExtraValues {
    EXTRA_CACHEPATH("com.github.Andryyr.task5.extra.cachepath"),
    EXTRA_URL("com.github.Andryyr.task5.extra.URL"),
    EXTRA_DESC("com.github.Andryyr.task5.extra.DESC"),
    EXTRA_ID("com.github.Andryyr.task5.extra.ID"),
    DATA_KEY_ARRAY("com.github.Andryyr.task5.dataKeyArray"),
    DATA_KEY_DETAIL("com.github.Andryyr.task5.dataKeyDetail");

    private String extraString;

    ExtraValues(String extraString) {
        this.extraString = extraString;
    }

    @Override
    public String toString() {
        return extraString;
    }

}
