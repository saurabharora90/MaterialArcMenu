[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-MaterialArcMenu-green.svg?style=true)](https://android-arsenal.com/details/1/2936)

Material Arc Menu
=================

An android custom view which allows you to have a arc style-menu on your pages and adheres to the material design specifications.

It inserts a FAB menu on the bottom left or bottom right of the screen and allows you to control the menu options.

It also implements the CoordinatorLayout Behaviour to work with Snackbar.

Change-logs
-------
Check out the [Release Notes](https://github.com/saurabharora90/MaterialArcMenu/releases "Releases") for the change-logs in each release.
Demo
-------
![Arc Menu](https://raw.githubusercontent.com/saurabharora90/MaterialArcMenu/develop/assets/show_menu.gif)

![Snackbar support](https://raw.githubusercontent.com/saurabharora90/MaterialArcMenu/develop/assets/snackbar.gif)

Usage
-------
Add a dependency to your `build.gradle`:

    dependencies {
    compile 'com.sa90.materialarcmenu:library:1.4.1'
}

and include the `com.sa90.materialarcmenu.ArcMenu` as a viewgroup (with the sub-menu's as child) in your layout. The menu (floating action button) has a margin of 16dp (customizable) added to it by default to follow the material design guidelines.
Example:

    <com.sa90.materialarcmenu.ArcMenu
        android:id="@+id/arcMenu"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|end"
        app:menu_scr="@drawable/ic_dialog_dialer"
        app:menu_open="arc_left">

        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab1"
            android:layout_width="wrap_content"
	        android:src="@drawable/ic_dialog_email"
            android:layout_height="wrap_content" />

        <android.support.design.widget.FloatingActionButton
            android:layout_width="wrap_content"
	        android:src="@drawable/ic_dialog_alert"
            android:layout_height="wrap_content" />

        <android.support.design.widget.FloatingActionButton
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_info"
            android:layout_height="wrap_content" />

        <android.support.design.widget.FloatingActionButton
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_map"
            android:layout_height="wrap_content" />

    </com.sa90.materialarcmenu.ArcMenu>

The sub-menu's (child) can be anything. Here is an ImageButton example:

    <com.sa90.materialarcmenu.ArcMenu
        android:id="@+id/arcMenu"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|start"
        app:menu_color="@color/colorPrimaryDark"
        app:menu_radius="200dp"
        app:menu_ripple_color="@color/darker_gray"
        app:menu_scr="@drawable/ic_dialog_dialer"
        app:menu_open="arc_right">

        <ImageButton
            android:id="@+id/ib1"
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_email"
            android:layout_height="wrap_content" />

        <ImageButton
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_alert"
            android:layout_height="wrap_content" />

        <ImageButton
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_info"
            android:layout_height="wrap_content" />

        <ImageButton
            android:layout_width="wrap_content"
            android:src="@drawable/ic_dialog_map"
            android:layout_height="wrap_content" />

        <ImageButton
            android:layout_width="wrap_content"
	        android:src="@drawable/ic_dialog_dialer"
            android:layout_height="wrap_content" />

    </com.sa90.materialarcmenu.ArcMenu>

Customization
-------
Currently the library offers the following customization options:

 - `menu_scr`: Controls the FAB Menu's image
 - `menu_color`: Controls the background color of the FAB Menu. Default to the `colorAccent`
 - `menu_ripple_color`: Controls the ripple color of the FAB Menu. Defaults to `colorControlHighlight`
 - `menu_radius`: Controls the radius of the arc
 - `menu_elevation`: Controls elevation (shadow cast) of the FAB Menu. Default to 6dp.
 - `menu_margin`: Controls the margin applied to the FAB Menu. Currently the same margin is applied to all four corners (defaults to 16dp).
 - `menu_open`: Controls which side of the FAB menu is the arc menu displayed on. Currently supports one of `arc_left` or `arc_right`
 - `menu_animation_time`: Controls the animation time to transition the menu from close to open state and vice versa. The time is represented in milli-seconds

API
-------
Currently the library offers the following API's

 - `toggleMenu`: Open or close the menu depending on its current state.
 - `setRadius`: Set the radius of the arc menu.
 - `isMenuOpened`: Returns whether the menu is opened or closed.
 - `setAnimationTime`: Controls the animation time to transition the menu from close to open state and vice versa. The time is represented in milli-seconds
 - `setStateChangeListener`: Allows you to listen to the state changes of the Menu, i.e. `onMenuOpened` and `onMenuClosed` events

License
-------

    Copyright 2015 Saurabh Arora

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
