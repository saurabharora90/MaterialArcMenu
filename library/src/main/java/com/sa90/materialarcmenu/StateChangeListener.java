package com.sa90.materialarcmenu;

/**
 * Created by Saurabh on 25/12/15.
 *
 * Interface for listening to the state changes of the menu
 */
public interface StateChangeListener {

    /**
     * Fired when the ArcMenu is opened
     */
    void onMenuOpened();

    /**
     * Fired when the arc menu is closed
     */
    void onMenuClosed();
}
