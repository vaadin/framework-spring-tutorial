package org.vaadin.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("valo")
@SpringUI
public class MyVaadinUI extends UI {

    @Autowired
    private ViewPanel viewContainer;

    @Autowired
    private NavigationBar navigationBar;

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout root = new VerticalLayout();
        root.setSizeFull();
        root.setMargin(true);
        root.setSpacing(true);
        setContent(root);

        root.addComponent(navigationBar);

        root.addComponent(viewContainer);
        root.setExpandRatio(viewContainer, 1.0f);
    }
}