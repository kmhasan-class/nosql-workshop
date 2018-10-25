package bd.edu.seu.nosqldemo;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.converter.StringToIntegerConverter;
import com.vaadin.flow.data.validator.EmailValidator;

public class AppUserForm extends FormLayout {
    private TextField idField;
    private TextField nameField;
    private TextField emailField;
    private TextField phoneField;

    private Binder<AppUser> appUserBinder;

    public AppUserForm() {
        idField = new TextField("ID");
        nameField = new TextField("Name");
        emailField = new TextField("Email");
        phoneField = new TextField("Phone");
        add(idField, nameField, emailField, phoneField);

        appUserBinder = new Binder<>();

        appUserBinder
                .forField(nameField)
                .asRequired()
                .bind(AppUser::getName, AppUser::setName);

        appUserBinder
                .forField(emailField)
                .withValidator(new EmailValidator("Must enter valid email address"))
                .bind(AppUser::getEmail, AppUser::setEmail);

        appUserBinder
                .forField(phoneField)
                .bind(AppUser::getPhone, AppUser::setPhone);

        appUserBinder
                .forField(idField)
                .withConverter(new StringToIntegerConverter("Must enter a number"))
                .withValidator(integer -> integer >= 1000 && integer <= 9999, "Must be a 4 digit number")
                .bind(AppUser::getUserId, AppUser::setUserId);

    }

    public Binder<AppUser> getAppUserBinder() {
        return appUserBinder;
    }
}
