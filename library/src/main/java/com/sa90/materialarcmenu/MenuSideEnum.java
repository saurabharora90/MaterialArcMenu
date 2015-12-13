package com.sa90.materialarcmenu;

/**
 * Created by Saurabh on 14/12/15.
 */
public enum MenuSideEnum {
    ARC_LEFT(0), ARC_RIGHT(1);
    int id;

    MenuSideEnum(int id) {
        this.id = id;
    }

    public static MenuSideEnum fromId(int id) {
        for (MenuSideEnum f : values()) {
            if (f.id == id) return f;
        }
        return ARC_LEFT;
    }
}