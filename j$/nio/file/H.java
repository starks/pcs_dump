package j$.nio.file;

import j$.nio.file.attribute.C0003a;
import j$.nio.file.attribute.C0011i;
import j$.nio.file.attribute.InterfaceC0007e;
import j$.nio.file.attribute.InterfaceC0010h;
import j$.util.C0044d;
import java.nio.file.LinkOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class H {
    public static final K a = new G(Object.class, "OVERFLOW");
    public static final K b = new G(Path.class, "ENTRY_CREATE");
    public static final K c = new G(Path.class, "ENTRY_DELETE");
    public static final K d = new G(Path.class, "ENTRY_MODIFY");

    public static /* synthetic */ StandardOpenOption a(F f) {
        if (f == null) {
            return null;
        }
        return f == F.READ ? StandardOpenOption.READ : f == F.WRITE ? StandardOpenOption.WRITE : f == F.APPEND ? StandardOpenOption.APPEND : f == F.TRUNCATE_EXISTING ? StandardOpenOption.TRUNCATE_EXISTING : f == F.CREATE ? StandardOpenOption.CREATE : f == F.CREATE_NEW ? StandardOpenOption.CREATE_NEW : f == F.DELETE_ON_CLOSE ? StandardOpenOption.DELETE_ON_CLOSE : f == F.SPARSE ? StandardOpenOption.SPARSE : f == F.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Path ? v.g((Path) obj) : t.m(obj) ? u.g(t.e(obj)) : obj;
    }

    public static Class c(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.y()) {
            return InterfaceC0007e.class;
        }
        if (cls == InterfaceC0007e.class) {
            return j$.adapter.b.y();
        }
        if (cls == j$.adapter.b.A()) {
            return j$.nio.file.attribute.A.class;
        }
        if (cls == j$.nio.file.attribute.A.class) {
            return j$.adapter.b.A();
        }
        if (cls == j$.adapter.b.B()) {
            return j$.nio.file.attribute.w.class;
        }
        if (cls == j$.nio.file.attribute.w.class) {
            return j$.adapter.b.B();
        }
        if (cls == C0011i.class) {
            return j$.adapter.b.C();
        }
        if (cls == j$.adapter.b.C()) {
            return C0011i.class;
        }
        if (cls == j$.nio.file.attribute.D.class) {
            return j$.adapter.b.D();
        }
        if (cls == j$.adapter.b.D()) {
            return j$.nio.file.attribute.D.class;
        }
        if (cls == C0003a.class) {
            return j$.adapter.b.z();
        }
        if (cls == j$.adapter.b.z()) {
            return C0003a.class;
        }
        C0044d.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static Class d(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.a()) {
            return InterfaceC0010h.class;
        }
        if (cls == InterfaceC0010h.class) {
            return j$.adapter.b.a();
        }
        if (cls == j$.adapter.b.r()) {
            return j$.nio.file.attribute.B.class;
        }
        if (cls == j$.nio.file.attribute.B.class) {
            return j$.adapter.b.r();
        }
        if (cls == j$.nio.file.attribute.j.class) {
            return j$.adapter.b.v();
        }
        if (cls == j$.adapter.b.v()) {
            return j$.nio.file.attribute.j.class;
        }
        C0044d.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static Map e(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, f(map.get(str)));
        }
        return map2;
    }

    public static Object f(Object obj) {
        if (j$.adapter.b.p(obj)) {
            try {
                return j$.nio.file.attribute.p.b(j$.adapter.b.i(obj));
            } catch (ClassCastException e) {
                C0044d.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof j$.nio.file.attribute.y)) {
            return obj;
        }
        try {
            return j$.nio.file.attribute.p.d((j$.nio.file.attribute.y) obj);
        } catch (ClassCastException e2) {
            C0044d.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static Set g(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof q) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(p.a((q) it.next()));
                } catch (ClassCastException e) {
                    C0044d.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!j$.adapter.b.x(next)) {
                C0044d.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(o.a(j$.adapter.b.e(it2.next())));
                } catch (ClassCastException e2) {
                    C0044d.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static Set h(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof j$.nio.file.attribute.C) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.C c2 = (j$.nio.file.attribute.C) it.next();
                    hashSet.add(c2 == null ? null : c2 == j$.nio.file.attribute.C.OWNER_READ ? PosixFilePermission.OWNER_READ : c2 == j$.nio.file.attribute.C.OWNER_WRITE ? PosixFilePermission.OWNER_WRITE : c2 == j$.nio.file.attribute.C.OWNER_EXECUTE ? PosixFilePermission.OWNER_EXECUTE : c2 == j$.nio.file.attribute.C.GROUP_READ ? PosixFilePermission.GROUP_READ : c2 == j$.nio.file.attribute.C.GROUP_WRITE ? PosixFilePermission.GROUP_WRITE : c2 == j$.nio.file.attribute.C.GROUP_EXECUTE ? PosixFilePermission.GROUP_EXECUTE : c2 == j$.nio.file.attribute.C.OTHERS_READ ? PosixFilePermission.OTHERS_READ : c2 == j$.nio.file.attribute.C.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE);
                } catch (ClassCastException e) {
                    C0044d.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!j$.adapter.b.t(next)) {
                C0044d.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermissionJ = j$.adapter.b.j(it2.next());
                    hashSet.add(posixFilePermissionJ == null ? null : posixFilePermissionJ == PosixFilePermission.OWNER_READ ? j$.nio.file.attribute.C.OWNER_READ : posixFilePermissionJ == PosixFilePermission.OWNER_WRITE ? j$.nio.file.attribute.C.OWNER_WRITE : posixFilePermissionJ == PosixFilePermission.OWNER_EXECUTE ? j$.nio.file.attribute.C.OWNER_EXECUTE : posixFilePermissionJ == PosixFilePermission.GROUP_READ ? j$.nio.file.attribute.C.GROUP_READ : posixFilePermissionJ == PosixFilePermission.GROUP_WRITE ? j$.nio.file.attribute.C.GROUP_WRITE : posixFilePermissionJ == PosixFilePermission.GROUP_EXECUTE ? j$.nio.file.attribute.C.GROUP_EXECUTE : posixFilePermissionJ == PosixFilePermission.OTHERS_READ ? j$.nio.file.attribute.C.OTHERS_READ : posixFilePermissionJ == PosixFilePermission.OTHERS_WRITE ? j$.nio.file.attribute.C.OTHERS_WRITE : j$.nio.file.attribute.C.OTHERS_EXECUTE);
                } catch (ClassCastException e2) {
                    C0044d.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static /* synthetic */ EnumC0024n[] i(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        EnumC0024n[] enumC0024nArr = new EnumC0024n[length];
        for (int i = 0; i < length; i++) {
            enumC0024nArr[i] = linkOptionArr[i] == null ? null : EnumC0024n.NOFOLLOW_LINKS;
        }
        return enumC0024nArr;
    }

    public static K[] j(WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        K[] kArr = new K[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind = kindArr[i];
            kArr[i] = kind == null ? null : kind == StandardWatchEventKinds.ENTRY_CREATE ? b : kind == StandardWatchEventKinds.ENTRY_DELETE ? c : kind == StandardWatchEventKinds.ENTRY_MODIFY ? d : kind == StandardWatchEventKinds.OVERFLOW ? a : I.a(kind);
        }
        return kArr;
    }

    public static /* synthetic */ LinkOption[] k(EnumC0024n[] enumC0024nArr) {
        if (enumC0024nArr == null) {
            return null;
        }
        int length = enumC0024nArr.length;
        LinkOption[] linkOptionArr = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr[i] = enumC0024nArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr;
    }

    public static WatchEvent.Kind[] l(K[] kArr) {
        if (kArr == null) {
            return null;
        }
        int length = kArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            kindArr[i] = k == null ? null : k == b ? StandardWatchEventKinds.ENTRY_CREATE : k == c ? StandardWatchEventKinds.ENTRY_DELETE : k == d ? StandardWatchEventKinds.ENTRY_MODIFY : k == a ? StandardWatchEventKinds.OVERFLOW : J.a(k);
        }
        return kindArr;
    }
}
