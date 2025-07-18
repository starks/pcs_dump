package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class air {
    final oc a;
    final oc b;
    final oc c;
    private final SparseIntArray d;
    private final Parcel e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public air(oc ocVar, oc ocVar2, oc ocVar3) {
        this.a = ocVar;
        this.b = ocVar2;
        this.c = ocVar3;
    }

    private final Class E(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    public final boolean A(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            Parcel parcel = this.e;
            int i3 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i3;
        }
        return this.k == i;
    }

    public final byte[] B() {
        int i = this.e.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.e.readByteArray(bArr);
        return bArr;
    }

    public final ais C(ais aisVar) {
        return !A(1) ? aisVar : c();
    }

    public final void D(ais aisVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        s(1);
        k(aisVar);
    }

    public final int a(int i, int i2) {
        return !A(i2) ? i : m();
    }

    public final Parcelable b(Parcelable parcelable, int i) {
        return !A(i) ? parcelable : n();
    }

    public final ais c() throws NoSuchMethodException, SecurityException {
        String strQ = q();
        if (strQ == null) {
            return null;
        }
        air airVarO = o();
        try {
            Method declaredMethod = (Method) this.a.get(strQ);
            if (declaredMethod == null) {
                declaredMethod = Class.forName(strQ, false, air.class.getClassLoader()).getDeclaredMethod("read", air.class);
                this.a.put(strQ, declaredMethod);
            }
            return (ais) declaredMethod.invoke(null, airVarO);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e4);
        }
    }

    public final CharSequence d(CharSequence charSequence, int i) {
        return !A(i) ? charSequence : p();
    }

    public final String e(String str, int i) {
        return !A(i) ? str : q();
    }

    public final void f(boolean z, int i) {
        s(i);
        t(z);
    }

    public final void g(CharSequence charSequence, int i) {
        s(i);
        v(charSequence);
    }

    public final void h(int i, int i2) {
        s(i2);
        w(i);
    }

    public final void i(Parcelable parcelable, int i) {
        s(i);
        x(parcelable);
    }

    public final void j(String str, int i) {
        s(i);
        y(str);
    }

    public final void k(ais aisVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (aisVar == null) {
            y(null);
            return;
        }
        try {
            y(E(aisVar.getClass()).getName());
            air airVarO = o();
            try {
                Class<?> cls = aisVar.getClass();
                Method declaredMethod = (Method) this.b.get(cls.getName());
                if (declaredMethod == null) {
                    declaredMethod = E(cls).getDeclaredMethod("write", cls, air.class);
                    this.b.put(cls.getName(), declaredMethod);
                }
                declaredMethod.invoke(null, aisVar, airVarO);
                airVarO.r();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(e4);
                }
                throw ((Error) cause);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(String.valueOf(aisVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e5);
        }
    }

    public final boolean l(boolean z, int i) {
        return !A(i) ? z : z();
    }

    public final int m() {
        return this.e.readInt();
    }

    public final Parcelable n() {
        return this.e.readParcelable(getClass().getClassLoader());
    }

    protected final air o() {
        int iDataPosition = this.e.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        int i2 = i;
        Parcel parcel = this.e;
        String str = this.h;
        return new air(parcel, iDataPosition, i2, String.valueOf(str).concat("  "), this.a, this.b, this.c);
    }

    protected final CharSequence p() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    public final String q() {
        return this.e.readString();
    }

    public final void r() {
        int i = this.i;
        if (i >= 0) {
            SparseIntArray sparseIntArray = this.d;
            Parcel parcel = this.e;
            int i2 = sparseIntArray.get(i);
            int iDataPosition = parcel.dataPosition();
            this.e.setDataPosition(i2);
            this.e.writeInt(iDataPosition - i2);
            this.e.setDataPosition(iDataPosition);
        }
    }

    public final void s(int i) {
        r();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        w(0);
        w(i);
    }

    public final void t(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    public final void u(byte[] bArr) {
        this.e.writeInt(bArr.length);
        this.e.writeByteArray(bArr);
    }

    protected final void v(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    public final void w(int i) {
        this.e.writeInt(i);
    }

    public final void x(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    public final void y(String str) {
        this.e.writeString(str);
    }

    public final boolean z() {
        return this.e.readInt() != 0;
    }

    public air(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new oc(), new oc(), new oc());
    }

    private air(Parcel parcel, int i, int i2, String str, oc ocVar, oc ocVar2, oc ocVar3) {
        this(ocVar, ocVar2, ocVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
