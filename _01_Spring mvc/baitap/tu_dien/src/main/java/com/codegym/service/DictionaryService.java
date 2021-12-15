package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    String[] wordEnglish={"banana","orange","apple"};
    String[] wordVietnam={"chuoi","cam","tao"};

    @Override
    public String[] getWordEnglish(){
        return wordEnglish;
    }

    @Override
    public String[] getWordVietnam() {
        return wordVietnam;
    }

}
