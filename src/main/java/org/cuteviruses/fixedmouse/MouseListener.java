package org.cuteviruses.fixedmouse;

import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseMotionListener;

public class MouseListener implements NativeMouseMotionListener {
    public void nativeMouseMoved(NativeMouseEvent e) {
        MainController.moveMuseToCenter();
    }

    public void nativeMouseDragged(NativeMouseEvent e) {
        MainController.moveMuseToCenter();
    }
}
