package com.gladkaya.handling.parser;

import com.gladkaya.handling.entity.ComponentType;
import com.gladkaya.handling.entity.TextComponent;
import com.gladkaya.handling.entity.impl.TextComposite;
import com.gladkaya.handling.exception.ProjectException;


public class LexemeParser extends AbstractTextParser {
    private static final String WORD_REGEX = "[a-zA-Z]+";

    @Override
    public void parseRequest(TextComponent composite, String data) throws ProjectException {
        String[] words = data.split(WORD_REGEX);

        for (String word : words) {
            TextComposite current = new TextComposite(ComponentType.WORD);
            composite.add(current);
            nextParser.parseRequest(current, word);
        }
    }
}
