package com.gladkaya.handling._main;

import com.gladkaya.handling.entity.ComponentType;
import com.gladkaya.handling.entity.impl.TextComposite;
import com.gladkaya.handling.exception.ProjectException;
import com.gladkaya.handling.parser.*;
import com.gladkaya.handling.reader.DataReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskMain {
    private final static Logger logger = LogManager.getLogger();
    public final static String path = "src/main/resources/data.txt";

    public static void main(String[] args) throws ProjectException {
        DataReader dataReader = new DataReader();
        TextParser textParser = new TextParser();
        ParagraphParser paragraphParser = new ParagraphParser();
        SentenceParser sentenceParser = new SentenceParser();
        LexemeParser lexemeParser = new LexemeParser();
        WordParser wordParser = new WordParser();

        textParser.setNextParser(paragraphParser);
        paragraphParser.setNextParser(sentenceParser);
        sentenceParser.setNextParser(lexemeParser);
        lexemeParser.setNextParser(wordParser);

        String text = dataReader.readData(path);

        TextComposite composite = new TextComposite(ComponentType.TEXT);
        textParser.parseRequest(composite, text);
        logger.log(Level.INFO, text);

    }
}
