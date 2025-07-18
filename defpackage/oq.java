package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oq {
    public Object a;
    public ou b;
    public ov c = new ov();
    private boolean d;

    private final void c() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(Object obj) {
        this.d = true;
        ou ouVar = this.b;
        if (ouVar == null || !ouVar.b.e(obj)) {
            return;
        }
        c();
    }

    public final void b(Throwable th) {
        this.d = true;
        ou ouVar = this.b;
        if (ouVar == null || !ouVar.a(th)) {
            return;
        }
        c();
    }

    protected final void finalize() {
        ov ovVar;
        ou ouVar = this.b;
        if (ouVar != null && !ouVar.isDone()) {
            Object obj = this.a;
            Objects.toString(obj);
            ouVar.a(new or("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
        }
        if (this.d || (ovVar = this.c) == null) {
            return;
        }
        ovVar.e(null);
    }
}
