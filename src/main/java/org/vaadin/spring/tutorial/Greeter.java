package org.vaadin.spring.tutorial;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;

@SpringComponent
@UIScope
public class Greeter {
    public String sayHello() {
        return "Hello from bean " + toString();
    }
}
