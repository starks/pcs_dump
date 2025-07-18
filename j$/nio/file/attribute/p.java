package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class p {
    public static m a(FileAttribute fileAttribute) {
        if (fileAttribute == null) {
            return null;
        }
        return e(fileAttribute.value()) ? new n(fileAttribute) : k.a(fileAttribute);
    }

    public static y b(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return y.y(fileTime.toMillis());
    }

    public static FileAttribute c(m mVar) {
        if (mVar == null) {
            return null;
        }
        return e(mVar.value()) ? new o(mVar) : l.a(mVar);
    }

    public static FileTime d(y yVar) {
        if (yVar == null) {
            return null;
        }
        return FileTime.fromMillis(yVar.V());
    }

    private static boolean e(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof C) || j$.adapter.b.t(next);
    }

    public static /* synthetic */ long f(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ long g(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }
}
