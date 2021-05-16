package com.gladkaya.handling.entity;

import com.gladkaya.handling.entity.impl.TextComposite;
import com.gladkaya.handling.exception.ProjectException;

import java.util.List;

public class Symbol implements TextComponent {
    private Character ch;
    private ComponentType componentType;

    public Symbol(char ch, TextComposite current) {
        this.ch = ch;
    }


    @Override
    public boolean add(TextComponent textComponent) throws ProjectException {
        throw new ProjectException();
    }

    @Override
    public boolean remove(TextComponent textComponent) throws ProjectException {
        throw new ProjectException();
    }

    @Override
    public ComponentType getComponentType() {
        return componentType;
    }

    @Override
    public List<TextComponent> getTextComponent() throws ProjectException {
        throw new ProjectException();
    }
}
