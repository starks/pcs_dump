package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import java.io.File;
import java.net.URI;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Path, j$.lang.a {
    public final /* synthetic */ java.nio.file.Path a;

    private /* synthetic */ u(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path g(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof v ? ((v) path).a : new u(path);
    }

    @Override // j$.nio.file.Path
    /* renamed from: E */
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(v.g(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean K(Path path) {
        return this.a.startsWith(v.g(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path Q(Path path) {
        return g(this.a.relativize(v.g(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean S(Path path) {
        return this.a.endsWith(v.g(path));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo((java.nio.file.Path) H.b(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return g(this.a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ AbstractC0020j getFileSystem() {
        return C0018h.m(this.a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return g(this.a.getName(i));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return g(this.a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return g(this.a.getRoot());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new A(this.a.iterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path k(Path path) {
        return g(this.a.resolveSibling(v.g(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ M l(N n, K[] kArr) {
        return M.a(this.a.register(n == null ? null : n.a, H.l(kArr)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return g(this.a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ M q(N n, K[] kArr, L[] lArr) {
        java.nio.file.Path path = this.a;
        WatchEvent.Modifier[] modifierArr = null;
        WatchService watchService = n == null ? null : n.a;
        WatchEvent.Kind[] kindArrL = H.l(kArr);
        if (lArr != null) {
            int length = lArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i = 0; i < length; i++) {
                L l = lArr[i];
                modifierArr2[i] = l == null ? null : l.a;
            }
            modifierArr = modifierArr2;
        }
        return M.a(path.register(watchService, kindArrL, modifierArr));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return g(this.a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return g(this.a.resolveSibling(str));
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.K.a(this.a.spliterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return g(this.a.subpath(i, i2));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return g(this.a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path w(Path path) {
        return g(this.a.resolve(v.g(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path x(EnumC0024n[] enumC0024nArr) {
        return g(this.a.toRealPath(H.k(enumC0024nArr)));
    }
}
