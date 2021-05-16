package com.gladkaya.handling._main;

import com.gladkaya.handling.entity.ComponentType;
import com.gladkaya.handling.entity.impl.TextComposite;
import com.gladkaya.handling.exception.ProjectException;
import com.gladkaya.handling.reader.DataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskMain {
    private final static Logger logger = LogManager.getLogger();
    public final static String path = "data.txt";

    public static void main(String[] args) throws ProjectException {
        DataReader dataReader = new DataReader();
       // String text = dataReader.readData(path);
        //TextComposite composite = new TextComposite(ComponentType.TEXT);
       // parser.parse(composite, text);
      //  System.out.println(composite);

    }
}
