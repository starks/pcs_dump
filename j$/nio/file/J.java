package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes2.dex */
public final /* synthetic */ class J implements WatchEvent.Kind {
    public final /* synthetic */ K a;

    private /* synthetic */ J(K k) {
        this.a = k;
    }

    public static /* synthetic */ WatchEvent.Kind a(K k) {
        if (k == null) {
            return null;
        }
        return k instanceof I ? ((I) k).a : new J(k);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        K k = this.a;
        if (obj instanceof J) {
            obj = ((J) obj).a;
        }
        return k.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
