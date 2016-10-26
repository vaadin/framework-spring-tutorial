package org.vaadin.spring.tutorial;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewContainer;
import com.vaadin.ui.Panel;

@SpringComponent
@ViewContainer
public class ViewPanel extends Panel {

    public ViewPanel() {
        setSizeFull();
    }
}
