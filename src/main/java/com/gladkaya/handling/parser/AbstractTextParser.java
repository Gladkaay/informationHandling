package com.gladkaya.handling.parser;

import com.gladkaya.handling.entity.TextComponent;
import com.gladkaya.handling.exception.ProjectException;

public abstract class AbstractTextParser {
    protected AbstractTextParser nextParser = DefaultTextParser.getParser();


    public AbstractTextParser(){}

    public AbstractTextParser(AbstractTextParser nextParser) {
        this.nextParser = nextParser;
    }

    public void setNextParser(AbstractTextParser nextParser) {
        this.nextParser = nextParser;
    }

     public abstract void parseRequest(TextComponent composite, String data) throws ProjectException;

    private static class DefaultTextParser extends AbstractTextParser{
        private static DefaultTextParser parser;

        public static AbstractTextParser getParser() {
            return parser;
        }

        @Override
        public void parseRequest(TextComponent composite, String data) {

        }
    }
}
