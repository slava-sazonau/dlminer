package io.dlminer.graph;

import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLLiteral;

/**
 * Created by slava on 13/03/17.
 */
public class GDataEdge extends DataEdge {

    public GDataEdge(ALCNode subject, OWLDataPropertyExpression label, LiteralNode object) {
        init(subject, label, object);
    }

}
