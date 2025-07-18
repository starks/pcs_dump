package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements FileAttribute {
    public final /* synthetic */ m a;

    private /* synthetic */ l(m mVar) {
        this.a = mVar;
    }

    public static /* synthetic */ FileAttribute a(m mVar) {
        if (mVar == null) {
            return null;
        }
        return mVar instanceof k ? ((k) mVar).a : new l(mVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        m mVar = this.a;
        if (obj instanceof l) {
            obj = ((l) obj).a;
        }
        return mVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
