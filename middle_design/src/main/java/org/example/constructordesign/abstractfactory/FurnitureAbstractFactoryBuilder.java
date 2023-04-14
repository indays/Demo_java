package org.example.constructordesign.abstractfactory;

import org.example.entity.BButton;
import org.example.entity.Button;

public class FurnitureAbstractFactoryBuilder {

    // 工厂设计模式
    // 只专注一个工厂对象


    private Button createBButton() {

        return new BButton();
    }



}
