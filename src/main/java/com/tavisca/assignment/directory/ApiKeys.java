package com.tavisca.assignment.directory;

public enum ApiKeys {

    GOOGLE_API_KEY(" AIzaSyDCCUVqrzmMur5fKVMqPcEa9YV6jVBGp8E"),
    FOUR_SQUARE_API_KEY("something");

    private String key;

    ApiKeys(String key) {
        this.key = key;
    }
}
