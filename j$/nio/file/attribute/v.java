package j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements FileOwnerAttributeView {
    public final /* synthetic */ w a;

    private /* synthetic */ v(w wVar) {
        this.a = wVar;
    }

    public static /* synthetic */ FileOwnerAttributeView a(w wVar) {
        if (wVar == null) {
            return null;
        }
        return wVar instanceof u ? ((u) wVar).a : wVar instanceof C0003a ? ((C0003a) wVar).a : wVar instanceof A ? ((A) wVar).a : new v(wVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        w wVar = this.a;
        if (obj instanceof v) {
            obj = ((v) obj).a;
        }
        return wVar.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return F.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.a.b(E.a(userPrincipal));
    }
}
