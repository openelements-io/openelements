package io.open.elements.util;

import java.util.Comparator;

import io.open.elements.OpenElementBase;

public class SeqIdComparator implements Comparator<OpenElementBase> {

    @Override
    public int compare(OpenElementBase o1, OpenElementBase o2) {
       return o1.getSeqId().compareTo(o2.getSeqId());
    }
    
}
