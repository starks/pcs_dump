package j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0019i extends FileSystem {
    public final /* synthetic */ AbstractC0020j a;

    private /* synthetic */ C0019i(AbstractC0020j abstractC0020j) {
        this.a = abstractC0020j;
    }

    public static /* synthetic */ FileSystem c(AbstractC0020j abstractC0020j) {
        if (abstractC0020j == null) {
            return null;
        }
        return abstractC0020j instanceof C0018h ? ((C0018h) abstractC0020j).a : new C0019i(abstractC0020j);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0020j abstractC0020j = this.a;
        if (obj instanceof C0019i) {
            obj = ((C0019i) obj).a;
        }
        return abstractC0020j.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.c();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return v.g(this.a.d(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        return C.a(this.a.e(str));
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new z(this.a.f());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.g();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.nio.file.attribute.H h = this.a.h();
        int i = j$.nio.file.attribute.I.a;
        if (h == null) {
            return null;
        }
        return h.a;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.i();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        N nJ = this.a.j();
        if (nJ == null) {
            return null;
        }
        return nJ.a;
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        return j$.nio.file.spi.c.a(this.a.k());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.l();
    }
}
