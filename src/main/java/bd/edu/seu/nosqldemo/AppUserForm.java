package bd.edu.seu.nosqldemo;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;

public class AppUserForm extends FormLayout {
    private TextField idField;
    private TextField nameField;
    private TextField emailField;
    private TextField phoneField;

    public AppUserForm() {
        idField = new TextField("ID");
        nameField = new TextField("Name");
        emailField = new TextField("Email");
        phoneField = new TextField("Phone");
        add(idField, nameField, emailField, phoneField);
    }
}
