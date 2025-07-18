package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqy {
    public static final Pattern a;
    public static final cxc b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;

    static {
        Pattern patternCompile = Pattern.compile("^(\\(at tf_wrapper.cc:\\d+\\) Error in \\w+::\\w*\\(\\): [^:]*): (.*)$", 32);
        c = patternCompile;
        Pattern patternCompile2 = Pattern.compile("^(TensorflowException \\(code=\\d+\\)): (.*)$", 32);
        d = patternCompile2;
        a = Pattern.compile("(Op type not registered '[^']*')");
        Pattern patternCompile3 = Pattern.compile("^(Error during eligibility eval computation: code: \\d+, error: Error in \\w+::\\w*\\(\\): [^:]*): (.*)$", 32);
        e = patternCompile3;
        Pattern patternCompile4 = Pattern.compile("^(Error during computation: code: \\d+, error: Error in \\w+::\\w*\\(\\): [^:]*): (.*)$", 32);
        f = patternCompile4;
        b = cxc.s(patternCompile, patternCompile4, patternCompile2, patternCompile3);
    }

    public static String a(Matcher matcher, int i) {
        return clq.N(matcher.group(i));
    }
}
