package com.example.tiennguyen.circlemenu;

/**
 * Created by TIENNGUYEN on 8/28/2017.
 */

public interface IMenu {
    void collapse(boolean animate);
    void expand(boolean animate);
    void toggle(boolean animate);
    void setMenuLayout(FilterMenuLayout layout);
}
