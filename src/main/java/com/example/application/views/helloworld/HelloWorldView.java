package com.example.application.views.helloworld;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import java.util.ArrayList;
import java.util.List;

@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HelloWorldView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;
    private ComboBox idade;

    List<Integer> listaDeInteiros = new ArrayList<>();


    public HelloWorldView() {
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        idade = new ComboBox("Escolha sua idade");
        idade.setItems(1,2,3,4,5,6,7,8,9,10);
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
       // setVerticalComponentAlignment(Alignment.END, name, idade,sayHello);
        VerticalLayout vl = new VerticalLayout(name, sayHello, idade);

        add(vl);
    }

}
