package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class d extends bf implements au {
    public final ax a;
    boolean b;
    int c;

    public d(ax axVar) {
        axVar.g();
        aj ajVar = axVar.l;
        if (ajVar != null) {
            ajVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = axVar;
    }

    final int a(boolean z, boolean z2) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (ax.X(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new bq());
            g("  ", printWriter);
            printWriter.close();
        }
        this.b = true;
        if (this.j) {
            this.c = this.a.h.getAndIncrement();
        } else {
            this.c = -1;
        }
        if (z2) {
            this.a.F(this, z);
        }
        return this.c;
    }

    @Override // defpackage.bf
    public final bf b(ab abVar) {
        ax axVar = abVar.z;
        if (axVar == null || axVar == this.a) {
            l(new be(3, abVar));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abVar.toString() + " is already attached to a FragmentManager.");
    }

    final void c(int i) {
        if (this.j) {
            if (ax.X(2)) {
                toString();
            }
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                be beVar = (be) this.d.get(i2);
                ab abVar = beVar.b;
                if (abVar != null) {
                    abVar.y += i;
                    if (ax.X(2)) {
                        Objects.toString(beVar.b);
                        int i3 = beVar.b.y;
                    }
                }
            }
        }
    }

    final void d() {
        int size = this.d.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            be beVar = (be) this.d.get(size);
            if (beVar.c) {
                int i = size - 1;
                if (beVar.a == 8) {
                    beVar.c = false;
                    this.d.remove(i);
                    size = i;
                } else {
                    int i2 = beVar.b.E;
                    beVar.a = 2;
                    beVar.c = false;
                    while (i >= 0) {
                        be beVar2 = (be) this.d.get(i);
                        if (beVar2.c && beVar2.b.E == i2) {
                            this.d.remove(i);
                            size--;
                        }
                        i--;
                    }
                }
            }
        }
    }

    @Override // defpackage.bf
    public final void e() {
        n();
        this.a.G(this, true);
    }

    @Override // defpackage.bf
    public final void f(int i, ab abVar, String str, int i2) {
        String str2 = abVar.V;
        if (str2 != null) {
            yb.a(abVar, str2);
        }
        Class<?> cls = abVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abVar.F;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abVar + ": was " + abVar.F + " now " + str);
            }
            abVar.F = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abVar + " with tag " + str + " to container view with no id");
            }
            int i3 = abVar.D;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abVar + ": was " + abVar.D + " now " + i);
            }
            abVar.D = i;
            abVar.E = i;
        }
        l(new be(i2, abVar));
        abVar.z = this.a;
    }

    public final void g(String str, PrintWriter printWriter) {
        h(str, printWriter, true);
    }

    public final void h(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (this.d.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            be beVar = (be) this.d.get(i);
            switch (beVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + beVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(beVar.b);
            if (z) {
                if (beVar.d != 0 || beVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(beVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(beVar.e));
                }
                if (beVar.f != 0 || beVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(beVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(beVar.g));
                }
            }
        }
    }

    @Override // defpackage.au
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        if (ax.X(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.j) {
            return true;
        }
        this.a.d.add(this);
        return true;
    }

    @Override // defpackage.bf
    public final void j() {
        a(false, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }
}
