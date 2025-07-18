package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bnp {
    final String d;
    public final boi g;
    boolean f = false;
    public final bnj e = new bnj();

    public bnp(String str) {
        boh bohVar;
        int i = 0;
        this.d = str;
        String[] strArrSplit = elk.c().split(",");
        int length = strArrSplit.length;
        while (true) {
            if (i >= length) {
                bohVar = boh.COARSE;
                break;
            } else {
                if (str.equals(strArrSplit[i])) {
                    bohVar = boh.FINE;
                    break;
                }
                i++;
            }
        }
        this.g = new boi(bohVar, bnc.a);
    }

    final void b(bno bnoVar) {
        synchronized (this) {
            if (this.f) {
                bnoVar.close();
                return;
            }
            this.f = true;
            try {
                a(bnoVar);
            } catch (Exception unused) {
            }
        }
    }

    protected void a(bno bnoVar) {
    }
}
