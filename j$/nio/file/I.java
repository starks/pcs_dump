package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes2.dex */
public final /* synthetic */ class I implements K {
    public final /* synthetic */ WatchEvent.Kind a;

    private /* synthetic */ I(WatchEvent.Kind kind) {
        this.a = kind;
    }

    public static /* synthetic */ K a(WatchEvent.Kind kind) {
        if (kind == null) {
            return null;
        }
        return kind instanceof J ? ((J) kind).a : new I(kind);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.K
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.K
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
