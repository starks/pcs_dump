package j$.nio.file;

import java.nio.file.WatchKey;

/* loaded from: classes2.dex */
public final /* synthetic */ class M {
    public final /* synthetic */ WatchKey a;

    private /* synthetic */ M(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ M a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return new M(watchKey);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof M) {
            obj = ((M) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
