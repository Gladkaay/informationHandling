package com.gladkaya.handling.entity.impl;

import com.gladkaya.handling.entity.TextComponent;
import com.gladkaya.handling.entity.ComponentType;
import com.gladkaya.handling.exception.ProjectException;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    private List<TextComponent> textComponents = new ArrayList<>();
    private ComponentType componentType;

    public TextComposite(ComponentType text) {
        this.componentType = text;
    }

    @Override
    public boolean add(TextComponent textComponent) {
        return textComponents.add(textComponent);
    }

    @Override
    public boolean remove(TextComponent textComponent) {
        return textComponents.remove(textComponent);
    }

    @Override
    public ComponentType getComponentType() {
        return componentType;
    }

    @Override
    public List<TextComponent> getTextComponents() throws ProjectException {
        return List.copyOf(textComponents);
    }

    @Override
    public int getAmount() {
        return textComponents.size();
    }
}
