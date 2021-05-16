package com.gladkaya.handling.parser;

import com.gladkaya.handling.entity.ComponentType;
import com.gladkaya.handling.entity.TextComponent;
import com.gladkaya.handling.entity.impl.TextComposite;
import com.gladkaya.handling.exception.ProjectException;
import com.gladkaya.handling.parser.AbstractTextParser;
import com.gladkaya.handling.parser.LexemeParser;

public class SentenceParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s";


    @Override
    public void parseRequest(TextComponent composite, String data) throws ProjectException {
        String[] lexemes = data.split(LEXEME_REGEX);

        for (String lexeme : lexemes) {
            TextComposite current = new TextComposite(ComponentType.LEXEME);
            composite.add(current);
            nextParser.parseRequest(current, lexeme);
        }
    }
}
