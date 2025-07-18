package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cwr extends cxg implements Map, j$.util.Map {
    private static final long serialVersionUID = 912559;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract cwr a();

    @Override // defpackage.cxg
    public final /* bridge */ /* synthetic */ cwu b() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.cxg, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final cxo values() {
        return a().keySet();
    }

    @Override // defpackage.cxg
    public Object writeReplace() {
        return new cwq(this);
    }
}
