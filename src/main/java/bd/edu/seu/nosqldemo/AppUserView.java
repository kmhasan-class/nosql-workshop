package bd.edu.seu.nosqldemo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class AppUserView extends VerticalLayout {
    private AppUserForm appUserForm;
    private Button submitButton;

    private AppUser appUser;

    private AppUserRepository appUserRepository;

    public AppUserView(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;

        appUser = new AppUser();

        appUserForm = new AppUserForm();
        submitButton = new Button("Submit");
        add(appUserForm, submitButton);

        submitButton.addClickListener(buttonClickEvent -> {
            appUserForm.getAppUserBinder().writeBeanIfValid(appUser);
            Notification.show("Saving " + appUser.getName());
            appUserRepository.save(appUser);
            Notification.show("Saved " + appUser.getName());
        });
    }
}
