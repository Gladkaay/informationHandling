package com.gladkaya.handling.parser;

import com.gladkaya.handling.entity.ComponentType;
import com.gladkaya.handling.entity.TextComponent;
import com.gladkaya.handling.entity.impl.TextComposite;
import com.gladkaya.handling.exception.ProjectException;

public class ParagraphParser extends AbstractTextParser {
    private static final String SENTENCE_REGEX = "\\s+[^.?!...]*[.?!...]";

    @Override
    public void parseRequest(TextComponent composite, String data) throws ProjectException {
        String[] sentences = data.split(SENTENCE_REGEX);

        for (String sentence : sentences) {
            TextComposite current = new TextComposite(ComponentType.SENTENCE);
            composite.add(current);
            nextParser.parseRequest(current, sentence);
        }
    }
}
