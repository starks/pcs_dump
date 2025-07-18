package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes2.dex */
final class w extends ZoneId {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    private final String b;
    private final transient j$.time.zone.e c;

    w(String str, j$.time.zone.e eVar) {
        this.b = str;
        this.c = eVar;
    }

    static w a0(String str, boolean z) {
        j$.time.zone.e eVarA;
        Objects.a(str, "zoneId");
        int length = str.length();
        if (length < 2) {
            throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            }
        }
        try {
            eVarA = j$.time.zone.i.a(str, true);
        } catch (j$.time.zone.f e) {
            if (z) {
                throw e;
            }
            eVarA = null;
        }
        return new w(str, eVarA);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.e V() {
        j$.time.zone.e eVar = this.c;
        return eVar != null ? eVar : j$.time.zone.i.a(this.b, false);
    }

    @Override // j$.time.ZoneId
    final void Z(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.b);
    }

    final void b0(DataOutput dataOutput) {
        dataOutput.writeUTF(this.b);
    }

    @Override // j$.time.ZoneId
    public final String o() {
        return this.b;
    }
}
