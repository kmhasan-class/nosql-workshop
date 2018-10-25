package bd.edu.seu.nosqldemo;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class AppUserView extends VerticalLayout {
    private AppUserForm appUserForm;

    public AppUserView() {
        appUserForm = new AppUserForm();
        add(appUserForm);
    }
}
