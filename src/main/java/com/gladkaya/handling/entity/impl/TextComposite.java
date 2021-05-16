package com.gladkaya.handling.entity.impl;

import com.gladkaya.handling.entity.TextComponent;
import com.gladkaya.handling.entity.ComponentType;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    private List<TextComponent> textComponents = new ArrayList<>();
    private ComponentType componentType;
    public TextComposite(ComponentType text) {
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
    public List<TextComponent> getTextComponent() {
        return List.copyOf(textComponents);
    }
}
