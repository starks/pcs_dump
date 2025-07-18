package j$.desugar.sun.nio.fs;

import j$.nio.file.AbstractC0020j;
import j$.nio.file.EnumC0002a;
import j$.nio.file.EnumC0024n;
import j$.nio.file.K;
import j$.nio.file.L;
import j$.nio.file.M;
import j$.nio.file.N;
import j$.nio.file.Path;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.io.File;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class o implements Path {
    private static final Pattern h = Pattern.compile("/+");
    private final AbstractC0020j a;
    private final String b;
    private final List c;
    private final boolean d;
    private final String e;
    private final String f;
    private volatile byte[] g;

    public o(AbstractC0020j abstractC0020j, String str, String str2, String str3) {
        this(abstractC0020j, str.startsWith("/"), str.isEmpty() ? Collections.singletonList("") : (List) DesugarArrays.stream(h.split(str)).filter(new n()).collect(Collectors.a()), str2, str3);
    }

    @Override // java.lang.Comparable
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Path path) {
        return this.b.compareTo(((o) path).b);
    }

    @Override // j$.nio.file.Path
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final o toAbsolutePath() {
        if (this.d) {
            return this;
        }
        String str = this.f;
        AbstractC0020j abstractC0020j = this.a;
        String str2 = this.e;
        return new o(abstractC0020j, str2, str2, str).w(this);
    }

    @Override // j$.nio.file.Path
    public final boolean K(Path path) {
        int nameCount;
        path.getClass();
        if (path instanceof o) {
            if (this.d == path.isAbsolute() && this.c.size() >= (nameCount = path.getNameCount())) {
                for (int i = 0; i < nameCount; i++) {
                    if (getName(i).equals(path.getName(i))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // j$.nio.file.Path
    public final Path Q(Path path) {
        int i = 0;
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        if (this.d != ((o) path).d) {
            throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
        }
        List list = ((o) path).c;
        List list2 = this.c;
        int size = list2.size();
        int size2 = list.size();
        while (i < size && i < size2 && ((String) list2.get(i)).equals(list.get(i))) {
            i++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i; i2 < size; i2++) {
            arrayList.add("..");
        }
        while (i < size2) {
            arrayList.add((String) list.get(i));
            i++;
        }
        return new o(this.a, false, arrayList, this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final boolean S(Path path) {
        path.getClass();
        if (!(path instanceof o)) {
            return false;
        }
        if (path.isAbsolute()) {
            return equals(path);
        }
        int nameCount = path.getNameCount();
        List list = this.c;
        if (list.size() < nameCount) {
            return false;
        }
        int size = list.size();
        for (int i = nameCount - 1; i >= 0; i--) {
            if (!getName((i - nameCount) + size).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(String str) {
        return S(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean equals(Object obj) {
        return (obj instanceof o) && compareTo((o) obj) == 0;
    }

    final byte[] g() {
        if (this.g == null) {
            this.g = this.b.getBytes(q.a());
        }
        return this.g;
    }

    @Override // j$.nio.file.Path
    public final Path getFileName() {
        List list = this.c;
        if (list.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        return new o(this.a, (String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final AbstractC0020j getFileSystem() {
        return this.a;
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // j$.nio.file.Path
    public final Path getRoot() {
        if (!this.d) {
            return null;
        }
        String str = this.e;
        AbstractC0020j abstractC0020j = this.a;
        String str2 = this.f;
        return new o(abstractC0020j, str2, str, str2);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return Path.CC.a(this);
    }

    @Override // j$.nio.file.Path
    public final M l(N n, K... kArr) {
        q(n, kArr, new L[0]);
        throw null;
    }

    @Override // j$.nio.file.Path
    public final Path normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        return new o(this.a, (this.d ? "/" : "") + g.a(arrayDeque), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final o getName(int i) {
        if (i >= 0) {
            List list = this.c;
            if (i < list.size()) {
                return new o(this.a, (String) list.get(i), this.e, this.f);
            }
        }
        throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
    }

    @Override // j$.nio.file.Path
    public final M q(N n, K[] kArr, L... lArr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path
    public final Path resolve(String str) {
        return w(getFileSystem().d(str, new String[0]));
    }

    @Override // j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return k(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(String str) {
        return K(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final Path subpath(int i, int i2) {
        return new o(this.a, g.a(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final o getParent() {
        List list = this.c;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        boolean z = this.d;
        if (size == 1 && !z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("/");
        }
        sb.append(g.a(list.subList(0, size - 1)));
        return new o(this.a, sb.toString(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final File toFile() {
        return new File(this.b);
    }

    @Override // j$.nio.file.Path
    public final String toString() {
        return this.b;
    }

    @Override // j$.nio.file.Path
    public final URI toUri() {
        return p.f(this);
    }

    @Override // j$.nio.file.Path
    public final Path x(EnumC0024n[] enumC0024nArr) {
        AbstractC0020j abstractC0020j = this.a;
        abstractC0020j.k().a(this, EnumC0002a.READ);
        return Arrays.asList(enumC0024nArr).contains(EnumC0024n.NOFOLLOW_LINKS) ? toAbsolutePath() : new o(abstractC0020j, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final o w(Path path) {
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        if (((o) path).d) {
            return (o) path;
        }
        return new o(this.a, this.b + "/" + String.valueOf(path), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final o k(Path path) {
        path.getClass();
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        o parent = getParent();
        return parent == null ? (o) path : parent.w(path);
    }

    private o(AbstractC0020j abstractC0020j, boolean z, List list, String str, String str2) {
        this.a = abstractC0020j;
        this.d = z;
        this.c = list;
        String str3 = z ? "/" : "";
        this.b = str3 + g.a(list);
        this.e = str;
        this.f = str2;
    }
}
