package org.vaadin.spring.tutorial;

import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Panel;

@SpringViewDisplay
public class ViewPanel extends Panel {

    public ViewPanel() {
        setSizeFull();
    }
}
