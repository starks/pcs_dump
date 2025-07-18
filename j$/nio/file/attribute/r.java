package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements FileAttributeView {
    public final /* synthetic */ s a;

    private /* synthetic */ r(s sVar) {
        this.a = sVar;
    }

    public static /* synthetic */ FileAttributeView a(s sVar) {
        if (sVar == null) {
            return null;
        }
        return sVar instanceof q ? ((q) sVar).a : sVar instanceof InterfaceC0007e ? C0006d.a((InterfaceC0007e) sVar) : sVar instanceof w ? v.a((w) sVar) : sVar instanceof D ? ((D) sVar).a : new r(sVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        s sVar = this.a;
        if (obj instanceof r) {
            obj = ((r) obj).a;
        }
        return sVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
