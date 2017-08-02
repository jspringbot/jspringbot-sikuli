package org.jspringbot.keyword.sikulix;

import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

public class SikuliXHelper {
    private Screen screen;

    public SikuliXHelper(Screen screen, String imagesPath) {
        this.screen = screen;
        ImagePath.add(imagesPath);
    }

    public void click(String path) throws FindFailed {
        screen.click(path);

    }

    public void doubleClick(String path) throws FindFailed {
        screen.doubleClick(path);
    }

    public void wait(String path) throws FindFailed {
        screen.wait(path);
    }

    public void wait(String path, int timeout) throws FindFailed {
        screen.wait(path, (double) timeout);
    }

    public void type(String text) {
        screen.type(text);
    }

    public void exists(String path) {
        screen.exists(path);
    }

    public void exists(String path, int timeout) {
        screen.exists(path, (double) timeout);
    }
}
