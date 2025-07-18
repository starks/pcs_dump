package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxh {
    public Map a;
    public int b;

    public cxh() {
        this.b = 4;
    }

    public static cwt b(int i) {
        return cxc.j(i);
    }

    public final Map a() {
        Map map = this.a;
        if (map != null) {
            return map;
        }
        cwd cwdVar = new cwd();
        this.a = cwdVar;
        return cwdVar;
    }

    public cxh(byte[] bArr) {
        this();
    }
}
