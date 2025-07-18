package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0006d implements BasicFileAttributeView {
    public final /* synthetic */ InterfaceC0007e a;

    private /* synthetic */ C0006d(InterfaceC0007e interfaceC0007e) {
        this.a = interfaceC0007e;
    }

    public static /* synthetic */ BasicFileAttributeView a(InterfaceC0007e interfaceC0007e) {
        if (interfaceC0007e == null) {
            return null;
        }
        return interfaceC0007e instanceof C0005c ? ((C0005c) interfaceC0007e).a : interfaceC0007e instanceof C0011i ? ((C0011i) interfaceC0007e).a : interfaceC0007e instanceof A ? ((A) interfaceC0007e).a : new C0006d(interfaceC0007e);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0007e interfaceC0007e = this.a;
        if (obj instanceof C0006d) {
            obj = ((C0006d) obj).a;
        }
        return interfaceC0007e.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0009g.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(p.b(fileTime), p.b(fileTime2), p.b(fileTime3));
    }
}
