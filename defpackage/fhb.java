package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhb implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection a;
    private final int b;

    public fhb(Collection collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        Collection collectionY;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException(a.E(b, "Unsupported flags value: ", "."));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(a.E(i2, "Illegal size value: ", "."));
        }
        int i3 = 0;
        if (i != 0) {
            fhd fhdVar = new fhd(new fgy(i2));
            while (i3 < i2) {
                fhdVar.add(objectInput.readObject());
                i3++;
            }
            collectionY = ffh.p(fhdVar);
        } else {
            fgt fgtVar = new fgt(i2);
            while (i3 < i2) {
                fgtVar.add(objectInput.readObject());
                i3++;
            }
            collectionY = ffh.y(fgtVar);
        }
        this.a = collectionY;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public fhb() {
        this(fgm.a, 0);
    }
}
