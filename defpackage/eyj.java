package defpackage;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyj {
    public List a;
    public int b = 0;
    private final boolean c;

    public eyj(List list, boolean z) {
        this.c = z;
        e(list);
    }

    private static final List i(List list, List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        for (int i = 0; i < Math.max(list.size(), list2.size()); i++) {
            if (i < list.size()) {
                arrayList.add((frj) list.get(i));
            }
            if (i < list2.size()) {
                arrayList.add((frj) list2.get(i));
            }
        }
        return arrayList;
    }

    public final int a() {
        return this.a.size();
    }

    public final emv b() {
        if (!g()) {
            throw new IllegalStateException("Index is past the end of the address group list");
        }
        frj frjVar = (frj) this.a.get(this.b);
        return new emv((SocketAddress) frjVar.a, (elp) frjVar.b);
    }

    public final SocketAddress c() {
        if (g()) {
            return (SocketAddress) ((frj) this.a.get(this.b)).a;
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final void d() {
        this.b = 0;
    }

    public final void e(List list) {
        List listI;
        list.getClass();
        if (this.c) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = null;
            for (int i = 0; i < ((cyp) list).c; i++) {
                emv emvVar = (emv) list.get(i);
                for (int i2 = 0; i2 < emvVar.b.size(); i2++) {
                    SocketAddress socketAddress = (SocketAddress) emvVar.b.get(i2);
                    if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
                        if (bool == null) {
                            bool = false;
                        }
                        arrayList.add(new frj(emvVar.c, socketAddress));
                    } else {
                        if (bool == null) {
                            bool = true;
                        }
                        arrayList2.add(new frj(emvVar.c, socketAddress));
                    }
                }
            }
            listI = (bool == null || !bool.booleanValue()) ? i(arrayList, arrayList2) : i(arrayList2, arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < ((cyp) list).c; i3++) {
                emv emvVar2 = (emv) list.get(i3);
                for (int i4 = 0; i4 < emvVar2.b.size(); i4++) {
                    arrayList3.add(new frj(emvVar2.c, (SocketAddress) emvVar2.b.get(i4)));
                }
            }
            listI = arrayList3;
        }
        this.a = listI;
        d();
    }

    public final boolean f() {
        if (!g()) {
            return false;
        }
        this.b++;
        return g();
    }

    public final boolean g() {
        return this.b < this.a.size();
    }

    public final boolean h(SocketAddress socketAddress) {
        socketAddress.getClass();
        for (int i = 0; i < this.a.size(); i++) {
            if (((frj) this.a.get(i)).a.equals(socketAddress)) {
                this.b = i;
                return true;
            }
        }
        return false;
    }
}
