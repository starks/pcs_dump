package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {

    /* renamed from: j$.nio.file.Path$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Iterator a(j$.desugar.sun.nio.fs.o oVar) {
            return new r(oVar);
        }

        public static Path of(String str, String... strArr) {
            return AbstractC0022l.a.d(str, strArr);
        }
    }

    /* renamed from: E */
    int compareTo(Path path);

    boolean K(Path path);

    Path Q(Path path);

    boolean S(Path path);

    boolean endsWith(String str);

    boolean equals(Object obj);

    Path getFileName();

    AbstractC0020j getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    Iterator iterator();

    Path k(Path path);

    M l(N n, K... kArr);

    Path normalize();

    M q(N n, K[] kArr, L... lArr);

    Path resolve(String str);

    Path resolveSibling(String str);

    boolean startsWith(String str);

    Path subpath(int i, int i2);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();

    Path w(Path path);

    Path x(EnumC0024n... enumC0024nArr);
}
