package org.vaadin.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@Theme("valo")
@SpringUI
public class MyVaadinUI extends UI {
    @Autowired
    private Greeter greeter;

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label(greeter.sayHello()));
    }
}