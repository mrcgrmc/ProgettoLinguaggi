package univr.it;

import univr.it.sigma.SigmaParser;

import java.util.List;

public class FuncDef {
    private final List<String> paramNames;
    private final SigmaParser.BlockContext body;

    public FuncDef(List<String> params, SigmaParser.BlockContext block) {
        this.paramNames = params;
        this.body       = block;
    }

    public List<String> getParamNames() {
        return paramNames;
    }
    public SigmaParser.BlockContext getBody() {
        return body;
    }
}