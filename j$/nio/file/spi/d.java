package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.AbstractC0020j;
import j$.nio.file.AbstractC0023m;
import j$.nio.file.C0015e;
import j$.nio.file.EnumC0002a;
import j$.nio.file.EnumC0024n;
import j$.nio.file.F;
import j$.nio.file.InterfaceC0014d;
import j$.nio.file.Path;
import j$.nio.file.attribute.InterfaceC0010h;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.s;
import j$.nio.file.q;
import j$.nio.file.w;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public abstract class d {
    private static final Set a = g.c(new Object[]{F.CREATE, F.TRUNCATE_EXISTING, F.WRITE});

    protected d() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public abstract void A(Path path, String str, Object obj, EnumC0024n... enumC0024nArr);

    public abstract void a(Path path, EnumC0002a... enumC0002aArr);

    public abstract void b(Path path, Path path2, InterfaceC0014d... interfaceC0014dArr);

    public abstract void c(Path path, m... mVarArr);

    public abstract void d(Path path, Path path2);

    public abstract void e(Path path, Path path2, m... mVarArr);

    public abstract void f(Path path);

    public abstract boolean g(Path path);

    public abstract s h(Path path, Class cls, EnumC0024n... enumC0024nArr);

    public abstract C0015e i(Path path);

    public abstract AbstractC0020j j(URI uri);

    public abstract Path k(URI uri);

    public abstract String l();

    public abstract boolean m(Path path);

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, InterfaceC0014d... interfaceC0014dArr);

    public abstract j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, m... mVarArr);

    public abstract SeekableByteChannel q(Path path, Set set, m... mVarArr);

    public abstract DirectoryStream r(Path path, w wVar);

    public abstract FileChannel s(Path path, Set set, m... mVarArr);

    public AbstractC0020j t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC0020j u(URI uri, Map map);

    public InputStream v(Path path, q... qVarArr) {
        Set set;
        if (qVarArr.length > 0) {
            for (q qVar : qVarArr) {
                if (qVar == F.APPEND || qVar == F.WRITE) {
                    throw new UnsupportedOperationException("'" + String.valueOf(qVar) + "' not allowed");
                }
            }
        }
        int i = AbstractC0023m.a;
        if (qVarArr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, qVarArr);
            set = hashSet;
        }
        return Channels.newInputStream(path.getFileSystem().k().q(path, set, new m[0]));
    }

    public OutputStream w(Path path, q... qVarArr) {
        Set set;
        if (qVarArr.length == 0) {
            set = a;
        } else {
            HashSet hashSet = new HashSet();
            for (q qVar : qVarArr) {
                if (qVar == F.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(qVar);
            }
            hashSet.add(F.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new m[0]));
    }

    public abstract InterfaceC0010h x(Path path, Class cls, EnumC0024n... enumC0024nArr);

    public abstract Map y(Path path, String str, EnumC0024n... enumC0024nArr);

    public abstract Path z(Path path);
}
