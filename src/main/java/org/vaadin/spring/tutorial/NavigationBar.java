package org.vaadin.spring.tutorial;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;

@UIScope
@SpringComponent
public class NavigationBar extends CssLayout {
    public NavigationBar() {
        addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
        addComponent(createNavigationButton("UI Scoped View",
                UIScopedView.VIEW_NAME));
        addComponent(createNavigationButton("View Scoped View",
                ViewScopedView.VIEW_NAME));
    }

    private Button createNavigationButton(String caption,
            final String viewName) {
        Button button = new Button(caption);
        button.addStyleName(ValoTheme.BUTTON_SMALL);
        // If you didn't choose Java 8 when creating the project, convert this
        // to an anonymous listener class
        button.addClickListener(
                event -> getUI().getNavigator().navigateTo(viewName));
        return button;
    }
}
