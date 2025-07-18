package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class edg implements egi {
    protected int memoizedHashCode = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void addAll(Iterable iterable, List list) {
        efn.d(iterable);
        if (iterable instanceof efw) {
            List listA = ((efw) iterable).a();
            efw efwVar = (efw) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (efwVar.size() - size) + " is null.";
                    int size2 = efwVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        efwVar.remove(size2);
                    }
                } else if (obj instanceof eea) {
                    efwVar.b();
                } else if (obj instanceof byte[]) {
                    eea.r((byte[]) obj);
                    efwVar.b();
                } else {
                    efwVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof egq) {
            list.addAll(iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = iterable.size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof egs) {
                egs egsVar = (egs) list;
                int size4 = list.size() + size3;
                int length = egsVar.b.length;
                if (size4 > length) {
                    if (length == 0) {
                        egsVar.b = new Object[Math.max(size4, 10)];
                    } else {
                        while (length < size4) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        egsVar.b = Arrays.copyOf(egsVar.b, length);
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    edf.v(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        int size6 = iterable.size();
        for (int i = 0; i < size6; i++) {
            Object obj3 = iterable.get(i);
            if (obj3 == null) {
                edf.v(list, size5);
            }
            list.add(obj3);
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getSerializedSize(egx egxVar) {
        throw null;
    }

    public ehg newUninitializedMessageException() {
        return new ehg();
    }

    @Override // defpackage.egi
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            eei eeiVarAf = eei.af(bArr);
            writeTo(eeiVarAf);
            eeiVarAf.ag();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // defpackage.egi
    public eea toByteString() {
        try {
            int serializedSize = getSerializedSize();
            eea eeaVar = eea.b;
            exo exoVar = new exo(serializedSize);
            writeTo((eei) exoVar.a);
            return exoVar.c();
        } catch (IOException e) {
            throw new RuntimeException(this.getSerializingExceptionMessage("ByteString"), e);
        }
    }

    @Override // defpackage.egi
    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        boolean z = eei.e;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        eef eefVar = new eef(outputStream, serializedSize);
        writeTo(eefVar);
        if (eefVar.c > 0) {
            eefVar.i();
        }
    }
}
