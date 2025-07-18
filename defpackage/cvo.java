package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvo extends cuy {
    private static final long serialVersionUID = 0;
    transient int c;

    public cvo() {
        super(new cwd(null), null);
        dcr.O(3, "expectedValuesPerKey");
        this.c = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int i = objectInputStream.readInt();
        cwd cwdVar = new cwd();
        ((cvj) this).a = cwdVar;
        ((cvj) this).b = 0;
        for (V v : cwdVar.values()) {
            clq.v(!v.isEmpty());
            ((cvj) this).b += v.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            List listB = b(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                listB.add(objectInputStream.readObject());
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        dcr.k(this, objectOutputStream);
    }

    @Override // defpackage.cuy, defpackage.cvj
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.c);
    }
}
