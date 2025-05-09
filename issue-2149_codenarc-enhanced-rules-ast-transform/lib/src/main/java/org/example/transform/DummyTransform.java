package org.example.transform;

import org.codehaus.groovy.ast.ASTNode;
import org.codehaus.groovy.control.CompilePhase;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.transform.ASTTransformation;
import org.codehaus.groovy.transform.GroovyASTTransformation;

@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
public class DummyTransform implements ASTTransformation {
    @Override
    public void visit(ASTNode[] astNodes, SourceUnit sourceUnit) {
        System.out.println("[PSHEVCHE] Applying SameModuleTransform");
    }
}
