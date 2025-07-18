package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhc implements Externalizable {
    private static final long serialVersionUID = 0;
    private Map a;

    public fhc(Map map) {
        this.a = map;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        objectInput.getClass();
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException(a.x(b, "Unsupported flags value: "));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.E(i, "Illegal size value: ", "."));
        }
        fgy fgyVar = new fgy(i);
        for (int i2 = 0; i2 < i; i2++) {
            fgyVar.put(objectInput.readObject(), objectInput.readObject());
        }
        this.a = ffh.s(fgyVar);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public fhc() {
        this(fgn.a);
    }
}
