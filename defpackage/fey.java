package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fey {
    final Collection a;
    final int b;

    public fey(emv emvVar) {
        emvVar.getClass();
        if (emvVar.b.size() < 10) {
            this.a = emvVar.b;
        } else {
            this.a = new HashSet(emvVar.b);
        }
        Iterator it = emvVar.b.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((SocketAddress) it.next()).hashCode();
        }
        this.b = iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fey)) {
            return false;
        }
        fey feyVar = (fey) obj;
        if (feyVar.b == this.b && feyVar.a.size() == this.a.size()) {
            return feyVar.a.containsAll(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}
