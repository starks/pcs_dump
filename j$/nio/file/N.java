package j$.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.WatchService;

/* loaded from: classes2.dex */
public final /* synthetic */ class N implements Closeable {
    public final /* synthetic */ WatchService a;

    private /* synthetic */ N(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ N c(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return new N(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof N) {
            obj = ((N) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
