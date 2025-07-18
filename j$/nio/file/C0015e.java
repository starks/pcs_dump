package j$.nio.file;

import java.nio.file.FileStore;

/* renamed from: j$.nio.file.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0015e {
    public final /* synthetic */ FileStore a;

    private C0015e(FileStore fileStore) {
        this.a = fileStore;
    }

    public static /* synthetic */ C0015e a(FileStore fileStore) {
        if (fileStore == null) {
            return null;
        }
        return new C0015e(fileStore);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.a;
        if (obj instanceof C0015e) {
            obj = ((C0015e) obj).a;
        }
        return fileStore.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
