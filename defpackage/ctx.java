package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
class ctx implements Serializable, csp {
    private static final long serialVersionUID = 1;
    final cuu a;

    public ctx(cuu cuuVar) {
        this.a = cuuVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    Object writeReplace() {
        return new cty(this.a);
    }
}
