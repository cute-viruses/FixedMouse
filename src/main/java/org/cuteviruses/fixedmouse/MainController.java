package org.cuteviruses.fixedmouse;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;

import java.awt.*;

public class MainController {
    public static Dimension screenDimension;
    public static Robot robot;

    public MainController() {
        try {
            initialize();
            addGlobalMouseListener();
            moveMuseToCenter();
        } catch (AWTException | NativeHookException e) {
            throw new RuntimeException(e);
        }

    }

    private void addGlobalMouseListener() throws NativeHookException {
        GlobalScreen.registerNativeHook();
        GlobalScreen.addNativeMouseMotionListener(new MouseListener());
    }

    private void initialize() throws AWTException {
        robot = new Robot();
        screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
    }

    public static void moveMuseToCenter() {
        robot.mouseMove(screenDimension.width / 2, screenDimension.height / 2);
    }
}
