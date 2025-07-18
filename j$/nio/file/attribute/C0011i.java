package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;

/* renamed from: j$.nio.file.attribute.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0011i implements InterfaceC0007e {
    public final /* synthetic */ DosFileAttributeView a;

    private /* synthetic */ C0011i(DosFileAttributeView dosFileAttributeView) {
        this.a = dosFileAttributeView;
    }

    public static /* synthetic */ C0011i c(DosFileAttributeView dosFileAttributeView) {
        if (dosFileAttributeView == null) {
            return null;
        }
        return new C0011i(dosFileAttributeView);
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final /* synthetic */ void a(y yVar, y yVar2, y yVar3) throws IOException {
        this.a.setTimes(p.d(yVar), p.d(yVar2), p.d(yVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof C0011i) {
            obj = ((C0011i) obj).a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final /* synthetic */ InterfaceC0010h readAttributes() {
        return C0008f.a(this.a.readAttributes());
    }
}
