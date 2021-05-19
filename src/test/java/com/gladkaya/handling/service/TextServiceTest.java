package com.gladkaya.handling.service;

import com.gladkaya.handling.entity.ComponentType;
import com.gladkaya.handling.entity.impl.TextComposite;
import com.gladkaya.handling.exception.ProjectException;
import com.gladkaya.handling.parser.TextParser;
import com.gladkaya.handling.reader.DataReader;
import com.gladkaya.handling.service.impl.TextServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextServiceTest {
    public final static String path = "src/test/resources/dataForTest.txt";

    @Test
    public void sortByCountOfSentencesTest() throws ProjectException {
        DataReader dataReader = new DataReader();
        String text = dataReader.readData(path);
        TextComposite composite = new TextComposite(ComponentType.TEXT);
        String expected = "   It has survived - not only (five) centuries.  \n" +
                "    But also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the “Dinamo” (Riga) with the release of Letraset sheets.toString() containing Lorem Ipsum passages.   \n" +
                "    And more recently with desktop publishing software like Aldus PageMaker Faclon9. Including versions of Lorem Ipsum! It is a long a!=b established fact that a reader will be distracted by the readable content of a page when looking at its layout.  \n";

        TextParser textParser = new TextParser();
        textParser.parseRequest(composite, text);
        TextService sortParagraph = new TextServiceImpl();
        composite = sortParagraph.sortByCountOfSentences(composite);
        String actual = composite.toString();
        Assert.assertEquals(actual, expected);
    }
}
