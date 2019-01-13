package org.wltea.analyzer.util;

import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.util.TokenizerFactory;
import org.apache.lucene.util.AttributeFactory;
import org.wltea.analyzer.lucene.IKTokenizer;

import java.util.Map;

public class IKTokenizerFactory extends TokenizerFactory {
    private boolean useSmart;

    protected IKTokenizerFactory(Map<String, String> args) {
        super(args);
        useSmart = getBoolean(args, "useSmart", false);
    }

    @Override
    public Tokenizer create(AttributeFactory attributeFactory) {
        return new IKTokenizer(useSmart);
    }
}
