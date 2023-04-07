package org.example.constructordesign.factory;

import org.example.entity.AButton;
import org.example.entity.Button;

public abstract class AButtonFactoryBuilder {


    private Button createAButton(){

        Button button = new AButton();

        return button;
    }




}
