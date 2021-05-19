package com.gladkaya.handling.service;

import com.gladkaya.handling.entity.impl.TextComposite;
import com.gladkaya.handling.exception.ProjectException;

public interface TextService {
    TextComposite sortByCountOfSentences(TextComposite composite) throws ProjectException;
}
