package com.gladkaya.handling.parser;

import com.gladkaya.handling.entity.ComponentType;
import com.gladkaya.handling.entity.Symbol;
import com.gladkaya.handling.entity.TextComponent;
import com.gladkaya.handling.entity.impl.TextComposite;
import com.gladkaya.handling.exception.ProjectException;
import com.gladkaya.handling.parser.AbstractTextParser;

public class WordParser extends AbstractTextParser {

    @Override
    public void parseRequest(TextComponent composite, String data) throws ProjectException {
        char[] symbols = data.toCharArray();
        for(char ch : symbols){
            TextComposite current = new TextComposite(ComponentType.SYMBOL);
            composite.add(new Symbol(ch, current));
        }
    }
}
