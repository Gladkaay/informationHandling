package com.gladkaya.handling.reader;

import com.gladkaya.handling.exception.ProjectException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReader {
    private final static Logger logger = LogManager.getLogger();

    public String readData(String path) throws ProjectException {
        String text;
        try {
            text = new String(Files.readString(Paths.get(path)));
            logger.log(Level.INFO, "File has been read successfully");
        } catch (IOException e) {
            throw new ProjectException("Problem with reading file", e);
        }
        return text;
    }
}
