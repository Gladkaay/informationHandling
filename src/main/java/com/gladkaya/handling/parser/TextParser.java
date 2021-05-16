package com.gladkaya.handling.parser;

import com.gladkaya.handling.entity.ComponentType;
import com.gladkaya.handling.entity.TextComponent;
import com.gladkaya.handling.entity.impl.TextComposite;
import com.gladkaya.handling.exception.ProjectException;
import com.gladkaya.handling.parser.AbstractTextParser;
import com.gladkaya.handling.parser.ParagraphParser;

public class TextParser extends AbstractTextParser {
    private static final String PARAGRAPH_REGEX = "\\s{4}";
   // private static final String PATTERN_PARAGRAPH = "\\s{4}(.|!|\\?)+";

    @Override
    public void parseRequest(TextComponent composite, String data) throws ProjectException {
        String[] paragraphs = data.split(PARAGRAPH_REGEX);

        for (String paragraph : paragraphs) {
            TextComposite current = new TextComposite(ComponentType.PARAGRAPH);
            composite.add(current);
            nextParser.parseRequest(current, paragraph);
        }
    }
}
