package j$.nio.file;

import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.StandardCopyOption;

/* renamed from: j$.nio.file.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0013c implements CopyOption {
    public final /* synthetic */ InterfaceC0014d a;

    private /* synthetic */ C0013c(InterfaceC0014d interfaceC0014d) {
        this.a = interfaceC0014d;
    }

    public static /* synthetic */ CopyOption a(InterfaceC0014d interfaceC0014d) {
        if (interfaceC0014d == null) {
            return null;
        }
        if (interfaceC0014d instanceof C0012b) {
            return ((C0012b) interfaceC0014d).a;
        }
        if (interfaceC0014d instanceof EnumC0024n) {
            return LinkOption.NOFOLLOW_LINKS;
        }
        if (!(interfaceC0014d instanceof E)) {
            return new C0013c(interfaceC0014d);
        }
        E e = (E) interfaceC0014d;
        return e == E.REPLACE_EXISTING ? StandardCopyOption.REPLACE_EXISTING : e == E.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0014d interfaceC0014d = this.a;
        if (obj instanceof C0013c) {
            obj = ((C0013c) obj).a;
        }
        return interfaceC0014d.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
