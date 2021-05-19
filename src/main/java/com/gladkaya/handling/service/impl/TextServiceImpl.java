package com.gladkaya.handling.service.impl;

import com.gladkaya.handling.entity.ComponentType;
import com.gladkaya.handling.entity.TextComponent;
import com.gladkaya.handling.entity.impl.TextComposite;
import com.gladkaya.handling.exception.ProjectException;
import com.gladkaya.handling.service.TextService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TextServiceImpl implements TextService {

    private static Logger logger = LogManager.getLogger();

    public TextComposite sortByCountOfSentences(TextComposite composite) throws ProjectException {
        if (composite.getComponentType() != ComponentType.TEXT) {
            logger.log(Level.INFO, "This composite isn`t a text");
        }
        TextComposite result = new TextComposite(ComponentType.TEXT);
        List<TextComponent> buffer = new ArrayList<>();
        for(TextComponent component : composite.getTextComponents()){
            buffer.add(component);
        }
        buffer.sort(Comparator.comparingInt(TextComponent::getAmount));
        buffer.forEach(o -> result.add(o));
        return result;
    }
}
