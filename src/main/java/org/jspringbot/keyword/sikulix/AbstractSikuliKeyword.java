package org.jspringbot.keyword.sikulix;

import org.jspringbot.Keyword;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractSikuliKeyword implements Keyword {

    @Autowired
    protected SikuliXHelper helper;
}