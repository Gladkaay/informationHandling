package com.gladkaya.handling.entity;

import com.gladkaya.handling.exception.ProjectException;

import java.util.List;

public interface TextComponent {
    boolean add(TextComponent textComponent) throws ProjectException;
    boolean remove(TextComponent textComponent) throws ProjectException;
    ComponentType getComponentType();
    List<TextComponent> getTextComponent() throws ProjectException;
}
